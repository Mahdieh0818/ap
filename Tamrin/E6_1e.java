package Tamrin;

import java.util.Scanner;

public class E6_1e {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = input.nextInt();

            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                if (digit % 2 != 0) {
                    sum += digit;
                }
                num /= 10;
            }

            System.out.println("The sum of odd digits is: " + sum);

        }
    }


