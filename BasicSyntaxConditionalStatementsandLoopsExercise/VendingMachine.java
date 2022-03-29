package Zadachi.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalMoney = 0.0;

        while (!"Start".equals(input)) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 ||
                    coins == 1 || coins == 2) {
                totalMoney += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }
        String input2 = scanner.nextLine();
        double goodsPrice = 0.0;
        while (!"End".equals(input2)) {
            String goods = input2;
            switch (goods) {
                case "Nuts":
                    totalMoney -= 2.0;
                    if (totalMoney >= 0) {
                        System.out.printf("Purchased %s%n", goods);
                    } else if (totalMoney < 0) {
                        System.out.println("Sorry, not enough money");
                        totalMoney += 2;
                    }
                    break;
                case "Water":
                    totalMoney -= 0.7;
                    if (totalMoney >= 0) {
                        System.out.printf("Purchased %s%n", goods);
                    } else if (totalMoney < 0) {
                        System.out.println("Sorry, not enough money%n");
                        totalMoney += 0.7;
                    }
                    break;
                case "Crisps":
                    totalMoney -= 1.5;
                    if (totalMoney >= 0) {
                        System.out.printf("Purchased %s%n", goods);
                    } else if (totalMoney < 0) {
                        System.out.println("Sorry, not enough money%n");
                        totalMoney += 1.5;
                    }
                    break;
                case "Soda":
                    totalMoney -= 0.8;
                    if (totalMoney >= 0) {
                        System.out.printf("Purchased %s%n", goods);
                    } else if (totalMoney < 0) {
                        System.out.println("Sorry, not enough money%n");
                        totalMoney += 0.8;
                    }
                    break;
                case "Coke":
                    totalMoney -= 1.0;
                    if (totalMoney >= 0) {
                        System.out.printf("Purchased %s%n", goods);
                    } else if (totalMoney < 0) {
                        System.out.println("Sorry, not enough money%n");
                        totalMoney += 1.0;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input2 = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", Math.abs(totalMoney));

    }
}
