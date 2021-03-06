package Zadachi.RegularExpressionsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replace(" ", "");
        String[] tickets = input.split(",");
        for (String ticket : tickets) {
            if (ticket.length() < 20 || ticket.length() > 20) {
                System.out.println("invalid ticket");
            } else {
                String firstHalfTicket = ticket.substring(0, 10);
                String secondHalfTicket = ticket.substring(10);
                int firstCounter = 1;
                int secondCounter = 1;
                String symbol = "";
                for (int i = 1; i < firstHalfTicket.length(); i++) {
                    if (firstHalfTicket.charAt(i - 1) == firstHalfTicket.charAt(i)
                            && (firstHalfTicket.charAt(i - 1) == '@'
                            || firstHalfTicket.charAt(i - 1) == '#'
                            || firstHalfTicket.charAt(i - 1) == '$'
                            || firstHalfTicket.charAt(i - 1) == '^')) {
                        firstCounter++;
                        symbol = String.valueOf(firstHalfTicket.charAt(i - 1));
                    } else if (firstCounter < 6) {
                        firstCounter = 1;
                    }
                }
                for (int i = 1; i < secondHalfTicket.length(); i++) {
                    if (secondHalfTicket.charAt(i - 1) == secondHalfTicket.charAt(i)
                            && (secondHalfTicket.charAt(i - 1) == '@'
                            || secondHalfTicket.charAt(i - 1) == '#'
                            || secondHalfTicket.charAt(i - 1) == '$'
                            || secondHalfTicket.charAt(i - 1) == '^')
                            && symbol.equals(String.valueOf(secondHalfTicket.charAt(i - 1)))) {
                        secondCounter++;
                    } else if (secondCounter < 6) {
                        secondCounter = 1;
                    }
                }
                int counter = Math.min(firstCounter, secondCounter);
                if (counter < 6) {
                    System.out.println(String.format("ticket \"%s\" - no match", ticket));
                } else if (counter != 10) {
                    System.out.println(String.format("ticket \"%s\" - %d%s", ticket, counter, symbol));
                } else {
                    System.out.println(String.format("ticket \"%s\" - %d%s Jackpot!", ticket, counter, symbol));
                }
            }
        }

    }

}
