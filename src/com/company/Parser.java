package com.company;
    public class Parser {
        private String[] parsedSentence;
        private char firstCharacter;
        private String lastCharacter;
        private long distinctCharacterCount;
        private String middleCharacters;
        private String parsedSentenceString;


        public void setSentence(String sentence) {
            String[] arrOfStr = sentence.split("\s");
            parsedSentence = arrOfStr;
        }


        public void getFinalSentence() {
            for (int i = 0; i < parsedSentence.length; i++) {
                this.parsedSentenceString = parsedSentence[i];


                if (parsedSentenceString.length() > 2) {
                    this.middleCharacters = parsedSentenceString.substring(1, parsedSentenceString.length() - 1);
                }


                if (parsedSentenceString.length() == 1) {
                    this.firstCharacter = parsedSentenceString.charAt(0);
                    System.out.printf("%c ", firstCharacter);
                }
                if (parsedSentenceString.length() == 2) {
                    this.lastCharacter = parsedSentenceString.substring(parsedSentenceString.length() - 1);
                    System.out.printf("%c%s ", firstCharacter, lastCharacter);
                 }

                if (parsedSentenceString.length() > 2) {
                    this.firstCharacter = parsedSentenceString.charAt(0);
                    this.lastCharacter = parsedSentenceString.substring(parsedSentenceString.length() - 1);
                    this.distinctCharacterCount = middleCharacters.chars().distinct().count();
                    System.out.printf("%c%d%s ", firstCharacter, distinctCharacterCount, lastCharacter);
                    }

                }
            }
        }