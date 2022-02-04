# SOFKA-U cantera nivel 2

## semana 1 - taller 2

[![N|Solid](https://bochackathon.com/wp-content/uploads/2019/07/java.png)](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://github.com/ing-italog?tab=repositories)

Esta aplicación permite crear 4 tipos de naves diferentes, 2 naves tripuladas(grande y pequeña) y 2 lanzaderas(grande y pequeña), cada nave cuenta con atributos y métodos ligeramente diferentes.

### Ejecución

Version java 15.

Para correcta ejecución se recomienda abrir desde  el IDE [Eclipse](https://www.eclipse.org/downloads/), ya que este IDE cuenta con una instalación automatica de las librerias necesarias al momento de importa el código, también puedes seguir las siguientes instrucciones para un correcto funcionanmiento.

- Descagar el archivo .ZIP y descomprimirlo en una carpeta de fácil acceso.
- En eclipse seleccionar `File`, seguido seleccionar `Open Projects from File System`
- Seleccionar `Import source:` marcar `Directory...`
- Buscar la carpeta descomprimida y marcar `Select Folder`
- Dar enter en `Import`
- Eclipse automaticamente instalara las librerias necesarias para una correcta ejecución.

En caso de no poder ejercutar el proyecto correctamente, también recomienda crear un proyecto nuevo y anexar la carpeta `src`.

### Paquetes

- [src] - Contiene los paquetes `Controllers`, `app.commons`, `app.entity.manned`, `app.entity.unmanned` y `app.services`
- [Controllers]  - Contiene la clase principal la cual es la encarga de ejecutar el programa y llamar a la clase de servicio.
- [app.commons] - Contiene una clase abstracta de tipo Nave.
- [app.entity.manned] - Contiene dos clases de tipo nave tripulada, una nave grande y una nave pequeña.
- [app.entity.unmanned] - Contiene dos clases de tipo nave lanzadera, una nave grande y una nave pequeña.
- [app.services] - Contiene una interfaz con los métodos para crear los 4 tipos de naves, también contiene una clase de servicios que implementa los métodos de la interfaz.
