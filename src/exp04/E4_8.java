package exp04;
import java.util.Scanner;

public class E4_8 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String text = input.nextLine();

            String longest = "";

            for (int i = 0; i < text.length(); i++) {
                String current = "";

                for (int j = i; j < text.length(); j++) {
                    char ch = text.charAt(j);

                    if (current.indexOf(ch) == -1) {
                        current += ch;
                    } else {
                        break;
                    }
                }

                if (current.length() > longest.length()) {
                    longest = current;
                }
            }

            System.out.println("Longest substring without repeating characters: " + longest);
            System.out.println("Length: " + longest.length());
        }
    }

