package Tamrin;

import java.util.Scanner;

public class E5_2 {

    public static void main(String[] args) {
        double number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");

        number = scanner.nextDouble();

        if (number == 0){
            System.out.println("zero");
        }else {
            if (number > 0){
                System.out.println("positive");
            }else {
                System.out.println("negetive");
            }
        }
        double absNumber = Math.abs(number);

        if (absNumber < 1){
            System.out.println("small");
        }else if (absNumber > 1000000){
            System.out.println("big");
        }
    }
}
