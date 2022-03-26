package Zadachi.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rotNum = Integer.parseInt(scanner.nextLine());
        int oldZeroNum = 0;

        for (int i = 0; i < rotNum; i++) {
            oldZeroNum = numbers[0];
            for (int j = 0; j < numbers.length-1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = oldZeroNum;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
