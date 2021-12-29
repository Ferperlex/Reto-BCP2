FROM openjdk:8-jre-alpine

COPY Reto-BCP1-0.0.1-SNAPSHOT.jar /Reto-BCP1.war

CMD ["/usr/bin/java", "-jar", "/Reto-BCP1.war"]