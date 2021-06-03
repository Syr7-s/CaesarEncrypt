# Caesar Encrypt

 - docker image build -f Dockerfile -t caesar-encrypt .
 - docker container run -d -it --name caesar-con caesar-encrypt
 - docker exec -it caesar-con bash
 - java -jar CaesarEncrypt.jar