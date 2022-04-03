package Zadachi.RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "\\b(?<day>\\d{2})([.\\-/])(?<mont>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        String dates = scanner.nextLine();

        Pattern date = Pattern.compile(regex);
        Matcher dateMatcher = date.matcher(dates);

        while (dateMatcher.find()) {
            String day = dateMatcher.group( "day");
            String mont = dateMatcher.group( "mont");
            String year = dateMatcher.group( "year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, mont, year);
        }
    }
}
