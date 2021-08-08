package com.syrisa.caesarencrypt;

public class CaesarEncryption implements Caesar {
    private final char[] turkishAlphabet = {'ğ', 'ı', 'ü', 'ö', 'ç', 'ş', 'Ğ', 'Ü', 'Ö', 'Ç', 'Ş'};
    private final char[] latinAlphabet = {'g', 'i', 'u', 'o', 'c', 's', 'G', 'U', 'O', 'C', 'S'};

    @Override
    public String unnecessaryCharacterRemove(String sentence) {
        return sentence.toLowerCase().replaceAll("[^a-z]", "");
    }

    @Override
    public String convertTurkishAlphabetsToLatinAlphabet(String sentence) {
        for (int i = 0; i < latinAlphabet.length; i++) {
            sentence = sentence.replace(turkishAlphabet[i], latinAlphabet[i]);
        }
        return sentence;
    }

    SentenceEncrypt sentenceEncrypt = sentence -> {
        StringBuilder encryptedSentence = new StringBuilder();
        System.out.println("Sentence to Encrypt : " + sentence);
        for (int i = 0; i < sentence.length(); i++) {
            if (String.valueOf(sentence.charAt(i)).matches("[a-z&&[^xyz]]"))
                encryptedSentence.append((char) (sentence.charAt(i) + 3));
            else if (String.valueOf(sentence.charAt(i)).matches("x")) encryptedSentence.append("a");
            else if (String.valueOf(sentence.charAt(i)).matches("y")) encryptedSentence.append("b");
            else if (String.valueOf(sentence.charAt(i)).matches("z")) encryptedSentence.append("c");
        }
        return String.valueOf(encryptedSentence);
    };
}
