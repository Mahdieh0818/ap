package Tamrin;

import java.util.Scanner;

public class E5_15 {

    public static void main(String[] args) {

        double income;
        double sumTax = 0;
        double income0 = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter income:");
        income = scanner.nextInt();

        double[] incomeLimit = {50000, 75000, 100000, 250000, 500000 };
        double[] tax = {0.01, 0.02, 0.03, 0.04, 0.05, 0.06};

        for (int i = 0; i < incomeLimit.length; i++) {
            if(income > incomeLimit[i]){
                sumTax += (incomeLimit[i] - income0) * tax[i];
                income0 = incomeLimit[i];

            }else {
                sumTax += (income - income0) * tax[i];
                System.out.println("Your income tax is: " + sumTax);
                return;

            }
            
        }
        sumTax += (income - income0) * tax[tax.length - 1];

        System.out.printf("Your income tax is: " + sumTax);



    }
}
