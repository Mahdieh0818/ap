package exp04;
import java.util.Scanner;

public class E4_2 {
        public static void main(String[] args) {
            String reversed = "";

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = input.nextLine();

            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += text.charAt(i);
            }

            System.out.println("Reversed string: " + reversed);
        }
    }
