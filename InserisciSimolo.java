import java.util.Scanner;

public class InserisciSimolo {
    public static void inserisciSimbolo(char[][] griglia, int COLONNE, int RIGHE, char simboloGiocatore1, char simboloGiocatore2)
    {
        Scanner scanner = new Scanner(System.in);
        StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);
        int colonnaScelta;
        do {
            System.out.print("Inserisci la colonna (1-7) per il simbolo: ");
            colonnaScelta = scanner.nextInt();
            
            if (colonnaScelta < 1 || colonnaScelta > COLONNE) {
            System.out.println("Colonna non valida. Scegli un numero tra 1 e 7.");
            }
        } while (colonnaScelta < 1 || colonnaScelta > COLONNE);
        StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);
    }
}
