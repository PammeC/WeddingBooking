FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/photography-service-0.0.1.jar
COPY ${JAR_FILE} update-photography-service.jar
COPY .env .env
EXPOSE 8053
ENTRYPOINT ["java","-jar","update-photography-service.jar"]