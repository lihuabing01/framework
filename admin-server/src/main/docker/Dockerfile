FROM java:8

ADD admin-server-1.0.0.jar admin-server.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/admin-server.jar"]