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
            int sumResult=0;
            int testc = c-(ruleCoins -1); // on veut revenir "rulecoins-1 (3)" colonnes en arrière par rapport au placement du pion du jour
            if (testc<0 ) { testc=0;} //  si le test sort du tableau, on limite aux bornes du tableau
            for (int i=0 ; i< 2*ruleCoins || i< board1.length|| sumResult ==4 ; i++){ // on balaye l'intégralité des cases à tester sous conditions de respect de la longueur du tableau ou bien lorsqu'on a atteint un résultat à 4
            //board1[testc][l] == currentPlayer ? sumResult = sumResult + 1 : sumResult = 0; // on teste chacune des cases et on accumule le résultat si signe identique sinon on remet le résultat à 0
            sumResult= (board1[testc][l] == currentPlayer)? sumResult + 1 : 0;
            }
            return sumResult==4;
        }
        // Test colonne (fonction)

        // Test diagonale montante (fonction)

        // Test diagonale descendante(fonction)

        // afficher le tableau

        // Victoire ou non ? (si non: changement de joueur)

    }

