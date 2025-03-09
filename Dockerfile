FROM openjdk:17-jdk-slim
WORKDIR /oci-microservice-A00227463
COPY /target/*.jar oci-microservice-A00227463.jar
COPY /src/main/resources/Wallet_javadev101 /oci-microservice-A00227463/Wallet_javadev101
ENV TNS_ADMIN=/oci-microservice-A00227463/Wallet_javadev101
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "oci-microservice-<your student id>.jar" ]