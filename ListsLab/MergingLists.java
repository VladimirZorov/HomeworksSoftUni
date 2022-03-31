package Zadachi.ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sizeNew = numbers1.size() + numbers2.size();

        List<Integer> merging = new ArrayList<>(sizeNew);

        int min = Math.min(numbers1.size(), numbers2.size());
        int max = Math.max(numbers1.size(), numbers2.size());


        for (int i = 0; i < max; i++) {
            if (i < min) {
                merging.add(numbers1.get(i));
                merging.add(numbers2.get(i));
            } else {
                if (numbers1.size() > numbers2.size()) {
                    merging.add(numbers1.get(i));
                } else {
                    merging.add(numbers2.get(i));
                }
            }
        }

        System.out.println(merging.toString().replaceAll(",", "")
                .replaceAll("\\[","")
                .replaceAll("\\]",""));

    }

}

