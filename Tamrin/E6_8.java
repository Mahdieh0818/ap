package Tamrin;

import java.util.Scanner;

public class E6_8 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = input.next();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                System.out.println(c);
            }


        }
    }


