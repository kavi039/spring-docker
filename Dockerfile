#FROM openjdk:17
#WORKDIR /appContainer
#COPY target/spring-docker-0.0.1-SNAPSHOT.jar /appContainer/app.jar
#EXPOSE 9090
#CMD ["java", "-jar", "app.jar"]

FROM openjdk:17

WORKDIR /myapp

COPY ./target/spring-docker-0.0.1-SNAPSHOT.jar /myapp/app.jar

COPY entrypoint.sh /myapp/entrypoint.sh

RUN chmod +x /myapp/entrypoint.sh

ENTRYPOINT ["/myapp/entrypoint.sh"]

EXPOSE 9090

CMD ["java", "-jar","app.jar"]