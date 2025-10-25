package Tamrin;

import java.util.Scanner;

public class E5_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three strings: ");
        String[] words = new String[3];
        for (int i = 0; i < 3; i++) {
            words[i] = input.next();
        }

        for (int pass = 0; pass < words.length - 1; pass++) {
            for (int i = 0; i < words.length - 1 - pass; i++) {
                if (isGreater(words[i], words[i + 1])) {
                    String temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        input.close();
    }

    public static boolean isGreater(String a, String b) {
        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

            if (c1 > c2) return true;
            if (c1 < c2) return false;
        }

        return a.length() > b.length();
    }
}
