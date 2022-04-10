#FROM openjdk:latest
FROM openjdk:jdk-alpine
MAINTAINER ISA SAYAR <isa.sayar1725@gmail.com>
ADD out/production/CaesarEncrypt/com/syrisa/caesarencrypt/CaesarEncrypt.jar CaesarEncrypt.jar
#COPY out/production/CaesarEncrypt/com/syrisa/caesarencrypt/CaesarEncrypt.jar /caesar/
ENTRYPOINT ["java","-jar","CaesarEncrypt.jar"]
