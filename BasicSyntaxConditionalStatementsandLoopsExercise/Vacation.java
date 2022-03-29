package Zadachi.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String typePeople = scanner.nextLine();
        String day = scanner.nextLine();

        double priceToPay = 0.0;

        switch (day) {
            case "Friday":
                if (typePeople.equals("Students")) {
                    priceToPay = 8.45;
                } else if (typePeople.equals("Business")) {
                    priceToPay = 10.90;
                } else if (typePeople.equals("Regular")) {
                    priceToPay = 15;
                }
                break;
            case "Saturday":
                if (typePeople.equals("Students")) {
                    priceToPay = 9.80;
                } else if (typePeople.equals("Business")) {
                    priceToPay = 15.60;
                } else if (typePeople.equals("Regular")) {
                    priceToPay = 20;
                }
                break;
            case "Sunday":
                if (typePeople.equals("Students")) {
                    priceToPay = 10.46;
                } else if (typePeople.equals("Business")) {
                    priceToPay = 16;
                } else if (typePeople.equals("Regular")) {
                    priceToPay = 22.50;
                }
                break;
        }
        double totalSumToPay = countPeople * priceToPay;
        if (typePeople.equals("Students") && countPeople >= 30) {
            totalSumToPay = totalSumToPay * 0.85;
        } else if (typePeople.equals("Business") && countPeople >= 100) {
            totalSumToPay = (countPeople - 10) * priceToPay;
        } else if (typePeople.equals("Regular") && countPeople >= 10 && countPeople <= 20) {
            totalSumToPay = totalSumToPay * 0.95;
        }
        System.out.printf("Total price: %.2f", totalSumToPay);
    }
}
