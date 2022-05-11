package Exam6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">")).toList();
        List<String> warshipStatus = Arrays.stream(scanner.nextLine().split(">")).toList();
        int maxHealthOfSection = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Retire")) {
            List<String> command = Arrays.stream(input.split(" ")).toList();
            switch (command.get(0)) {
                case "Fire":
                    break;
                case "Defend":
                    break;
                case "Repair":
                    break;
                case "Status":
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println();
    }
}
