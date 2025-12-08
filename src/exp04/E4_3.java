package exp04;
import java.util.Scanner;

public class E4_3 {

     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = input.nextLine();

            char result = '\0';


            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                int count = 0;


                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == ch) {
                        count++;
                    }
                }


                if (count == 1) {
                    result = ch;
                    break;
                }
            }


            if (result != '\0') {
                System.out.println("First non-repeated character: " + result);
            } else {
                System.out.println("No non-repeated character found.");
            }
        }
    }

