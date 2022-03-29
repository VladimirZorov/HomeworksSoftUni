package Zadachi.ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        int []values = new int[n];

        for (int names = 0; names <n ; names++) {
            String inputNames= scanner.nextLine();
            double totalNameValue=0;
            for (int letter = 0; letter <inputNames.length() ; letter++) {
                int vowelValue=0;
                int consonantValue=0;
                if (inputNames.charAt(letter)=='a' ||inputNames.charAt(letter)=='A'
                        ||inputNames.charAt(letter)=='e' ||inputNames.charAt(letter)=='E'
                        ||inputNames.charAt(letter)=='i' ||inputNames.charAt(letter)=='I'
                        ||inputNames.charAt(letter)=='o' ||inputNames.charAt(letter)=='O'
                        ||inputNames.charAt(letter)=='u' ||inputNames.charAt(letter)=='U'){
                    vowelValue+=inputNames.charAt(letter)*(inputNames.length());

                } else {
                    consonantValue+=inputNames.charAt(letter)/(inputNames.length());
                }
                totalNameValue+=vowelValue+consonantValue;
            }
            values[names]=(int)totalNameValue;

        }
        for (int index = 0; index < values.length; index++) {
            int nextIndex=index+1;
            int valueOfMovedIndex=values[index];
            for (int i = nextIndex; i <values.length ; i++) {
                if (values[index]>values[i]){
                    values[index]=values[i];
                    values[i]=valueOfMovedIndex;
                }
            }

        }

        for (int i = 0; i < values.length ; i++) {
            System.out.println(values[i]);

        }
    }



}
