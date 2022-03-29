package Zadachi.BasicSyntaxConditionalStatementsandLoopsExercise;

import java.io.StringReader;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        int lenght = username.length();

        String revUsername = "";
        boolean isLogged = false;
        for (int i = lenght - 1; i >= 0; i--) {
            revUsername = revUsername + username.charAt(i);
        }
        int count = 0;
        for (int j = 1; j <= 4; j++) {

            String pass = scanner.nextLine();
            if (pass.equals(revUsername)) {
                System.out.printf("User %s logged in.", username);
                isLogged = true;
                break;
            } else {
                if (count < 3) {
                    System.out.println("Incorrect password. Try again.");
                    count++;
                }else {
                    break;
                }
            }
        }
        if (!isLogged) {
            System.out.printf("User %s blocked!", username);
        }
    }
}
