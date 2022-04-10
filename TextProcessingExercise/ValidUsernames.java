package Zadachi.TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //"sh, too_long_username, !lleg@l ch@rs, jeffbutt"
        String [] usernames = input.split(", ");//["sh", "too_long_username", "!lleg@l ch@rs", "jeffbutt"]

        for (String username : usernames) {
            //проверка дали е валиден
            //true -> валиден
            //false -> невалиден
            if(isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValidUsername(String username) {
        //дължина е между 3 и 16
        //не е валидна
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        //валидно съдържание: букви, цифри, -, _
        for (char symbol : username.toCharArray()) {
            if (!(symbol == '-' || symbol == '_' || Character.isLetterOrDigit(symbol))) {
                return false;
            }
        }
        return true;
    }
}
