FROM java:8

ADD common-api-1.0.0.jar common-api.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/common-api.jar"]