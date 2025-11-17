import java.util.Scanner;
public class Progetto {  
    public static void main(String[] args) {
        int RIGHE = 6;
        int COLONNE = 7;
        char niente = ' ';
        char simboloGiocatore1 = 'X';
        char simboloGiocatore2 = 'O';
        char[][] griglia = new char[RIGHE][COLONNE];

        InizializzaGriglia.inizializzaGriglia(griglia, RIGHE, COLONNE, niente);

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
                    
                    InserisciSimolo.inserisciSimbolo(griglia, COLONNE, RIGHE, simboloGiocatore1, simboloGiocatore2);
                    sceltaValida = true;
                    break;
                case 2:
                    
                    InserisciSimolo.inserisciSimbolo(griglia, COLONNE, RIGHE, simboloGiocatore1, simboloGiocatore2);
                    sceltaValida = true;
                    break;
                default:
                    System.out.println("Scelta non valida. Inserisci 1 o 2");
                    break;
            }
        }
        
        scanner.close();
    }
}
