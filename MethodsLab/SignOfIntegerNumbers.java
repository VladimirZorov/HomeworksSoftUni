package Zadachi.MethodsLab;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        String type = "";
        if (num > 0) {
            type = "positive";
        } else if (num < 0) {
            type = "negative";
        } else {
            type = "zero";
        }
        printSignOfInt(num,type);
    }

    public static void printSignOfInt(int num, String type) {
        System.out.printf("The number %d is %s.", num, type);
    }
}