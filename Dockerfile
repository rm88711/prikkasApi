FROM eclipse-temurin
EXPOSE 8080
ADD target/prikkas-0.0.1-SNAPSHOT.jar prikkas.jar
ENTRYPOINT [ "java", "-jar", "prikkas.jar" ]
