package Exam6;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastDays = Integer.parseInt(scanner.nextLine());
        int plunderForDay = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double totalPlunder = 0;

        for (int i = 1; i <= lastDays; i++) {
            if (i % 3 == 0) {
                totalPlunder += plunderForDay * 1.5;
            } else if ( i% 5 == 0) {
                totalPlunder += plunderForDay;
                totalPlunder = totalPlunder * 0.7;
            } else  {
                totalPlunder += plunderForDay;
            }
        }

        double percentage = (totalPlunder/expectedPlunder)*100;
        if (totalPlunder>=expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
