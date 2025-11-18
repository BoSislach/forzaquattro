public class MossaMigliore{
    public static int mossaMigliore(char[][] griglia, int RIGHE, int COLONNE, char simboloGiocatore, char simboloAvversario){
        for(int colonna = 0; colonna < COLONNE; colonna++){
            if(PosizioneValida.posizioneValida(griglia, colonna, ' ')){
                int riga = ProssimaRigaVuota.prossimaRigaVuota(griglia, colonna);
                griglia[riga][colonna] = simboloAvversario;
                if(ControllaVincita.controllaVincita(griglia, RIGHE, COLONNE, simboloAvversario)){
                    griglia[riga][colonna] = ' ';
                    return colonna;
                }
                griglia[riga][colonna] = ' ';
            }
        }

        for(int colonna = 0; colonna < COLONNE; colonna++){
            if(PosizioneValida.posizioneValida(griglia, colonna, ' ')){
                return colonna;
            }
        }
        return -1;
    }
}