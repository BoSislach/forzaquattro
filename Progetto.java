
import java.util.Scanner;

public class Progetto {

    public static void main(String[] args) {
        int RIGHE = 6;
        int COLONNE = 7;
        char niente = ' ';
        char simboloGiocatore1 = 'X';
        char simboloGiocatore2 = 'O';
        char simboloComputer;
        char turno = simboloGiocatore1;
        char[][] griglia = new char[RIGHE][COLONNE];

        InizializzaGriglia.inizializzaGriglia(griglia, RIGHE, COLONNE, niente);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli la modalità di gioco: ");
        System.out.println("1. Giocatore vs Giocatore");
        System.out.println("2. Giocatore vs Computer");

        int scelta = 0;
        boolean sceltaValida = false;

        while (!sceltaValida) {
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Modalità scelta: Giocatore vs Giocatore");
                    sceltaValida = true;
                    boolean isVittoria = false;
                    boolean pareggio = false;

                    StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);

                    while (!isVittoria && !pareggio) {
                        
                        turno = InserisciSimbolo.inserisciSimbolo(griglia, turno, COLONNE, simboloGiocatore1, simboloGiocatore2, scanner);

                        char simboloCorrente;
                        if (turno == simboloGiocatore1) {
                            simboloCorrente = simboloGiocatore2;
                        } else {
                            simboloCorrente = simboloGiocatore1;
                        }

                        isVittoria = ControllaVincita.controllaVincita(griglia, RIGHE, COLONNE, simboloCorrente);
                        Clear.screen();
                        System.out.println("\n");
                        StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);
                        if (isVittoria) {
                            System.out.println("Il giocatore " + simboloCorrente + " ha vinto!");
                            break;
                        }

                        pareggio = true;
                        for (int i = 0; i < RIGHE; i++) {
                            for (int j = 0; j < COLONNE; j++) {
                                if (griglia[i][j] == niente) {
                                    pareggio = false;
                                    break;
                                }
                            }
                            if (!pareggio) {
                                break;
                            }
                        }

                        if (pareggio) {
                            System.out.println("Parità! La griglia è piena.");
                        }
                    }

                    break;

                case 2:
                    System.out.println("Modalità scelta: Giocatore vs Computer");
                    sceltaValida = true;
                    boolean isVittoriaComputer = false;
                    boolean pareggioComputer = false;
                    simboloComputer = simboloGiocatore2;


                    StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);

                    while (!isVittoriaComputer && !pareggioComputer) {


                        
                        turno = MossaComputer.inserisciSimbolo(griglia, turno, COLONNE, simboloGiocatore1, simboloComputer);
                        


                        
                        //rimanere
                        char simboloCorrente;
                        if (turno == simboloGiocatore1) {
                            simboloCorrente = simboloComputer;
                        } else {
                            simboloCorrente = simboloGiocatore1;
                        }

                        isVittoriaComputer = ControllaVincita.controllaVincita(griglia, RIGHE, COLONNE, simboloCorrente); //rimanere
                        Clear.screen();//rimanere
                        System.out.println("\n");//rimanere
                        StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);//rimanere





                        if (isVittoriaComputer) {
                            System.out.println("Il giocatore " + simboloCorrente + " ha vinto!");
                            break;
                        }



                        
                        //rimanere
                        pareggioComputer = true;
                        for (int i = 0; i < RIGHE; i++) {
                            for (int j = 0; j < COLONNE; j++) {
                                if (griglia[i][j] == niente) {
                                    pareggioComputer = false;
                                    break;
                                }
                            }
                            if (!pareggioComputer) {
                                break;
                            }
                        }

                        //rimanere
                        if (pareggioComputer) {
                            System.out.println("Parità! La griglia è piena.");
                        }
                    }
                    
                    break;

                default:
                    System.out.println("Scelta non valida. Inserisci 1 o 2.");
                    break;
            }
        }
    }
}
