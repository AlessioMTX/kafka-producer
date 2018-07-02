FROM openjdk:8-jre
MAINTAINER David Flemström <dflemstr@spotify.com>

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]

ADD target/lib           /usr/share/myservice/lib
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/myservice/myservice.jar