# Use a multi-stage build to compile the application
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Use the openjdk image to run the application
FROM openjdk:17-jdk-slim
WORKDIR /oci-microservice-A00227463
COPY --from=build /build/target/*.jar oci-microservice-A00227463.jar
COPY src/main/resources/wallet /oci-microservice-A00227463/Wallet_javadev103
ENV TNS_ADMIN=/oci-microservice-A00227463/Wallet_javadev103
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "oci-microservice-A00227463.jar" ]