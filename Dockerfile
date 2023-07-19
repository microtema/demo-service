FROM openjdk:17-alpine

COPY ./target/*.jar /app.jar

USER 1001

EXPOSE 8080

ENV SERVER_PORT=8080

CMD [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
