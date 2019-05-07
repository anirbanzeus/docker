FROM maven:3.5-jdk-8
ADD target/MyCiCdAssignment-0.0.1-SNAPSHOT.jar MyCiCdAssignment-0.0.1-SNAPSHOT.jar
##ENTRYPOINT ["java","-Dspring.profiles.active=container","jar","MyCiCdAssignment-0.0.1-SNAPSHOT.jar","container-entrypoint"]
EXPOSE 8080
CMD java - jar MyCiCdAssignment-0.0.1-SNAPSHOT.jar
