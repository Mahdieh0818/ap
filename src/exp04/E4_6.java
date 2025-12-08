package exp04;
import java.util.Scanner;

public class E4_6 {

     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = input.nextLine();

            if (text.isEmpty()) {
                System.out.println("Result: ");
                return;
            }

            String result = "" + text.charAt(0);

            for (int i = 1; i < text.length(); i++) {
                if (text.charAt(i) != text.charAt(i - 1)) {
                    result += text.charAt(i);
                }
            }
            System.out.println("Result: " + result);
        }
    }
