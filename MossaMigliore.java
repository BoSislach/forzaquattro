public class MossaMigliore {
    public static int mossaMigliore(char[][] griglia, int RIGHE, int COLONNE, char simboloComputer, char simboloGiocatore) {
        
        for (int colonna = 0; colonna < COLONNE; colonna++) {
            if (PosizioneValida.posizioneValida(griglia, colonna, ' ')) {
                int riga = ProssimaRigaVuota.prossimaRigaVuota(griglia, colonna);
                griglia[riga][colonna] = simboloComputer;
                if (ControllaVincita.controllaVincita(griglia, RIGHE, COLONNE, simboloComputer)) {
                    griglia[riga][colonna] = ' '; 
                    return colonna; 
                }
                griglia[riga][colonna] = ' '; 
            }
        }

        for (int colonna = 0; colonna < COLONNE; colonna++) {
            if (PosizioneValida.posizioneValida(griglia, colonna, ' ')) {
                int riga = ProssimaRigaVuota.prossimaRigaVuota(griglia, colonna);
                griglia[riga][colonna] = simboloGiocatore; 
                if (ControllaVincita.controllaVincita(griglia, RIGHE, COLONNE, simboloGiocatore)) {
                    griglia[riga][colonna] = ' '; 
                    return colonna;
                }
                griglia[riga][colonna] = ' ';
            }
        }

        for (int colonna = 0; colonna < COLONNE; colonna++) {
            if (PosizioneValida.posizioneValida(griglia, colonna, ' ')) {
                return colonna;
            }
        }

        return -1; 
    }
}
