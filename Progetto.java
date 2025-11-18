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

                    while (!isVittoria && !pareggio) {
                        Clear.screen();
                        System.out.println("\n");
                        StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);

                        turno = InserisciSimbolo.inserisciSimbolo(griglia, turno, COLONNE, simboloGiocatore1, simboloGiocatore2);

                        char simboloCorrente;
                        if (turno == simboloGiocatore1) {
                            simboloCorrente = simboloGiocatore2;
                        } else {
                            simboloCorrente = simboloGiocatore1;
                        }

                        isVittoria = ControllaVincita.controllaVincita(griglia, RIGHE, COLONNE, simboloCorrente);
                        if (isVittoria) {
                            Clear.screen();
                            System.out.println("\n");
                            StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);

                            System.out.println("\n");
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
                            Clear.screen();
                            System.out.println("\n");
                            StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);
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

                    while (!isVittoriaComputer && !pareggioComputer) {
                        Clear.screen();
                        System.out.println("\n");
                        StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);

                        char turnoPrecedente = turno;
                        turno = InserisciSimboloComputer.inserisciSimboloComputer(griglia, turno, COLONNE, simboloGiocatore1, simboloComputer);

                        char simboloCorrente;
                        if (turno == simboloGiocatore1) {
                            simboloCorrente = simboloComputer;
                        } else {
                            simboloCorrente = simboloGiocatore1;
                        }

                        isVittoriaComputer = ControllaVincita.controllaVincita(griglia, RIGHE, COLONNE, simboloCorrente);

                        if (isVittoriaComputer) {
                            Clear.screen();
                            System.out.println("\n");
                            StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);
                            System.out.println("Il giocatore " + simboloCorrente + " ha vinto!");
                            break;
                        }

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

                        if (pareggioComputer) {
                            Clear.screen();
                            System.out.println("\n");
                            StampaGriglia.stampaGriglia(griglia, RIGHE, COLONNE);
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
