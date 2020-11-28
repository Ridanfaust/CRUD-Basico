package br.com.listadefilmes.filmes.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.listadefilmes.filmes.domain.Filmes;
import br.com.listadefilmes.filmes.service.FilmesService;

@Controller // Usando a anotação do Spring para definir a classe como Controller.
@RequestMapping("/filmes")
public class FilmesController {

	@Autowired // Cria uma instância do serviço assim que o controlador for chamado.
	private FilmesService crud;

	// Mapeamentos Spring
	@GetMapping // O primeiro mapeamento é utilizado para chamar a página principal do app.
	public ModelAndView findAll() {
		ModelAndView view = new ModelAndView("main");
		return view.addObject("filmes", crud.findAll());
	}

	@GetMapping("/addfilme")
	public ModelAndView addFilme(Filmes filme) {
		ModelAndView view = new ModelAndView("addfilme");
		return view.addObject("filme", filme);
	}

	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {
		return addFilme(crud.findFilme(id));
	}

	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		crud.deleteFilme(id);
		// Redireciona a URL após a operação.
		return new ModelAndView("redirect:/filmes");
	}

	@PostMapping("/save")
	public ModelAndView save(@Valid @ModelAttribute("filme") Filmes filme, BindingResult result) {
		// Aqui é realizada a validação do objeto para permitir que seja salvo corretamente.
		if (result.hasErrors()) {
			return addFilme(filme);
		}
		crud.save(filme);
		// Redireciona a URL após a operação.
		return new ModelAndView("redirect:/filmes");
	}

}
