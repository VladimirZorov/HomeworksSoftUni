package Zadachi.ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numsReversed = new ArrayList<Integer>(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < 0) {
                nums.remove(i);
                i--;
            }
        }
        if (nums.size() == 0) {
            System.out.println("empty");
        } else {
            for (int i = nums.size()-1; i >= 0 ; i--) {
                numsReversed.add(nums.get(i));
            }
        }

        System.out.println(numsReversed.toString().replaceAll("[\\[\\],]", ""));
    }
}

