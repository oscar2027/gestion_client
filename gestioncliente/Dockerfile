FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/gestion-cliente-backend-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_cliente.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app_cliente.jar"]