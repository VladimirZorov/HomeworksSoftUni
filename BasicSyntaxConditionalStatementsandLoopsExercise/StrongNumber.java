package Zadachi.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int sum = 0;
        for (int j = 0; j < n.length(); j++) {
            char num = n.charAt(j);

            double fact = 1;
            for (int i = 1; i <= Integer.parseInt(String.valueOf(num)); i++) {
                fact = fact * i;
            }
            sum += fact;
        }

        if (sum == Integer.parseInt(n)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
