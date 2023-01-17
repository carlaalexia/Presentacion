FROM openjdk:19
COPY target/MiPresentacion-0.0.1-SNAPSHOT.jar presentacion.jar
ENTRYPOINT ["java","-jar","/presentacion.jar"]