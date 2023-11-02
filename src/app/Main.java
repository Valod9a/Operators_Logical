package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double rate;
    static double tax;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Enter your income amount: ");
        double income = scanner.nextDouble();

        scanner.close();

        if (income > 0 && income <= 10000) {
            rate  = 2.5;
            tax = income / 100 * rate;
            System.out.printf("Tax on your income is: %.2f.", tax);
        }
        else if (income > 0 && income <= 25000) {
            rate = 4.3;
            tax = income / 100 * rate;
            System.out.printf("Tax on your income is: %.2f.", tax);
        }
        else if (income > 25000) {
            rate = 6.7;
            tax = income / 100 * rate;
            System.out.printf("Tax on your income is: %.2f.", tax);
        }
        else System.out.println("Entered income is not correct.");
    }
}
