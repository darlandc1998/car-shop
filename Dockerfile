FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/*.war
ADD ${JAR_FILE} app.war
ENTRYPOINT ["java","-jar","/app.war"]