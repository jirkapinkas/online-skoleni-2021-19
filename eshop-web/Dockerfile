FROM eclipse-temurin:8-jre
WORKDIR /app/
COPY files/bobik.jpg files/bobik.jpg
COPY files/cica.jpg files/cica.jpg
COPY target/eshop-web-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]