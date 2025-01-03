This repository contains a Java Spring Boot project built with Maven. It is intended to be used as a reference only and
should not be copied in any form. The project includes various components and functionality related
to [insert specific details of project here]. Please feel free to browse the code and use it as a resource for learning,
but do not use it for any other purposes. Thank you for respecting the terms of this repository.

### Technology used or expect to use :V

* Spring Boot
* Spring Data JPA (Hibernate)
* Thyemeleaf template engine
* Bootstrap 5
* H2 Database (Store in file)
* Maven (for dependency management)
* Java 17
* IntelliJ IDEA for development
* Git and GitHub (for version control)
* GitHub Desktop (for pushing to GitHub)
* Heroku (for deployment)
* Postman (for testing)

### First Of all:

- Go to application.properties and config your port and database connection.
- Insert new row in database via data.sql in resources folder.

#Thymeleaf
To use ThymeLeaf Engine => remember add this before every html file

```
<!DOCTYPE html>
<html lang="vi"
      xmlns:th="http://www.thymeleaf.org">
```

------------------
##Codeing Convention
Follow the structure of this project

Change/Modify header bar ? => Go to resources/templates/fragments/header.html

Change/Modify footer bar ? => Go to resources/templates/fragments/footer.html

POST method? -> @PostMapping("/url") in controller, and add form action with method="POST" and th:action="@{/url}"


-------------------
FAQ:

- How to add new page ?

1. Create new html file in resources/templates
2. Add new link in header.html
3. Add new Mapping in controller

- What "th:..." in html file mean ?

1. th:text => display text
2. th:href => link to another page
3. th:src => display image
4. th:each => loop
5. Many and many more, you can find it in Thymeleaf document or Stackoverflow

- I dont want to use H2 database, how to change to MySQL ?

1. Go to application.properties and change to your database connection
2. Go to pom.xml and remove H2 dependency and add MySQL dependency
3. Go to data.sql and remove all data
4. Run project and it will create new table in your database
5. Insert new data via Postman or other tools
6. Done


- I dont want to use Thymeleaf, how to change to JSP ?

1. Change pom.xml
2. Change application.properties
3. Change controller
4. Change html file to JSP file
5. Change all th: to jsp:tag
6. Change all ${} to <%= %>
7. Change all @{} to <%= %>

- So hard to understand, can you give me an help me code ?

1. NO
2. NO
3. NO
4. Repeating something three times can help to emphasize its importance

--------------The most important thing----------------

### How to run this Spring boot project ?

#### 1. Run with IntelliJ IDEA (Recommended)

1. Open project with IntelliJ IDEA
2. Run project
3. Open browser and go to localhost:8081
4. Enjoy it

#### 2. Run with Maven

1. Open terminal
2. Go to project folder
3. Run command: mvn spring-boot:run (after install maven)
4. Open browser and go to localhost:8081
5. Enjoy it

#### 3. Run with Spring Tools 4 for Visual Studio Code or Eclipse

1. Open project with Spring Tools 4 for Visual Studio Code or Eclipse
2. Run project (Do it yourself)
3. Open browser and go to localhost:8081
4. Enjoy it

#### 4. Run with Docker

1. Open terminal
2. Go to project folder
3. Run command: docker build -t demo .
4. Run command: docker run -p 8081:8081 demo
5. Open browser and go to localhost:8081
6. Enjoy it

#### 5. Run with Docker Compose

1. Open terminal
2. Press ```./mvnw clean package -DskipTests ``` to build project and get jar file.
3. get file .jar in target folder and copy to folder docker have docker-compose.yml
4. Run command: ```docker-compose up -d```
5. Open browser and go to [localhost:8081](http://localhost:8081)