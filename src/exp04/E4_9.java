package exp04;
import java.util.Scanner;

public class E4_9 {

     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = input.nextLine();

            if (text.isEmpty()) {
                System.out.println("Compressed string: ");
                return;
            }

            String result = "";
            char currentChar = text.charAt(0);
            int count = 1;

            for (int i = 1; i < text.length(); i++) {
                if (text.charAt(i) == currentChar) {
                    count++;
                } else {
                    result += currentChar + String.valueOf(count);
                    currentChar = text.charAt(i);
                    count = 1;
                }
            }

            result += currentChar + String.valueOf(count);

            System.out.println("Compressed string: " + result);
        }
    }

