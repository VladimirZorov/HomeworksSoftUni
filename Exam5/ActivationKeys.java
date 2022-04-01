package Zadachi.Exam5;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] command = input.split(">>>");
            switch (command[0]) {
                case "Slice":
                    activationKey.delete(Integer.parseInt(command[1])
                            , Integer.parseInt(command[2]));
                    System.out.println(activationKey);
                    break;
                case "Flip":
                    if (command[1].equals("Upper")) {
                        upperCase(activationKey, command);
                        System.out.println(activationKey);
                    } else {
                        lowerCase(activationKey, command);
                        System.out.println(activationKey);
                    }
                    break;
                case "Contains":
                    if (activationKey.indexOf(command[1]) != -1) {
                        System.out.println(activationKey + " contains " + command[1]);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey);
    }

    private static StringBuilder lowerCase(StringBuilder activationKey, String[] command) {
        for (int i = Integer.parseInt(command[2]); i <Integer.parseInt(command[3]); i++) {
            if (Character.isUpperCase(activationKey.charAt(i))) {
                activationKey.setCharAt(i,
                        Character.toLowerCase(activationKey.charAt(i)));
            }
        }
        return activationKey;
    }

    public static StringBuilder upperCase(StringBuilder activationKey, String[] command) {
        for (int i = Integer.parseInt(command[2]); i <Integer.parseInt(command[3]); i++) {
            if (Character.isLowerCase(activationKey.charAt(i))) {
                activationKey.setCharAt(i,
                        Character.toUpperCase(activationKey.charAt(i)));
            }
        }
        return activationKey;
    }
}
