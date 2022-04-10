package Zadachi.TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int strnght = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (strnght >0 && sb.charAt(i) != '>') {
                sb.deleteCharAt(i);
                strnght --;
                i--;
            }else if (sb.charAt(i) == '>') {
                strnght += Integer.parseInt(String.valueOf(sb.charAt(i+1)));
            }
        }
        System.out.println(sb);
    }
}
