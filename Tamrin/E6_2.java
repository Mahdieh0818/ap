package Tamrin;

import java.util.Scanner;

public class E6_2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter integers (enter 0 to stop):");

            int[] numbers = new int[100];
            int count = 0;

            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;
            int evenCount = 0;
            int oddCount = 0;
            int cumulativeSum = 0;
            int[] cumulativeTotals = new int[100];
            int[] adjacentDuplicates = new int[100];
            int dupCount = 0;

            int prev = Integer.MIN_VALUE;

            while (true) {
                int num = input.nextInt();
                if (num == 0) break;

                numbers[count] = num;
                count++;

                if (num < smallest) smallest = num;
                if (num > largest) largest = num;

                if (num % 2 == 0) evenCount++;
                else oddCount++;

                cumulativeSum += num;
                cumulativeTotals[count - 1] = cumulativeSum;

                if (num == prev) {
                    if (dupCount == 0 || adjacentDuplicates[dupCount - 1] != num) {
                        adjacentDuplicates[dupCount] = num;
                        dupCount++;
                    }
                }

                prev = num;
            }

            System.out.println("\n(a) Smallest: " + smallest + ", Largest: " + largest);
            System.out.println("(b) Even count: " + evenCount + ", Odd count: " + oddCount);

            System.out.print("(c) Cumulative totals: ");
            for (int i = 0; i < count; i++) {
                System.out.print(cumulativeTotals[i] + " ");
            }
            System.out.println();

            System.out.print("(d) Adjacent duplicates: ");
            for (int i = 0; i < dupCount; i++) {
                System.out.print(adjacentDuplicates[i] + " ");
            }
            System.out.println();


        }
    }

