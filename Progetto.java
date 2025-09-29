import java.util.Scanner;
public class Progetto {



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
        System.out.println("-----------------------");
        System.out.println(" 1  2  3  4  5  6  7 ");
    }

    public static void main(String[] args) {

        int righe = 16;
        int colonne = 16;
        char simboloGiocatore1 = 'X';
        char simboloGiocatore2 = 'O';
        char[][] griglia = new char[righe][colonne];


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
                    stampaGriglia(griglia, righe, colonne);
                    
                    sceltaValida = true;
                    break;
                case 2:
                    stampaGriglia(griglia, righe, colonne);
                    sceltaValida = true;
                    break;
                default:
                    System.out.println("Scelta non valida. Inserisci 1 o 2");
                    break;
            }
        }


        
    }
}
