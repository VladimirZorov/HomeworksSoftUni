package Zadachi.TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = "";
        while (!input.equals("end")) {
            for (int i = input.length() - 1; i >=0 ; i--) {
                reversed += input.charAt(i);
            }
            System.out.printf("%s = %s%n", input, reversed);
            reversed = "";
            input = scanner.nextLine();
        }
    }
}
