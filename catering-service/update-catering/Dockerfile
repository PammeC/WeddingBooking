FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/catering-service-0.0.1.jar
COPY ${JAR_FILE} update-catering-service.jar
COPY .env .env
EXPOSE 8073
ENTRYPOINT ["java","-jar","update-catering-service.jar"]