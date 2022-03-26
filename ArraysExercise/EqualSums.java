package Zadachi.ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
//        int leftSum = 1;
//        int rightSum = 0;
        boolean isEqual = false;


        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            if (numbers.length == 1) {
                System.out.println(0);
                isEqual = true;
                break;
            }
            if (leftSum == rightSum) {
                System.out.println(i-1);
                isEqual = true;
            }

            for (int j = 0; j < numbers.length; j++) {

                if (i > j) {
                    leftSum += numbers[j];
                } else if (i < j) {
                    rightSum += numbers[j];
                }
            }

        }
        if (!isEqual) {
            System.out.println("no");
        }

    }
}
