package exp04;

import java.util.Scanner;

public class E4_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int num = input.nextInt();

        String result = convertToWords(num);
        System.out.println("Number in words: " + result);
    }

    static String[] ones = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convertToWords(int number) {
        if (number < 0 || number > 999) {
            return "Number out of range!";
        }

        String words = "";


        if (number / 100 > 0) {
            words += ones[number / 100] + " Hundred";
            number %= 100;
            if (number > 0) {
                words += " ";
            }
        }

        if (number > 0) {
            if (number < 20) {
                words += ones[number];
            } else {
                words += tens[number / 10];
                if (number % 10 > 0) {
                    words += " " + ones[number % 10];
                }
            }
        }

        return words;
    }
}

