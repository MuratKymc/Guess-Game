package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        RGenerator R1 = new RGenerator();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name for Player 1");
        String player1 = input.next();
        System.out.println("Enter a name for Player 2");
        String player2 = input.next();

        int player1Score = 0;
        int player2Score = 0;

        do {
            System.out.println("Enter a number from 0 to 100 for " + player1);
            int player1Guess = input.nextInt();
            System.out.println("Enter a number from 0 to 100 for " + player2);
            int player2Guess = input.nextInt();

            System.out.println("Random generated number is : " + R1.getValue());
            System.out.println(player1 + " guess is : " + player1Guess);
            System.out.println(player2 + " guess is : " + player2Guess);

            int differencePlayer1 = Math.abs(player1Guess - R1.getValue());
            int differencePlayer2 = Math.abs(player2Guess - R1.getValue());

            if (differencePlayer1 < differencePlayer2) {
                player1Score++;
            } else if (differencePlayer1 > differencePlayer2) {
                player2Score++;
            } else {
                player1Score++;
                player2Score++;
            }

            System.out.println("Press y for play one more round or press n for finish the game.");
            String cond = input.next();
            R1.changeValue();
            if (!cond.equals("y")) {
                break;
            }
        } while (true);


        System.out.println(player1 + " score : " + player1Score);
        System.out.println(player2 + " score : " + player2Score);
        if (player1Score > player2Score) {
            System.out.println(player1 + " WON");
        } else if (player2Score > player1Score) {
            System.out.println(player2 + " WON");
        } else {
            System.out.println("TIED UP!!");
        }



    }
}
