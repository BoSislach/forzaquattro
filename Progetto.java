import java.util.Scanner;

public class Progetto {

    public static void inserisciSimbolo(char[][] griglia, int COLONNE, char simboloGiocatore1, char simboloGiocatore2, int RIGHE) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la colonna (1-7) per il simbolo: \n");
        int colonnaScelta = scanner.nextInt();

        for (int i = RIGHE - 1; i >= 0; i--) {
            griglia[i][(colonnaScelta - 1) * 2 + 1] = simboloGiocatore1;
        }if(colonnaScelta < 1 || colonnaScelta > 7) {
            System.out.println("Colonna non valida. Inserisci un numero tra 1 e 7.");
            return;
        }
        stampaGriglia(griglia, RIGHE, COLONNE);
    }

    public static char alternaTurni() {

        return 'X';

       
    }

    static void inizializzaGriglia(char[][] griglia, int RIGHE, int COLONNE, char VUOTO) {
        for (int i = 0; i < RIGHE; j++) {
            for (int j = 0; j < COLONNE; j++) {
                griglia[i][j] = VUOTO;
            }
        }
    }


    public static void stampaGriglia(char[][] griglia, int righe, int colonne) {
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if(j%2==0){
                     griglia[i][j] = '|';
                }

                System.out.print(griglia[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println(" 1 2 3 4 5 6 7 ");
        System.out.println();
    }


    
    public static void main(String[] args) {
        

        int RIGHE = 6;
        int COLONNE = 7;
        char niente = ' ';
        char simboloGiocatore1 = 'X';
        char simboloGiocatore2 = 'O';
        char[][] griglia = new char[RIGHE][COLONNE];

        inizializzaGriglia(griglia, RIGHE, COLONNE, niente);
        System.out.println("Scegli la modalità di gioco: ");
        System.out.println("1. Giocatore vs Giocatore");
        System.out.println("2. Giocatore vs Computer");

        Scanner scanner = new Scanner(System.in);
        int scelta = 0;
        boolean sceltaValida = false;

        while (!sceltaValida) {
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    stampaGriglia(griglia, RIGHE, COLONNE);
                    inserisciSimbolo(griglia, COLONNE, simboloGiocatore1, simboloGiocatore2, RIGHE);
                    sceltaValida = true;
                    break;
                case 2:
                    stampaGriglia(griglia, RIGHE, COLONNE);
                    inserisciSimbolo(griglia, COLONNE, simboloGiocatore1, simboloGiocatore2, RIGHE);
                    sceltaValida = true;
                    break;
                default:
                    System.out.println("Scelta non valida. Inserisci 1 o 2");
                    break;
            }
        }
        

        
    }
}
