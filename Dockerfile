FROM openjdk:8
WORKDIR /app
COPY target/car-shop.war /app/app.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.war"]