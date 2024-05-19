# Web-API-de-Libro

**1) Inicialización el proyecto.**

Al dar inicio al proyecto, la interfaz de usuario de Spring Initializr me resultó novedosa al principio. Para comenzar, se utilizará la herramienta Spring Initializr para generar un nuevo proyecto Spring Boot.
- **Web:** Esta dependencia proporciona las funcionalidades básicas para crear una aplicación web Spring MVC.

**2) Creación de la entidad Libro.**

En el paquete com.tuuniversidad.Model, se crea una clase llamada Libro que representa la entidad principal de la aplicación. Esta clase debe tener los siguientes atributos:
- id.
- titulo.
- autor.
- editorial.
- anioPublicación.
  

**3) Creación del Repositorio.**

En el paquete com.tuuniversidad.repository, se crea una interfaz llamada LibroRepository que extiende de la interfaz JpaRepository y define los métodos para realizar operaciones CRUD sobre la entidad Libro.


**4) Creación de servicios.**

En el paquete com.tuuniversidad.service, se crea una clase llamada LibroService que encapsula la lógica de negocio relacionada con la entidad Libro. Esta clase debe inyectar una instancia de la interfaz LibroRepository y definir los métodos para realizar las operaciones deseadas sobre los libros.


**5) Creación del controlador.**

En el paquete com.tuuniversidad.controllers, se crea una clase llamada LibroController que define los endpoints REST para realizar las operaciones sobre los libros. Esta clase debe inyectar una instancia de la clase LibroService y utilizar los métodos de esta clase para implementar la lógica de los endpoints.

**By: Carlos Alexander Araujo Guaiña**
