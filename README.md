# H2
### Hayden Esteban Cristancho Pinzón

Para iniciar agregamos las siguientes dependencias

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

Despues de esto actualizamos el application.properties

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.h2.console.settings.trace=false
spring.h2.console.settings.web-allow-others=false
```

En aplication.properties, agregamos las siguientes lines

```
springdoc.swagger-ui.path=/swagger-ui.html
springdoc.api-docs.path=/api-docs
```

Creamos el archivo data.sql

```
INSERT INTO countries (id, name) VALUES (1, 'USA');
INSERT INTO countries (id, name) VALUES (2, 'France');
INSERT INTO countries (id, name) VALUES (3, 'Brazil');
INSERT INTO countries (id, name) VALUES (4, 'Italy');
INSERT INTO countries (id, name) VALUES (5, 'Canada');
```

Creamos la entidad de la tabla countries y ejecutamos el proyecto.
Hecho esto, ya podemos acceder por medio de este link y verificar los datos agregados

 * [h2](http://localhost:8080/h2-console).
 ```
http://localhost:8080/h2-console
 ```
 ![image](https://user-images.githubusercontent.com/90571387/220000978-ff7e0af2-9dee-4943-b652-f6e3213a1070.jpg)
 ![image](https://user-images.githubusercontent.com/90571387/220001033-cca124c4-6b17-437a-a79e-65caf13cc4e6.jpg)
