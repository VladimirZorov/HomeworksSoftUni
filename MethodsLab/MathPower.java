package Zadachi.MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double digit = Double.parseDouble(scanner.nextLine());
        double pow = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(mathPower(digit,pow)));

    }
    private static double mathPower(double digit, double pow) {
        double result = Math.pow(digit, pow);
        return result;
    }
}
