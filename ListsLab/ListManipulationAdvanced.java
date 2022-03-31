package Zadachi.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int getSum = 0;
        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(command[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else if (command[1].equals("odd")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.printf(numbers.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    for (int i = 0; i < numbers.size() ; i++) {
                        getSum +=  numbers.get(i);
                    }
                    System.out.println(getSum);
                    break;
                case "Filter":
                    if(command[1].equals(">")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) > Integer.parseInt(command[2])){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }else if(command[1].equals("<")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) < Integer.parseInt(command[2])){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }else if(command[1].equals(">=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) >= Integer.parseInt(command[2])){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }else if(command[1].equals("<=")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) <= Integer.parseInt(command[2])){
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

            }

            input = scanner.nextLine();
        }
    }
}