FROM openjdk:latest
ADD out/production/CaesarEncrypt/com/syrisa/caesarencrypt/CaesarEncrypt.jar CaesarEncrypt.jar
ENTRYPOINT ["java","-jar","CaesarEncrypt.jar"]
