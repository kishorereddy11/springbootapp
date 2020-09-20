FROM openjdk:8
EXPOSE 9292
ADD target/springbootapp.jar springbootapp.jar
ENTRYPOINT ["java","-jar","/springbootapp.jar"]
