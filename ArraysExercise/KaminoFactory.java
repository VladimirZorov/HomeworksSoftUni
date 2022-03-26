package Zadachi.ArraysExercise;

import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seqLenght = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        String[] bestDna = new String[seqLenght];

        int numberDnaTest = 0;


        while (!input.equals("Clone them")) {
            String[] dna = input.split("!");
            numberDnaTest ++;



            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n" +
                " %d ",numberDnaTest, numberDnaTest,numberDnaTest);
    }
}
