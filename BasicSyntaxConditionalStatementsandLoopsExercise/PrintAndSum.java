package Zadachi.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");
            count += i;
        }
        System.out.printf("%nSum: %d", count);
    }
}
