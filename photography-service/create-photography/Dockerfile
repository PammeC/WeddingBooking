FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/photography-service-0.0.1.jar
COPY ${JAR_FILE} create-photography-service.jar
COPY .env .env
EXPOSE 8051
ENTRYPOINT ["java","-jar","create-photography-service.jar"]