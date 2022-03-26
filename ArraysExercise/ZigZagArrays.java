package Zadachi.ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arrOne = new String[n];
        String[] arrTwo = new String[n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                arrOne[i] = line[0];
                arrTwo[i] = line[1];
            } else {
                arrTwo[i] = line[0];
                arrOne[i] = line[1];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrOne[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arrTwo[i] + " ");
        }
    }
}
