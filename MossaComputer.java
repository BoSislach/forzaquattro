
public class MossaComputer {

    public static char inserisciSimbolo(char[][] griglia, char turno, int COLONNE, char simboloGiocatore1, char simboloGiocatore2) {
        char pedina = turno;
        if (!PosizioneValida.posizioneValida(griglia, InserisciSimboloComputer.inserisciSimboloComputer(griglia, turno, COLONNE, simboloGiocatore1, simboloGiocatore2), ' ')) {
            System.out.println("Colonna piena");
            return turno;
        }

        int riga = ProssimaRigaVuota.prossimaRigaVuota(griglia, InserisciSimboloComputer.inserisciSimboloComputer(griglia, turno, COLONNE, simboloGiocatore1, simboloGiocatore2));
        griglia[riga][InserisciSimboloComputer.inserisciSimboloComputer(griglia, turno, COLONNE, simboloGiocatore1, simboloGiocatore2)] = pedina;
        StampaGriglia.stampaGriglia(griglia, griglia.length, COLONNE);
        if (turno == simboloGiocatore1) {
            return simboloGiocatore2;
        } else {
            return simboloGiocatore1;
        }

    }
}
