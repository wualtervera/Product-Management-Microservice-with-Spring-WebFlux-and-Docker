# Product-Management-Microservice-with-Spring-WebFlux-and-Docker

### Sobre el proyecto

Este es un proyecto de Spring boot reactivo y MongoDB. 
En el proyecto se implementa un Api Rest full de gestión de productos.


### Objetivo del proyecto

El objetivo del proyecto es desplegar todo en contenedores de docker
utilizando docker-compose para orquestar dichos contenedores y 
Dokerfile para definir la imagen de nuestra aplicación.


### Teconologías utilizadas

- Spring boot v3.2.1
- Spring WebFlux
- MongoDB
- Docker
- Java 17.0.9
- Maven 3.9.6


### Ejecución

Para ejecutar el proyecto se debe instalar Docker, luego clonar
el proyecto y ejecutar los siguientes comandos:

- mvn clean install
- docker-compose up -d
