## Descripción

Backend desarrollado con **Java y Spring Boot** que implementa una **API REST** para la gestión de reservas en un entorno multiusuario.
La aplicación incluye autenticación y autorización mediante **Spring Security y JWT**, control de roles (USER / ADMIN) y un sistema de reservas con validación de solapamientos temporales.

El proyecto sigue una arquitectura en capas y aplica buenas prácticas como el uso de DTOs, manejo centralizado de excepciones y separación de responsabilidades, simulando el desarrollo de una aplicación backend utilizada en un entorno empresarial real.

Este proyecto puede integrarse con un frontend desarrollado en React u otra tecnología cliente que consuma la API REST.


## Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL
- JWT
- Lombok
- Maven


## Funcionalidades

- Registro de usuarios
- Autenticación mediante JWT
- Gestión de roles (USER / ADMIN)
- Creación, consulta y cancelación de reservas
- Validación de solapamientos en reservas
- Protección de endpoints según rol
- Manejo centralizado de errores


## Arquitectura

El proyecto sigue una arquitectura en capas:

- **Controller**: expone los endpoints REST
- **Service**: contiene la lógica de negocio
- **Repository**: acceso a datos mediante JPA
- **DTOs**: separación entre entidades y datos expuestos
- **Security**: configuración de autenticación y autorización


## Endpoints principales

### Autenticación
- `POST /api/auth/register`
- `POST /api/auth/login`

### Reservas
- `GET /api/reservas`
- `POST /api/reservas`
- `DELETE /api/reservas/{id}`


## Configuración y ejecución

1. Clonar el repositorio
2. Configurar la base de datos MySQL en `application.yml`
3. Crear una base de datos llamada `reservas`
4. Ejecutar la aplicación

La aplicación se ejecuta por defecto en `http://localhost:8080`


## Base de datos

- MySQL
- ORM: Hibernate (JPA)
- Las tablas se generan automáticamente al iniciar la aplicación


## Mejoras futuras

- Integración con frontend en React
- Tests unitarios e integración
- Dockerización del proyecto
- Paginación y filtros en listados
- Sistema de notificaciones por email
