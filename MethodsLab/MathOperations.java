package Zadachi.MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        String operators = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.print(new DecimalFormat("0.##").format(calculate(num1, operators, num2)));

    }
    private static double calculate(int num1, String operators, int num2) {
        double result = 0.0;
        switch (operators) {
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "+":
                result = num1 + num2;
                break;
        }
        return result;
    }
}
