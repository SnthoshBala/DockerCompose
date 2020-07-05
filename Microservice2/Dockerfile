FROM openjdk:latest AS builder
ADD target/m2.jar m2.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","m2.jar"]