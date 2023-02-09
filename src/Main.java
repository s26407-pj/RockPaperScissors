import javafx.application.Platform;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Podaj swój ruch: r(rock), p(paper) lub s(scissors)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " jest niewłaściwym ruchem!");
            }

            System.out.println("Komputer zagrał: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("Remis!");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("Przegrałeś!");
                } else if (computerMove.equals("s")) {
                    System.out.println("Wygrałeś!");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("Przegrałeś!");
                } else if (computerMove.equals("r")) {
                    System.out.println("Wygrałeś!");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("Przegrałeś!");
                } else if (computerMove.equals("p")) {
                    System.out.println("Wygrałeś!");
                }
            }

            System.out.println("Chcesz zagrać jeszcze raz? (t/n)");
        }
    }
}