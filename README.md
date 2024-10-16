API REST PARA GERENCIAMENTO DE CURRÍCULOS

Este projeto é uma API RESTful desenvolvida em Java com Spring Boot, que tem como objetivo gerenciar currículos de candidatos para diferentes vagas de emprego. Ele permite realizar operações de CRUD (Criar, Ler, Atualizar e Deletar) sobre candidatos. A aplicação segue uma arquitetura de camadas, utilizando DTOs, Repositories, Services e Controllers para manter a separação de responsabilidades e garantir uma melhor manutenção do código.

1 - Clone este repositório:
bash
git clone https://github.com/usuario/exemplo-api-curriculo.git

2 - Configure o banco de dados PostgreSQL:

 Crie um banco de dados chamado curriculo_db.
 Atualize o arquivo application.properties com suas credenciais:

spring.datasource.url=jdbc:postgresql://localhost:5432/curriculo_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

3 - Execute a aplicação com sua IDE ou usando o Maven:

bash
mvn spring-boot:run
Acesse a API via Postman ou navegador na URL: http://localhost:8080/processos

Autor
Nome: Samuel Teldison
E-mail: hometeldison@gmail.com || teldisonnn@gmail.com

Todo o projeto foi feito de forma acadêmica e para fins de conclusão do projeto final.
