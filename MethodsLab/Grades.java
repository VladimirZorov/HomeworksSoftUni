package Zadachi.MethodsLab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        String gradeWord = "";
        if (grade >= 2.00 && grade<= 2.99) {
            gradeWord = "Fail";
            printGradeWord(gradeWord);
        }else if (grade >= 3.00 && grade<= 3.49) {
            gradeWord = "Poor";
            printGradeWord(gradeWord);
        }else if (grade >= 3.50 && grade<= 4.49) {
            gradeWord = "Good";
            printGradeWord(gradeWord);
        }else if (grade >= 4.50 && grade<= 5.49) {
            gradeWord = "Very good";
            printGradeWord(gradeWord);
        }else if (grade >= 5.50 && grade<= 6.00) {
            gradeWord = "Excellent";
            printGradeWord(gradeWord);
        }
    }

    private static void printGradeWord(String gradeWord) {
        System.out.println(gradeWord);
    }
}
