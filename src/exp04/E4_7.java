package exp04;
import java.util.Scanner;

public class E4_7 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = input.nextLine();

            System.out.println("All permutations:");
            permute(text, "");
        }

    public static void permute(String str, String answer) {
        if (str.length() == 0) {
            System.out.println(answer);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String remaining = str.substring(0, i) + str.substring(i + 1);

            permute(remaining, answer + ch);
        }
    }
}

