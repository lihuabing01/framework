FROM java:8

ADD /api-gateway-1.0.0.jar api-gateway.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api-gateway.jar"]