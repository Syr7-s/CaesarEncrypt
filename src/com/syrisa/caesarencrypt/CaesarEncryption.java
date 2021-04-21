package com.syrisa.caesarencrypt;

public class CaesarEncryption implements Caesar {
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

    SentenceEncrypt sentenceEncrypt = sentence -> {
        StringBuilder encryptedSentence = new StringBuilder();
        System.out.println("Sentence to Encrypt : " + sentence);
        for (int i = 0; i < sentence.length(); i++) {
            if (String.valueOf(sentence.charAt(i)).matches("[a-z&&[^xyz]]"))
                encryptedSentence.append((char) (int) (sentence.charAt(i) + 3));
            else if (String.valueOf(sentence.charAt(i)).matches("x")) encryptedSentence.append("a");
            else if (String.valueOf(sentence.charAt(i)).matches("y")) encryptedSentence.append("b");
            else if (String.valueOf(sentence.charAt(i)).matches("z")) encryptedSentence.append("z");
        }
        return String.valueOf(encryptedSentence);
    };
}
