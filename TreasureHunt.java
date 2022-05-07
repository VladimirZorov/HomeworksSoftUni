package Exam6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();
        List<String> stolen = new ArrayList<>();
        while (!input.equals("Yohoho!")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        if (!initialLoot.contains(command[i])) {
                            initialLoot.add(0,command[i]);
                        }
                    }
                    break;
                case "Drop":
                    if (Integer.parseInt(command[1])>0 && Integer.parseInt(command[1]) < initialLoot.size()) {
                        String tempPlace = initialLoot.get(Integer.parseInt(command[1]));
                        initialLoot.remove(Integer.parseInt(command[1]));
                        initialLoot.add(tempPlace);
                        break;
                    }
                case "Steal":
                    for (int i = 0; i < Integer.parseInt(command[1]); i++){
                        stolen.add(0, initialLoot.get(initialLoot.size()-1));
                    initialLoot.remove(initialLoot.size()-1);
                }
                    break;
            }


            input = scanner.nextLine();
        }


        System.out.println(stolen);

    }
}
