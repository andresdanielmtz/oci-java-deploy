FROM openjdk:17-jdk-slim
WORKDIR /oci-microservice-A00227463
COPY /target/*.jar oci-microservice-A00227463.jar
COPY /src/main/resources/wallet /oci-microservice-A00227463/Wallet_javadev103
ENV TNS_ADMIN=/oci-microservice-A00227463/Wallet_javadev103
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "oci-microservice-A00227463.jar" ]