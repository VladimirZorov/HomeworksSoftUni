package Zadachi.ListsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] comand = input.split(" ");
            switch (comand[0]) {
                case "Delete":
                 numbers.removeAll(Collections.singleton(Integer.parseInt(comand[1])));
//                    numbers.removeAll(Collections.singleton("5"));
                    break;
                case "Insert":
                    numbers.add((Integer) Integer.parseInt(comand[2]),
                            Integer.parseInt(comand[1]));
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(numbers.toArray())
                .replaceAll("[\\[\\],]", ""));
    }
}
