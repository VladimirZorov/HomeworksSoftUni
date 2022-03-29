package Zadachi.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());
// TODO: 16.1.2022 г. да изчисля общата сума
        double countOfBelts = countOfStudents - (countOfStudents / 6);

        double sumOfLightsabers = priceOfLightsabers * Math.ceil(countOfStudents * 1.1);
        double sumOfRobes = priceOfRobes * countOfStudents;
        double somOfBelts = priceOfBelts * countOfBelts;

        double totalSum = sumOfLightsabers + somOfBelts + sumOfRobes;

        double result = Math.abs(amountOfMoney - totalSum);
        if (amountOfMoney >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", result);
        }
    }
}
