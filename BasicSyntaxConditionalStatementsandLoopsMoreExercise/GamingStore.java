package Zadachi.BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentBalance = Double.parseDouble(scanner.nextLine());
        double gamePrice = 0.0;
        double spentMoney = 0.0;

        boolean outOfMoney = false;

        String gameName = scanner.nextLine();

        while (!"Game Time".equals(gameName)) {
            switch (gameName) {
                case "OutFall 4":
                    gamePrice = 39.99;
                    if (currentBalance < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.printf("Bought %s%n", gameName);
                        currentBalance -= gamePrice;
                        spentMoney += gamePrice;
                    }
                    if (currentBalance == 0) {
                        outOfMoney = true;
                    }
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    if (currentBalance < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.printf("Bought %s%n", gameName);
                        currentBalance -= gamePrice;
                        spentMoney += gamePrice;
                    }
                    if (currentBalance == 0) {
                        outOfMoney = true;
                    }
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    if (currentBalance < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.printf("Bought %s%n", gameName);
                        currentBalance -= gamePrice;
                        spentMoney += gamePrice;
                    }
                    if (currentBalance == 0) {
                        outOfMoney = true;
                    }
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    if (currentBalance < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.printf("Bought %s%n", gameName);
                        currentBalance -= gamePrice;
                        spentMoney += gamePrice;
                    }
                    if (currentBalance == 0) {
                        outOfMoney = true;
                    }
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    if (currentBalance < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.printf("Bought %s%n", gameName);
                        currentBalance -= gamePrice;
                        spentMoney += gamePrice;
                    }
                    if (currentBalance == 0) {
                        outOfMoney = true;
                    }
                    if (currentBalance == 0) {
                        outOfMoney = true;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    if (currentBalance < gamePrice) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.printf("Bought %s%n", gameName);
                        currentBalance -= gamePrice;
                        spentMoney += gamePrice;
                    }
                    if (currentBalance == 0) {
                        outOfMoney = true;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (outOfMoney) {
                System.out.println("Out of mo-ney!");
                break;
            }
            gameName = scanner.nextLine();
        }
        if (!outOfMoney) {
            System.out.printf("Total spent: $%.2f. ", spentMoney);
            System.out.printf("Remaining: $%.2f", currentBalance);
        }
    }
}