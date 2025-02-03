FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/decoration-service-0.0.1.jar
COPY ${JAR_FILE} create-decoration-service.jar
COPY .env .env
EXPOSE 8041
ENTRYPOINT ["java","-jar","create-decoration-service.jar"]

