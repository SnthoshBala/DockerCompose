FROM openjdk:latest AS builder
ADD target/m1.jar m1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","m1.jar"]