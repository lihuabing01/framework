FROM java:8

ADD eureka-server-1.0.0.jar eurekaserver.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eurekaserver.jar"]