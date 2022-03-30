package Zadachi.DataTypesandVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NPokePower = Integer.parseInt(scanner.nextLine());
        int MPokeTarget = Integer.parseInt(scanner.nextLine());
        int YexhaustionFactor = Integer.parseInt(scanner.nextLine());


        int counTarget = 0;
        double halfNPokePower = NPokePower * 0.5;


        while (NPokePower >= MPokeTarget) {
            if (halfNPokePower != NPokePower) {
                NPokePower = NPokePower - MPokeTarget;
                counTarget++;
            } else {
                if (YexhaustionFactor > 0) {
                    NPokePower = NPokePower / YexhaustionFactor;
                }else  {
                    NPokePower = NPokePower - MPokeTarget;
                    counTarget++;
                }
            }
        }
        System.out.println(NPokePower);
        System.out.println(counTarget);
    }
}
