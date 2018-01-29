# autocomplete_springboot
This project integrates spring boot with front end client to create autocomplete webpage.

Steps to run this application

1) Download PostgresSQL from official webpage. https://www.postgresql.org/download/
2) Create a database with name springbootdb. No credentials is needed.
   For macintosh : Go to your Application. Go to Postgress.app, head to contents/version/10/bin.
   Open a Terminal, run this command to create database : createdb -h localhost -p 5432 -U postgres springbootdb
3) Checkout the project from github.
4) Make sure Maven is installed. You need Maven to download SpringBoot and Hibernate dependencies.
5) Run mvn spring-boot:run. This command will download all the necessary dependencies, extract JSON data, insert to database and start the application.
6) Open browser, go http://localhost:8080/autocomplete.
7) You should be able to see the field for autocomplete.