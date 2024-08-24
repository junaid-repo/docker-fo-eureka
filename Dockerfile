FROM openjdk:17
ADD target/docker-fo-eurekaserver-0.0.1-SNAPSHOT.jar fo-eurekaServer-1.0.0.jar
EXPOSE 8761
ENTRYPOINT [ "java", "-jar", "fo-eurekaServer-1.0.0.jar" ]