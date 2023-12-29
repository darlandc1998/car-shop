FROM openjdk:8
EXPOSE 8080
COPY target/car-shop.war app.war
ENTRYPOINT ["java","-jar","/app.war"]