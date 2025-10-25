package Tamrin;

import java.util.Scanner;

public class E6_5 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            DataSet data = new DataSet();

            System.out.println("Enter floating-point values (type a non-number like 'q' to finish):");

            while (input.hasNextDouble()) {
                double value = input.nextDouble();
                data.add(value);
            }

            System.out.println("\nAverage: " + data.getAverage());
            System.out.println("Smallest: " + data.getSmallest());
            System.out.println("Largest: " + data.getLargest());
            System.out.println("Range: " + data.getRange());

            input.close();
        }
    }

