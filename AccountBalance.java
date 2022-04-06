import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Double totalSum = 0.0;

        while (!input.equals("NoMoreMoney")) {
            Double money = Double.parseDouble(input);
            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            totalSum += money;
            System.out.printf("Increase: %.2f%n", money);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
