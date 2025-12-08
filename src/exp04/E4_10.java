package exp04;
import java.util.Scanner;

public class E4_10 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = input.nextLine();

            System.out.println("All possible substrings:");

            for (int start = 0; start < text.length(); start++) {

                for (int end = start + 1; end <= text.length(); end++) {
                    String substring = text.substring(start, end);
                    System.out.println(substring);
                }
            }
        }
    }

