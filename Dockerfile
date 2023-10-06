FROM openjdk:17
LABEL authors="jmirandac"
ARG JAR_FILE=target/DemoApp.jar
COPY $JAR_FILE DemoApp.jar

ENTRYPOINT ["java","-jar", "DemoApp.jar"]