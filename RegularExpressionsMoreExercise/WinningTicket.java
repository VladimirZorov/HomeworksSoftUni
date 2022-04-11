package Zadachi.RegularExpressionsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> tickets = Arrays.asList(input.split(",\\s+"));

        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).length() == 20) {
                    ticketWin(tickets,i);
            } else {
                System.out.println("invalid ticket");
            }
        }
    }
    static void ticketWin (List<String> tickets, int j) {
        Pattern jackPat = Pattern.compile("[$|@|#|^]{10,}");
        Matcher jackMatch = jackPat.matcher(tickets.get(j));

        Pattern winPat = Pattern.compile("([$|@|#|^]{6})\\S*(\\1)");
        Matcher winMatch = winPat.matcher(tickets.get(j));

        if (jackMatch.find()) {
            System.out.println("ticket " + tickets.get(j) + " - 6$ Jackpot!" );
        } else if (winMatch.find()) {
            System.out.println("ticket " + tickets.get(j) + " - {match length}{match symbol}");
        } else  {
            System.out.println("ticket " + tickets.get(j) + " - no match");
        }
    }

}
