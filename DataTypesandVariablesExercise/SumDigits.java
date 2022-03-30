package Zadachi.DataTypesandVariablesExercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int length = (int) (Math.log10(num) + 1);
        int result = 0;
        for (int i = 1; i <= length ; i++) {

            int digit = num % 10;
            result = result + digit;
            num = num / 10;
        }
        System.out.println(result);
    }
}
