FROM openjdk:8-jdk-alpine

MAINTAINER Emin Yilmaz <eminy.1526@gmail.com>
EXPOSE 8080
ADD target/loanapplication-0.0.1.jar loanapplication.jar

ENTRYPOINT ["java","-jar","loanapplication.jar"]