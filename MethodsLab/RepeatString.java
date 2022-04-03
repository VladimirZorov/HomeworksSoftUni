package Zadachi.MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());
        repeatStr(str, repeat);
    }

    private static void repeatStr(String str, int repeat) {
        String result = "";
        for (int i = 0; i < repeat; i++) {
            System.out.print(str);
        }
    }

}

