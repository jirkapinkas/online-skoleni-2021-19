Jak dockerizovat Spring Boot aplikaci:

Priklad na build docker image + push do registry:
- https://gitlab.com/jirkapinkas/micro-products/-/blob/main/pom.xml

  mvn clean compile com.google.cloud.tools:jib-maven-plugin:2.2.0:build -B -Djib.to.auth.username=TODO_USER -Djib.to.auth.password=TODO_PASS
  NEBO:
  mvn -DregistryUsername=TODO_USER -DregistryPassword=TODO_PASS clean spring-boot:build-image


- Hello World:
  - mvn spring-boot:build-image
    - Ulozi vyslednou image jako lokalni image 
    - POZOR!!! HODNE OMEZENE!!!
- Co se obycejne v dnesni dobe pouziva:
  - mvn compile jib:build
    - JIB plugin VZDY provede build image & push do registry
- Co by se dalo pouzit, ale nedoporucuji:
  - Vytvorit Dockerfile
  - Build app + copy JAR do Docker image
    - mvn package
    - docker build --tag nazev_image .
  - Push do registry (optional)
    - docker push nazev_image
  
PRIKLAD 1 (Pomoci Dockerfile):

  mvn clean package
  docker build --tag eshopweb .
  docker images
  docker run --rm -it -p 8080:8080 eshopweb
  
PRIKLAD 2 (bez Dockerfile):

  mvn clean spring-boot:build-image
  docker run --rm -it -p 8080:8080 eshop-web:0.0.1-SNAPSHOT

Spring Boot & Docker tutorial:

- https://spring.io/guides/topicals/spring-boot-docker/