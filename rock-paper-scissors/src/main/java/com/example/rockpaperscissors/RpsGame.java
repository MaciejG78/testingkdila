package com.example.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class RpsGame {

    private int numberOfWins = 0;
    private int numberOfLosses = 0;
    private int numberOfDraws = 0;
    private boolean endTheGame = false;
    private String playerName;
    private int winGameNumbers;

    Scanner scanner = new Scanner(System.in);

    public void initGame() {

        firstMenu();
        secondMenu();
        startGame();
    }

    private void firstMenu() {
        System.out.println("Welcome to Rock-Paper-Scissors! \n " +
                "Please enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("Please write game numbers to win: ");
        winGameNumbers = scanner.nextInt();
        System.out.println("Let's start the game!");
    }

    private void secondMenu() {
        System.out.println(
                """
                        Button info:
                        1 - zagranie "kamien"
                        2 - zagranie "papier"
                        3 - zagranie "nozyce"
                        x - zakonczenie gry poprzedzone pytaniem "Czy na pewno zakonczyc gre?"
                        n - uruchomienie gry od nowa poprzedzone pytaniem "Czy na pewno zakonczyc aktualną gre?"
                        """
        );
    }

    private void startGame() {
        do {
            System.out.println("-------------------------");
            System.out.print("Enter your move: ");
            String playerOption = scanner.next();

            exitGame(playerOption);
            restartGame(playerOption);

            Move playerMove;
            if (playerOption.equals("1") || playerOption.equals("2") || playerOption.equals("3")) {
                playerMove = Move.values()[Integer.valueOf(playerOption) - 1];
            } else {
                System.out.println("Your move isn't valid!");
                continue;
            }

            System.out.println("Player move: " + playerMove.getValue());
            Move computerMove = getComputerMove();

            printResult(playerMove, computerMove);

            if (numberOfWins == winGameNumbers) {
                System.out.println("It's end of the game");
                System.out.println("You won " + numberOfWins + " times, lost " + numberOfLosses + " times. Draws was " + numberOfDraws + "times.");
                System.out.println("Thanks for playing! See you again.");
                endTheGame = true;
            }
        } while (!endTheGame);
    }

    private void printResult(Move playerMove, Move computerMove) {
        if (playerMove == computerMove) {
            System.out.println("Draw!");
            numberOfDraws++;
        } else if (isPlayerWon(playerMove, computerMove)) {
            System.out.println("You won!");
            numberOfWins++;
        } else {
            System.out.println("You lost!");
            numberOfLosses++;
        }
    }

    private void restartGame(String playerOption) {
        if (playerOption.equals("n")) {
            System.out.print(playerName + " - Are you sure to restart the game? (y - yes / n - no): ");
            String playerDecision = scanner.nextLine();
            if (playerDecision.equals("y")) {
                numberOfWins = 0;
                numberOfLosses = 0;
                numberOfDraws = 0;
            }
        }
    }

    private void exitGame(String playerOption) {
        if (playerOption.equals("x")) {
            System.out.print(playerName + " - Are you sure to exit the game? (y - yes / n - no): ");
            String playerDecision = scanner.nextLine();
            if (playerDecision.equals("y")) {
                System.out.println("You won " + numberOfWins + " times, lost " + numberOfLosses + " times. Draws was " + numberOfDraws + "times.");
                System.out.println("Thanks for playing! See you again.");
                exit(0);
            }
        }
    }

    private static Move getComputerMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        Move computerMove = Move.values()[randomNumber];
        System.out.println("Computer move: " + computerMove.getValue());
        return computerMove;
    }

    private static boolean isPlayerWon(Move playerMove, Move computerMove) {
        return (playerMove == Move.ROCK && computerMove == Move.SCISSORS)
                || (playerMove == Move.SCISSORS && computerMove == Move.PAPER)
                || (playerMove == Move.PAPER && computerMove == Move.ROCK);
    }
}
