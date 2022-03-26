package Zadachi.ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int sumPeople = 0;
        int [] train = new int [wagons];
        for (int i = 0; i < wagons ; i++) {
            train [i] = Integer.parseInt(scanner.nextLine());
            sumPeople += train[i];
            System.out.print(train [i] + " ");
        }
        System.out.printf("%n%d", sumPeople);
    }
}
