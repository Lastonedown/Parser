package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence to parse and display number of middle distinct characters");
        String userInput = scanner.nextLine();
        Parser sentence = new Parser();

        sentence.setSentence(userInput);
        sentence.getFinalSentence();
    }
}
