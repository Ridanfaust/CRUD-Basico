# CRUD-Basico

O projeto se trata de uma simples lista de filmes que dispõe das operações CRUD (Create, Read, Update, Delete).

Ao acessar o serviço, o usuário se depara com uma simples página de apresentação que o leva ao app, que por sua vez traz a lista de filmes carregada diretamente do banco de dados e tem a opção de incluir, editar ou deletar itens da mesma. Na página de adição/edição de item são apresentados os campos, destacando-se os obrigatórios que caso não sejam preenchidos retornam uma mensagem de erro. Caso todos os requisitos do objeto sejam preenchidos, o mesmo é validado e adicionado ao banco, retornando para a página principal já com a lista atualizada. No momento da exclusão, é questionado se o usuário deseja prosseguir ou não, tratando de forma correta a escolha.

Para o funcionamento do projeto de forma local, basta que o usuário tenha instalada pelo menos a versão 8 do JRE, um banco de dados postgreSQL e um IDE de sua preferência. O banco de dados utilizado foi o postgreSQL e as configurações relacionadas a isso se encontram no caminho /src/main/resources/application.properties.

Tendo em vista os requisitos apresentados para a conclusão do projeto, foram utilizadas as seguintes tecnologias:
- IDE Eclipse como ambiente de desenvolvimento;
- Java 8;
- HTML;
- Spring Boot 2.2.11;
- Spring MVC;
- Thymeleaf;
- Bootstrap 4 (4.5.2);
- Persistência com Hibernate e JPA;
- PostgreSQL;
- Versionamento com GitHub;

O link para acesso ao app através do HerokuApp é https://crud-filmes.herokuapp.com/

Atendendo portanto aos itens A*, B, C, D, E, F e J

*Sobre o requisito A:
Como o JSF estava como requisito mínimo e Spring MVC estava entre as demais opções para aplicação web, foi dada a preferência ao Spring MVC por ter a capacidade de realizar os mesmos objetivos, além de ter melhor integração com Spring Boot e Thymeleaf.


