package Zadachi.BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int lenght = a.length();
        char lastDigit = a.charAt(lenght - 1);

        String number = "";

        switch (lastDigit) {
            case '0':
                number = "zero";
                break;
            case '1':
                number = "one";
                break;
            case '2':
                number = "two";
                break;
            case '3':
                number = "three";
                break;
            case '4':
                number = "four";
                break;
            case '5':
                number = "five";
                break;
            case '6':
                number = "six";
                break;
            case '7':
                number = "seven";
                break;
            case '8':
                number = "eigh";
                break;
            case '9':
                number = "nine";
                break;
        }
        System.out.print(number);
    }
}
