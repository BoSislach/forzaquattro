import java.util.Scanner;

public class Progetto {

    public static void inserisciSimbolo(char[][] griglia, int COLONNE, char simboloGiocatore1, char simboloGiocatore2, int RIGHE) {
        Scanner scanner = new Scanner(System.in);
        stampaGriglia(griglia, RIGHE, COLONNE);
        int colonnaScelta;
        do {
            System.out.print("Inserisci la colonna (1-7) per il simbolo: ");
            colonnaScelta = scanner.nextInt();
            
            if (colonnaScelta < 1 || colonnaScelta > COLONNE) {
            System.out.println("Colonna non valida. Scegli un numero tra 1 e 7.");
            }
        } while (colonnaScelta < 1 || colonnaScelta > COLONNE);

        


        stampaGriglia(griglia, RIGHE, COLONNE);
    }

    public static char alternaTurni() {

        return 'X';

       
    }

    static void inizializzaGriglia(char[][] griglia, int RIGHE, int COLONNE, char VUOTO) {
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                griglia[i][j] = VUOTO;
            }
        }
    }


    public static void stampaGriglia(char[][] griglia, int righe, int colonne) {
        
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
                    
                    inserisciSimbolo(griglia, COLONNE, simboloGiocatore1, simboloGiocatore2, RIGHE);
                    sceltaValida = true;
                    break;
                case 2:
                    
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
