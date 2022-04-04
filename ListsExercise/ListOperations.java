package Zadachi.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    insert(Integer.parseInt(command[1]), Integer.parseInt(command[2]), numbers);
                    break;
                case "Remove":
                     int index = Integer.parseInt(command[1]);
                    if (index < 0 || index >= numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index);
                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(command[2]);
                    if (command[1].equals("left")) {
                        // 1 2 3 4 5   count = 2    3 4 5 1 2
                        for (int i = 0; i < count; i++) {
                            // add first element in the end of the list
                            numbers.add(numbers.get(0));
                            // remove first element
                            numbers.remove(0);
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            // add last element to the first position
                            numbers.add(0, numbers.get(numbers.size() - 1));
                            // remove last element
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;

            }
            input = scanner.nextLine();
        }


        numbers.forEach(el -> System.out.print(el + " "));
    }
    public static void insert(int element, int index, List<Integer> nums) {
        if (index < 0 || index >= nums.size()) {
            System.out.println("Invalid index");
        } else {
            nums.add(index, element);
        }
    }

}
