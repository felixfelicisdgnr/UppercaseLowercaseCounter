package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxCharCount = Service.maxCharCount(scanner);
        String sentence = Service.enterSentence(scanner, maxCharCount);
        boolean caseSensitive = Service.uppercaseLowercaseCheck(scanner);
        char character = Service.oneCharacterCheck(scanner);

        int count = Service.repeatedCharacterCount(sentence, character, caseSensitive);
        System.out.println("Girilen cümlede '" + character + "' harfi toplamda " + count + " defa geçmektedir.");

    }
}
