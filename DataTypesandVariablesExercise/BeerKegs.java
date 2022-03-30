package Zadachi.DataTypesandVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = 0.0;
        String modelMaxVolume = "";

        for (int i = 1; i <= numOfKegs ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volumeOfKeg = Math.PI * radius*radius*height;
            if (volumeOfKeg > maxVolume) {
                maxVolume = volumeOfKeg;
                modelMaxVolume = model;
            }
        }
        System.out.println(modelMaxVolume);
    }
}
