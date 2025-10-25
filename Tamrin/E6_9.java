package Tamrin;

import java.util.Scanner;

public class E6_9 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = input.next();
            System.out.print("Reversed word: ");

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }

            System.out.println();

        }
    }

