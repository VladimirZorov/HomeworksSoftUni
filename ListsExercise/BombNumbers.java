package Zadachi.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());
        int [] bombNumber = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();

        int sumBombs = 0;
        int sumNumbers = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bombNumber[0]) {
                sumBombs += numbers.get(i);
                for (int j = 1; j <= bombNumber[1] ; j++) {
                    if ((i+j) < numbers.size()) {
                        sumBombs += numbers.get(i + j);
                    }
                    if ((i-j)>=0) {
                        sumBombs += numbers.get(i - j);
                    }
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            sumNumbers += numbers.get(i);
        }
        System.out.println(sumNumbers - sumBombs);
    }
}
