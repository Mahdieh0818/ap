package Tamrin;

import java.util.Scanner;

public class E6_13 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            String binary = "";

            while (number > 0) {
                int remainder = number % 2;
                binary = remainder + binary;
                number = number / 2;
            }

            System.out.println("Binary representation: " + binary);

        }
    }

