package Zadachi.ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firsArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (int j = 0; j < secondArr.length; j++) {
            for (int i = 0; i < firsArr.length; i++) {
                if (secondArr[j] .equals(firsArr[i])) {
                    System.out.print(secondArr[j] + " ");
                }
            }
        }
    }
}