
public class InserisciSimboloComputer {
    private static int turniComputer = 0;

    public static char inserisciSimboloComputer(char[][] griglia, char turno, int COLONNE, char simboloGiocatore, char simboloComputer) {
        int colonna;
        int riga;

        if (turno == simboloGiocatore) {
            turno = InserisciSimbolo.inserisciSimbolo(griglia, turno, COLONNE, simboloGiocatore, simboloComputer);
        } else {
            turniComputer++;
            if (turniComputer <= 3) {
                do {
                    colonna = (int) (Math.random() * COLONNE);
                } while (!PosizioneValida.posizioneValida(griglia, colonna, ' '));
            } else {
                colonna = MossaMigliore.mossaMigliore(griglia, griglia.length, COLONNE, simboloComputer, simboloGiocatore);
                if (colonna == -1) {
                    do {
                        colonna = (int) (Math.random() * COLONNE);
                    } while (!PosizioneValida.posizioneValida(griglia, colonna, ' '));
                }
            }

            riga = ProssimaRigaVuota.prossimaRigaVuota(griglia, colonna);
            griglia[riga][colonna] = simboloComputer;
            System.out.println("Computer sceglie la colonna " + (colonna + 1));

            turno = simboloGiocatore;
        }
        return turno;
    }

    public static void resetTurniComputer() {
        turniComputer = 0;
    }
}
