package Zadachi.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> playerOne = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());



//        if (sumPlayerOne > sumPlayerTwo) {
//            System.out.printf("First player wins! Sum: %d", sumPlayerOne);
//        } else {
//            System.out.printf("Second player wins! Sum: %d", sumPlayerTwo);
//        }
    }
}
