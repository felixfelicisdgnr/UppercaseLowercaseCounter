package org.example;

import java.util.Scanner;

public class Service {
    public static int maxCharCount(Scanner scanner) {
        int maxCharCount;
        while (true) {
            System.out.print("Maksimum karakter sayısını belirleyin: ");
            if (scanner.hasNextInt() && scanner.nextInt() > 0) {
                maxCharCount = scanner.nextInt();

                break;
            } else {
                System.out.println("Lütfen geçerli bir sayı girin.");
                scanner.nextLine();  // hatalı girişi temizlemek için
            }
        }
        return maxCharCount;
    }

    public static String enterSentence(Scanner scanner, int maxCharCount) {
        scanner.nextLine();
        String sentence;
        while (true) {
            System.out.print("Lütfen bir cümle girin: ");
            sentence = scanner.nextLine();

            if (sentence.isEmpty()) {
                System.out.println("Boş bir cümle girmeyiniz.");
                continue;
            }

            String withoutSpaces = sentence.replace(" ", ""); // Boşlukları saymadan karakter sayısını hesapla
            if (withoutSpaces.length() <= maxCharCount) {
                break;
            } else {
                System.out.println("Cümle karakter limitini aşıyor. Lütfen yeniden giriniz.");
            }
        }
        return sentence;
    }

    public static boolean uppercaseLowercaseCheck(Scanner scanner) {
        while (true) {
            System.out.print("Büyük/küçük harf duyarlılığı aktif olsun mu? (Evet/Hayır): ");
            String caseChoice = scanner.nextLine();
            if (caseChoice.equalsIgnoreCase("Evet")) {
                return true;
            } else if (caseChoice.equalsIgnoreCase("Hayır")) {
                return false;
            } else {
                System.out.println("Lütfen geçerli bir cevap giriniz.");
            }
        }
    }

    public static char oneCharacterCheck(Scanner scanner) {
        while (true) {
            System.out.print("Analiz etmek için bir karakter girin: ");
            String charInput = scanner.nextLine();
            if (charInput.length() == 1) {
                return charInput.charAt(0);
            } else {
                System.out.println("Geçerli bir karakter giriniz.");
            }
        }
    }

    public static int repeatedCharacterCount(String sentence, char character, boolean caseSensitive) {
        int count = 0;
        if (caseSensitive) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == character) {
                    count++;
                }
            }
        } else {
            character = Character.toLowerCase(character);
            for (int i = 0; i < sentence.length(); i++) {
                if (Character.toLowerCase(sentence.charAt(i)) == character) {
                    count++;
                }
            }
        }
        return count;
    }
}

