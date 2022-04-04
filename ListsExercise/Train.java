package Zadachi.ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int capacyti = Integer.parseInt(scanner.nextLine());
        int newWagon = 0;
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                wagons.add(Integer.valueOf(command[1]));
            } else {
                for (int i = 0; i < wagons.size(); i++) {

                    newWagon = Integer.valueOf(wagons.get(i)) + Integer.valueOf(command[0]);
                    if (newWagon <= capacyti) {
                        addPassangers(newWagon, wagons, i);
                        newWagon = 0;
                        break;
                    } else {
                        newWagon = 0;
                        i++;
                        newWagon = Integer.valueOf(wagons.get(i)) + Integer.valueOf(command[0]);
                        if (newWagon <= capacyti) {
                            addPassangers(newWagon, wagons, i);
                            newWagon = 0;
                           break;
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
    public static Integer addPassangers(int newWagon, List<Integer> wagons, int i){
        wagons.remove(i);
        wagons.add(i, Integer.valueOf(newWagon));
    return i;
    }
}
