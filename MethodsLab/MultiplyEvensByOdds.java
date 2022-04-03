package Zadachi.MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        int[] number = Integer.toString(num).chars().map(c -> c-'0').toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                evenSum += number[i];
            } else {
                oddSum += number[i];
            }
        }
        System.out.println(evenSum*oddSum);
    }
}
