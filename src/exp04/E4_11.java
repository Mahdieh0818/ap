package exp04;

import java.util.Scanner;

public class E4_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("All possible case combinations:");
        generateCase(text, "");
    }

    public static void generateCase(String str, String answer) {
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }

        char ch = str.charAt(0);
        String remaining = str.substring(1);

        if (Character.isLetter(ch)) {
            generateCase(remaining, answer + Character.toLowerCase(ch));
            generateCase(remaining, answer + Character.toUpperCase(ch));
        } else {
            generateCase(remaining, answer + ch);
        }
    }
}

