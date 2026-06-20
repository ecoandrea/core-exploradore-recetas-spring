🍲 Proyecto RecetasApp (Spring Boot + JSP)
📌 Descripción

Aplicación web desarrollada con Spring Boot + MVC + JSP, que permite visualizar recetas y sus ingredientes almacenados en memoria mediante un HashMap.

El proyecto permite:

Listar recetas
Ver el detalle de una receta
Mostrar ingredientes
Manejar mensaje cuando la receta no existe
⚙️ Tecnologías utilizadas
Java 25
Spring Boot
Spring MVC
JSP (Java Server Pages)
JSTL
Apache Tomcat embebido
Maven

📁 Estructura del proyecto
src/main/java
└── com.cristina.demo
    ├── controladores
    │   └── ControladorRecetas.java
    └── RecetasApplication.java

src/main/webapp
└── WEB-INF
    └── views
        ├── recetas.jsp
        └── detalleReceta.jsp
        
📦 Dependencias (pom.xml)

📌 Archivo agregados pom.xml


🔹 JSP (compilador de vistas)
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>

✔ Permite ejecutar archivos .jsp dentro de Spring Boot.

🔹 JSTL (etiquetas JSP)
<dependency>
    <groupId>jakarta.servlet.jsp.jstl</groupId>
    <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
</dependency>

<dependency>
    <groupId>org.glassfish.web</groupId>
    <artifactId>jakarta.servlet.jsp.jstl</artifactId>
</dependency>

✔ Permite usar etiquetas como:

<c:forEach>
<c:if>

⚙️ Configuración de vistas JSP

📌 Archivo: src/main/resources/application.properties

spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=
📂 Ubicación de los JSP

Los archivos deben estar en:

src/main/webapp/WEB-INF/

Archivos usados:

recetas.jsp
detalleReceta.jsp
