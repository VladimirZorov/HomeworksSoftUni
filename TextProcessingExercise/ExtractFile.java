package Zadachi.TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String fileName = input.substring(input.lastIndexOf("\\") + 1, input.indexOf("."));
        String fileExtension = input.substring(input.indexOf(".") + 1);

        System.out.printf("File name: %s%nFile extension: %s", fileName, fileExtension);
    }
}
