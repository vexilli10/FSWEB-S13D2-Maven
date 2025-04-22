package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Verilen sayının ters okunuşu kendine eşit mi?
     * Negatifse işareti yok sayar.
     */
    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int reversed = 0;
        int temp = original;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed == original;
    }

    /**
     * Mükemmel sayı mı? 0'dan küçükse false.
     */
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    /**
     * Sayıyı kelimelere döker. Negatifse "Invalid Value".
     */
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        if (number == 0) {
            return "Zero";
        }
        StringBuilder sb = new StringBuilder();
        int temp = number;
        // Basamak sayısını ve her basamağı bir array'de sakla
        int[] digits = new int[String.valueOf(number).length()];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        for (int d : digits) {
            switch (d) {
                case 0: sb.append("Zero"); break;
                case 1: sb.append("One"); break;
                case 2: sb.append("Two"); break;
                case 3: sb.append("Three"); break;
                case 4: sb.append("Four"); break;
                case 5: sb.append("Five"); break;
                case 6: sb.append("Six"); break;
                case 7: sb.append("Seven"); break;
                case 8: sb.append("Eight"); break;
                case 9: sb.append("Nine"); break;
            }
            sb.append(" ");
        }
        // Sondaki fazladan boşluğu kırp
        return sb.toString().trim();
    }
}
