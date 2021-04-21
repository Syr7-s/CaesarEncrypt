package com.syrisa.caesarencrypt;

public class CaesarEncryption implements Caesar {
    private int sentenceLength;
    private char[] turkishAlphabet = {'ğ', 'ı', 'ü', 'ö', 'ç', 'ş'};
    private char[] latinAlphabet = {'g', 'i', 'u', 'u', 'o', 'c', 's'};

    @Override
    public String unnecessaryCharacterRemove(String sentence) {
        return sentence.toLowerCase().replaceAll("['a-z]", "");
    }

    @Override
    public String convertTurkishAlphabetsToLatinAlphabet(String sentence) {
        for (int i = 0; i < latinAlphabet.length; i++) {
            sentence = sentence.replace(turkishAlphabet[i], latinAlphabet[i]);
        }
        return null;
    }
}
