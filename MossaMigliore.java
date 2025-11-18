public class MossaComputer {
    public static char inserisciSimbolo(char[][] griglia, char turno, int COLONNE, char simboloGiocatore1, char simboloGiocatore2) {
        int turniComputer = 0;
        
        if (turno == simboloGiocatore1) {
            return InserisciSimbolo.inserisciSimbolo(griglia, turno, COLONNE, simboloGiocatore1, simboloGiocatore2);
        }
        
        turniComputer++;
        int colonna;
        
        if (turniComputer <= 3) {
            do {
                colonna = (int) (Math.random() * COLONNE);
            } while (!PosizioneValida.posizioneValida(griglia, colonna, ' '));
        } else {
            colonna = MossaMigliore.mossaMigliore(griglia, griglia.length, COLONNE, simboloGiocatore2, simboloGiocatore1);
            
            if (colonna == -1) {
                do {
                    colonna = (int) (Math.random() * COLONNE);
                } while (!PosizioneValida.posizioneValida(griglia, colonna, ' '));
            }
        }
        
        int riga = ProssimaRigaVuota.prossimaRigaVuota(griglia, colonna);
        griglia[riga][colonna] = simboloGiocatore2;
        System.out.println("Computer sceglie la colonna " + (colonna + 1));
        
        return simboloGiocatore1;
    }
}
