package Tamrin;

import java.util.Scanner;

public class E6_3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a line of text: ");
            String line = input.nextLine();

            System.out.print("(a) Uppercase letters: ");
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    System.out.print(c);
                }
            }
            System.out.println();

            System.out.print("(b) Every second letter: ");
            for (int i = 1; i < line.length(); i += 2) {
                System.out.print(line.charAt(i));
            }
            System.out.println();

            System.out.print("(c) String with vowels replaced: ");
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    System.out.print('_');
                } else {
                    System.out.print(c);
                }
            }
            System.out.println();

            int vowelCount = 0;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    vowelCount++;
                }
            }
            System.out.println("(d) Number of vowels: " + vowelCount);

            System.out.print("(e) Positions of vowels: ");
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if ("AEIOUaeiou".indexOf(c) != -1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();


        }
    }


