package Zadachi.RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String input = scanner.nextLine();

        Pattern name = Pattern.compile(regex);
        Matcher nameMatcher = name.matcher(input);

        while (nameMatcher.find()) {
            System.out.print(nameMatcher.group() + " ");
        }
    }
}
