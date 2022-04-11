package Zadachi.TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        List<String> repeated = new ArrayList<>();

        for (String word : words) {
            System.out.print(repeat(word, word.length()));
        }
    }

    private static String repeat(String word, int repetitions) {
        char[] repeated = new char[word.length() * repetitions];

        return new String(repeated);
    }
}
