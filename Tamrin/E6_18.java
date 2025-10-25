package Tamrin;

import java.util.Scanner;

public class E6_18 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the side length: ");
            int n = input.nextInt();


            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }


