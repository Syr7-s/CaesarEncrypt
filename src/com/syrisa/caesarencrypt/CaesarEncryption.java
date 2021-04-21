package com.syrisa.caesarencrypt;

public class CaesarEncryption implements Caesar{
    private int sentenceLength;
    private char[] turkishAlphabet = {'ğ', 'ı', 'ü', 'ö', 'ç', 'ş'};
    private char[] latinAlphabet = {'g', 'i', 'u', 'u', 'o', 'c', 's'};

    @Override
    public String unnecessaryCharacterRemove(String sentence) {
        return null;
    }

    @Override
    public String convertTurkishAlphabetsToLatinAlphabet(String message) {
        return null;
    }
}
