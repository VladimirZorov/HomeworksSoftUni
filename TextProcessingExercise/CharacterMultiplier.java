package Zadachi.TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        char[] str1 = input[0].toCharArray();
        char[] str2 = input[1].toCharArray();

        int minLinght = Math.min(str1.length, str2.length);
        int maxLinght = Math.max(str1.length, str2.length);

        int sum = 0;
        for (int i = 0; i < maxLinght; i++) {
            if ( i < minLinght) {
                sum += str1[i] * str2[i];
            } else if (str1.length < str2.length){
                sum += str2[i];
            }else {
                sum += str1[i];
            }
        }

        System.out.println(sum);
    }
}
