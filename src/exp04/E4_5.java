package exp04;
import java.util.Scanner;

public class E4_5 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = input.nextLine();

            int sum = 0;

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (ch >= '0' && ch <= '9') {
                    sum += ch - '0';
                }
//                if (Character.isDigit(ch)) {
//                    sum += Character.getNumericValue(ch);
//                }
            }

            System.out.println("Sum of digits: " + sum);
        }
    }

