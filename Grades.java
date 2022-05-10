package methodsLab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());

        printGrade(grade);
    }
    public static void printGrade(int grade) {

        if (grade < 2.99 || grade > 2) {
            System.out.println("Fail");
        } else if (grade < 3.49 || grade > 3) {
            System.out.println("Poor");
        } else if (grade < 4.49 || grade > 3.50) {
            System.out.println("Good");
        } else if (grade<5.49 ||grade>4.5) {
            System.out.println("Very good");
        } else if (grade<6.00 ||grade>5.50) {
            System.out.println("Fail");
        }
    }
}
