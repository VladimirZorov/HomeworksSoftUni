package Zadachi.RegularExpressionsLab;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359([ -])2\\1[0-9]{3}\\1[0-9]{4}\\b";
        String phones = scanner.nextLine();

        Pattern phoneNum = Pattern.compile(regex);
        Matcher phoneMatcher = phoneNum.matcher(phones);

        List<String> validPhones = new LinkedList<>();

        while (phoneMatcher.find()) {
            validPhones.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", validPhones));
    }
}
