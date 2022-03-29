package Zadachi.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double totalSum = 0.0;

        for (int i = 1; i <= n; i++) {
            double pricPerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double totalPrice = ((days * capsulesCount) * pricPerCapsule);
            totalSum += totalPrice;
            System.out.printf("The price for the coffee is: $%.2f%n",totalPrice);
        }
        System.out.printf("Total: $%.2f",totalSum);
    }
}
