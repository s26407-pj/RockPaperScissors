import javafx.application.Platform;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"k", "p", "n"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Podaj swój ruch: k(kamień), p(paper) lub n(nożyce)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("k") || playerMove.equals("p") || playerMove.equals("n")) {
                    break;
                }
                System.out.println(playerMove + " jest niewłaściwym ruchem!");
            }
            System.out.println("Zagrałeś: " + fullName(playerMove));
            System.out.println("Komputer zagrał: " + fullName(computerMove));

            if (playerMove.equals(computerMove)) {
                System.out.println("Remis!");
            } else if (playerMove.equals("k")) {
                if (computerMove.equals("p")) {
                    System.out.println("Przegrałeś!");
                } else if (computerMove.equals("n")) {
                    System.out.println("Wygrałeś!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("n")) {
                    System.out.println("Przegrałeś!");
                } else if (computerMove.equals("k")) {
                    System.out.println("Wygrałeś!");
                }
            } else if (playerMove.equals("n")) {
                if (computerMove.equals("k")) {
                    System.out.println("Przegrałeś!");
                } else if (computerMove.equals("p")) {
                    System.out.println("Wygrałeś!");
                }
            }

            System.out.println("Chcesz zagrać jeszcze raz? (t/n)");
            String playAgain = scanner.nextLine();

            if (playAgain.equals("n")) {
                break;
            }
        }
    }

    private static String fullName(String move) {
        String moveToString;

        if (move.equals("k")) {
            moveToString = "kamień";
            return moveToString;
        } else if (move.equals("p")) {
            moveToString = "papier";
            return moveToString;
        } else {
            moveToString = "nożyce";
            return moveToString;
        }
    }
}