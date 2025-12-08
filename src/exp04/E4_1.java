package exp04;
import java.util.Scanner;

public class E4_1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = input.nextLine();

            System.out.print("Enter the character to count: ");
            char ch = input.next().charAt(0);

            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println("The character '" + ch + "' appears " + count + " times.");
        }
    }

