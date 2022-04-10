package Zadachi.TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            result.append(symbol);
        }
        for (int i = 0; i < result.length()-1; i++) {
            if (result.charAt(i) == result.charAt(i+1)){
                result.deleteCharAt(i+1);
                i--;
            }
        }
        System.out.println(result);
    }
}
