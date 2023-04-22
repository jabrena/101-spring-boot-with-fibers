FROM openjdk:21-ea-19-jdk-oraclelinux8

COPY ./target/service-0.1.0-SNAPSHOT.jar service.jar
ENTRYPOINT ["java", "-jar", "service.jar"]