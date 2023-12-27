FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ENTRYPOINT ["java","-jar","/car-shop.war"]