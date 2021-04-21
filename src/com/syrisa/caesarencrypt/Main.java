package com.syrisa.caesarencrypt;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter Sentence : ");
        String sentence = new CaesarEncryption().message();
        System.out.println("Encrypted Sentence : "+
                new CaesarEncryption()
                .sentenceEncrypt
                .encryptedSentence(new CaesarEncryption()
                        .unnecessaryCharacterRemove(new CaesarEncryption()
                                .convertTurkishAlphabetsToLatinAlphabet(sentence))));
    }
}
