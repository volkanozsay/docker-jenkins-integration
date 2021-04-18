FROM java:8-jdk-alpine
EXPOSE 8080
ADD target/docker-jenkins-integration.jar docker-jenkins-integration.jar
ENTRYPOINT["java", "-jar","/docker-jenkins-integration.jar"]