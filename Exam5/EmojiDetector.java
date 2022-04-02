package Zadachi.Exam5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> threshold = new ArrayList<>(0);
        List<String> emoji = new ArrayList<>(0);

        Pattern coolThreshold = Pattern.compile("\\d");
        Matcher coolMather = coolThreshold.matcher(text);
        while (coolMather.find()) {
            threshold.add(coolMather.group());
        }

        Pattern emojis = Pattern.compile("(:{2}|\\*{2})(?<emo>[A-Z][a-z]{2,})\\1");
        Matcher emojiMather = emojis.matcher(text);
        while (emojiMather.find()) {
            emoji.add(emojiMather.group("emo"));
        }
        int coolsTr = 1;
        for (String s : threshold) {
            for (int j = 0; j <threshold.size(); j++) {
                coolsTr = coolsTr * Integer.parseInt(threshold.get(j));
            }
        }
        System.out.println("Coolthreshold:"  + coolsTr);
        System.out.println(emoji.size() + " emojis found in the text. ");
    }
}
