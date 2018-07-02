FROM openjdk:8-jdk-alpine
WORKDIR /usr/local
COPY ./target/service-discovery-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/usr/local/app.jar"]