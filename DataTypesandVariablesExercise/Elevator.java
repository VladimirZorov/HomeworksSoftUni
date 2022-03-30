package Zadachi.DataTypesandVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        double capacity = Double.parseDouble(scanner.nextLine());

        int courses = (int)(Math.ceil(persons / capacity));

        System.out.println(courses);
    }
}
