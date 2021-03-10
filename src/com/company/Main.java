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
        char currentPlayer; // joueur dont le tour est en cours
        boolean win; // True pour victoire, false pour défaite
        int sumResult = 0;//Nombre de jetons alignés
        char[][] board = new char[nbl][nbc]; // tableau du puissance 4
        int c; // coordonnée colonne du dernier coup joué
        int l;// coordonnée ligne du dernier coup joué

    }


// Chronologie
        // demander le nom des players

        // demander au jour d'indiquer sa colonne de jeu

        // Mettre le jeton au bon endroit dans la colonne

        // Test ligne (fonction)

    private static boolean testligne(int c,  int ruleCoins, int l,char currentPlayer,char[][] board1 ) {
        int sumResult = 0;
        int testc = (c-1) - (ruleCoins - 1);
        if (testc < 0) {
            testc = 0;
        }

        for (int i=testc; i< (2 * ruleCoins) -1 && i < ((board1[0].length)) && sumResult < 4  ; i++) {
            sumResult = (board1[l][i] == currentPlayer) ? sumResult + 1 :  0;
        }

        return sumResult == 4;
    }
        // Test colonne (fonction)

    private static boolean testcolonne(int c,  int ruleCoins, int l,char currentPlayer,char[][] board1 ) {
        int sumResult = 0;
        int testl = (l-1) - (ruleCoins - 1);
        if (testl < 0) {
            testl = 0;
        }

                for (int i=testl; i< (2 * ruleCoins) -1 && i < ((board1.length)) && sumResult < ruleCoins  ; i++) {
            sumResult = (board1[i][c] == currentPlayer) ? sumResult + 1 :  0;

        }

            return sumResult == ruleCoins;
        }

        // Test diagonale montante (fonction)

    private static boolean testdiagonalemontante(int c,  int ruleCoins, int l,char currentPlayer,char[][] board1 ) {
        int sumResult = 0;
        int testl = (l-1) - (ruleCoins - 1);
        if (testl < 0) {
            testl = 0;}
        int testc = (c-1) - (ruleCoins - 1);
        if (testc < 0) {
            testc = 0;}


           for (int i=testl,j=testc; i< (2 * ruleCoins) -1 && i < ((board1.length)) && sumResult < ruleCoins && j< (2 * ruleCoins) -1 && j < ((board1[0].length)); i++,j++) { // on balaye l'intégralité des cases à tester sous conditions de respect de la longueur du tableau ou bien lorsqu'on a atteint un résultat à 4
            sumResult = (board1[i][j] == currentPlayer) ? sumResult + 1 :  0;

        }
        return sumResult == ruleCoins;
    }
        // Test diagonale descendante(fonction)

        // afficher le tableau

        // Victoire ou non ? (si non: changement de joueur)

    }

