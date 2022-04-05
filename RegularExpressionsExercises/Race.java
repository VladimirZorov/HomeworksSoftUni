package Zadachi.RegularExpressionsExercises;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameRegex = "[A-Za-z]+";
        String distanceRegex = "[\\d]";
        List<String> names = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> racers = new LinkedHashMap<>();
        for (String name : names) {
            racers.putIfAbsent(name, 0);
        }
        Pattern namePattern = Pattern.compile(nameRegex);
        Pattern distancePattern = Pattern.compile(distanceRegex);
        int sum = 0;
        String line = scanner.nextLine();
        while (!line.equals("end of race")) {
            Matcher nameMatcher = namePattern.matcher(line);
            StringBuilder sb = new StringBuilder();
            while (nameMatcher.find()) {
                sb.append(nameMatcher.group());
            }
            if (racers.containsKey(sb.toString())) {
                Matcher distanceMatcher = distancePattern.matcher(line);

                while (distanceMatcher.find()) {
                    int digit = Integer.parseInt(distanceMatcher.group());
                    sum += digit;
                    racers.put(sb.toString(), racers.get(sb.toString()) + digit);
                }
            }

            line = scanner.nextLine();
        }
        List<String> sorted = racers.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .map(Map.Entry::getKey).collect(Collectors.toList());
        String num = "";
        for (int i = 0; i < sorted.size(); i++) {
            if (i == 3) {
                break;
            }
            if (i == 0) {
                num = "st";
            } else if (i == 1) {
                num = "nd";
            } else {
                num = "rd";
            }
            System.out.printf("%d%s place: %s%n",i+1, num , sorted.get(i));
        }
    }
}
