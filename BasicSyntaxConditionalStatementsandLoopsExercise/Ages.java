package Zadachi.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String humanIs = "";

        if (age >= 0 && age <= 2) {
            humanIs = "baby";
        } else  if (age >= 3 && age <= 13) {
            humanIs = "child";
        } else if (age >= 14 && age <= 19) {
            humanIs = "teenager";
        } else if (age >= 20 && age <= 65) {
            humanIs = "adult";
        } else if (age >= 66 ) {
            humanIs = "elder";
        }
        System.out.println(humanIs);
    }
}
