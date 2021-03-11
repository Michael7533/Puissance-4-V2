package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // Liste des variables

        Scanner sc = new Scanner(System.in);
        int nbl = 8;//nombre de lignes dans le tableau
        int nbc = 9; // nombre de colonnes dans le tableau
        int ruleCoins = 4; // nombre de jetons alignés pour victoire
        String player1; // nom du joueur 1
        String player2; // nom du joueur 2
        char currentPlayer = 'X'; // joueur dont le tour est en cours
        boolean win = false; // True pour victoire, false pour défaite
        int sumResult = 0;//Nombre de jetons alignés
        char[][] board= new char[nbl][nbc]; // tableau du puissance 4
        int c = 0; // coordonnée colonne du dernier coup joué
        int l = 0;// coordonnée ligne du dernier coup joué

        // define board game

        for (l = 0; l <= nbl-1; l++) {
            for (c = 0; c <= nbc-1; c++) {
                board[l][c] = '-';
            }

        }
// Chronologie
        // demander le nom des players

        // demander au jour d'indiquer sa colonne de jeu
        while (!win) {
            System.out.println("Joueur suivant: " + currentPlayer + ", dans quelle colonne tu veux mettre le jeton entre 1 et 7:");
            c = sc.nextInt();
            sc.nextLine();

            // Mettre le jeton au bon endroit dans la colonne

            l = 0;
            boolean rempli = false;
            for (int i = 0; i <= 5 && rempli == false; i++) {
                if (board[i][c - 1] == '-') {
                    board[i][c - 1] = currentPlayer;
                    rempli = true;
                    l = l + 1;
                }
            }


            // Victoire ou non ? (si non: changement de joueur)
            if (testligne(c, ruleCoins, l, currentPlayer, board)) {
                win = true;}



            if (testcolonne(c, ruleCoins, l, currentPlayer, board)) {
                win = true;}
                System.out.println("winc"+ win);

            if (testdiagonalemontante(c, ruleCoins, l, currentPlayer, board)) {
                win = true;}
                System.out.println("winda"+ win);

            if (testdiagonaledescendante(c, ruleCoins, l, currentPlayer, board)) {
                win = true;}
                System.out.println("windd"+ win);





// afficher le tableau

            System.out.println("1|2|3|4|5|6|7|");
            System.out.println("___________________________-");
            for (l = nbl-1; l >= 0; l--) {
                for (c = 0; c <= nbc-1; c++) {
                    System.out.print(board[l][c] + "|");
                }
                System.out.println();
            }
            System.out.println("");


            if (win==true) {
                System.out.println("Andthewinneris" + currentPlayer);
            }

        }
    }

    // Test ligne (fonction)

    private static boolean testligne(int c, int ruleCoins, int l, char currentPlayer, char[][] board1) {
        int sumResult = 0;
        int testc = (c - 1) - (ruleCoins - 1);
        if (testc < 0) {
            testc = 0;
        }

        for (int i = testc; i < (2 * ruleCoins) - 1 && i < ((board1[0].length)) && sumResult < 4; i++) {
            sumResult = (board1[l][i] == currentPlayer) ? sumResult + 1 : 0;
        }

        return sumResult == ruleCoins;

        System.out.println("l"+l);
        System.out.println("c"+c);

        System.out.println("boardlength"+((board1.length)-1));

        System.out.println("testc"+testc);
        System.out.println("l"+l);
        System.out.println("currentPlayer"+currentPlayer);
        System.out.println("rulecoins"+ruleCoins);
        System.out.println("sumresult"+sumResult);

    }

    // Test colonne (fonction)

    private static boolean testcolonne(int c, int ruleCoins, int l, char currentPlayer, char[][] board1) {
        int sumResult = 0;
        int testl = (l - 1) - (ruleCoins - 1);
        if (testl < 0) {
            testl = 0;
        }

        for (int i = testl; i < (2 * ruleCoins) - 1 && i < ((board1.length)) && sumResult < ruleCoins; i++) {
            sumResult = (board1[i][c] == currentPlayer) ? sumResult + 1 : 0;

        }

        return sumResult == ruleCoins;
    }

    // Test diagonale montante (fonction)

    private static boolean testdiagonalemontante(int c, int ruleCoins, int l, char currentPlayer, char[][] board1) {
        int sumResult = 0;
        int testl = (l - 1) - (ruleCoins - 1);
        if (testl < 0) {
            testl = 0;
        }
        int testc = (c - 1) - (ruleCoins - 1);
        if (testc < 0) {
            testc = 0;
        }


        for (int i = testl, j = testc; i < (2 * ruleCoins) - 1 && i < ((board1.length)) && sumResult < ruleCoins && j < (2 * ruleCoins) - 1 && j < ((board1[0].length)); i++, j++) { // on balaye l'intégralité des cases à tester sous conditions de respect de la longueur du tableau ou bien lorsqu'on a atteint un résultat à 4
            sumResult = (board1[i][j] == currentPlayer) ? sumResult + 1 : 0;

        }
        return sumResult == ruleCoins;
    }

    // Test diagonale descendante(fonction)

    private static boolean testdiagonaledescendante(int c, int ruleCoins, int l, char currentPlayer, char[][] board1) {
        int sumResult = 0;
        int testl = (l - 1) + (ruleCoins - 1);
        if (testl > board1.length) {
            testl = board1.length - 1;
        }
        int testc = (c - 1) - (ruleCoins - 1);
        if (testc < 0) {
            testc = 0;
        }

        for (int i = testl, j = testc; i < (2 * ruleCoins) - 1 && i >= (0) && sumResult < ruleCoins && j < (2 * ruleCoins) - 1 && j < ((board1[0].length)); i--, j++) { // on balaye l'intégralité des cases à tester sous conditions de respect de la longueur du tableau ou bien lorsqu'on a atteint un résultat à 4
            sumResult = (board1[i][j] == currentPlayer) ? sumResult + 1 : 0;

        }

        return sumResult == ruleCoins;
    }






}

