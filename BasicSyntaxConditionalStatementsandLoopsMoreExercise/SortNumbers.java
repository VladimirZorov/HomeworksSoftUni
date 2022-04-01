package Zadachi.BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int maxAB = Math.max(a, b);
        int maxBC = Math.max(b, c);
        int max = Math.max(maxAB, maxBC);

        int minAB = Math.min(a, b);
        int minBC = Math.min(b, c);
        int min = Math.min(minAB, minBC);

        int middle;
        if (a != max && a!= min) {
            middle = a;
        } else if (b != max && b!= min) {
            middle = b;
        } else {
            middle = c;
        }

        System.out.println(max);
        System.out.println(middle);
        System.out.println(min);
    }
}
