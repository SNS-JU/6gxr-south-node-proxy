FROM openjdk:22-jdk-slim
WORKDIR /6gxr-south-node-proxy
COPY target/sn-proxy-1.0.3.jar sn-proxy.jar
EXPOSE 8081
CMD ["java", "-jar", "sn-proxy.jar"]