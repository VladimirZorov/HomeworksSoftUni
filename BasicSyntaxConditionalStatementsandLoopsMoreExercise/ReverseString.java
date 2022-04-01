package Zadachi.BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String reversInput = "";
        int lenght = input.length();

        for (int i = lenght - 1; i >= 0; i--) {
            char symbol = input.charAt(i);
            reversInput += symbol;
        }
        System.out.println(reversInput);
    }
}
