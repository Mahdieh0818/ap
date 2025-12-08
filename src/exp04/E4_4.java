package exp04;

import java.util.Scanner;

public class E4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }

//            if (Character.isLowerCase(ch)) {
//                result += Character.toUpperCase(ch);
//            } else if (Character.isUpperCase(ch)) {
//                result += Character.toLowerCase(ch);
//            } else {
//                result += ch;
//            }
        }
            System.out.println("Swapped string: " + result);
    }
}

