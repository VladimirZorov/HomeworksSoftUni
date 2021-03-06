package Zadachi.ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            products.add(scanner.nextLine());
        }
        Collections.sort(products);
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "." + products.get(i));
        }
    }
}
