package Zadachi.DataTypesandVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());

        int sumLitersInTank = 0;

        for (int i = 1; i <= numLines ; i++) {
            int litersOfWater = Integer.parseInt(scanner.nextLine());
            if((sumLitersInTank + litersOfWater) <= 255) {
                sumLitersInTank += litersOfWater;
            } else {
                sumLitersInTank = sumLitersInTank;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sumLitersInTank);
    }
}
