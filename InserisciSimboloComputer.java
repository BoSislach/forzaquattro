public class InserisciSimboloComputer {
    public static int inserisciSimboloComputer(char[][] griglia, char turno, int COLONNE, char simboloGiocatore1, char simboloComputer) {
        
        char pedina = turno;
        int colonna;
        int counterMosseComputer = 0;
        
        do {
            colonna = (int) (Math.random() * COLONNE);
            counterMosseComputer++;
            
        } while (!PosizioneValida.posizioneValida(griglia, colonna, ' ') && counterMosseComputer < 4);

        do {
           
            colonna = MossaMigliore.mossaMigliore(griglia, griglia.length, COLONNE, simboloGiocatore1, simboloComputer);
            
        } while (!PosizioneValida.posizioneValida(griglia, colonna, ' '));

        System.out.println("Computer sceglie la colonna " + (colonna + 1));
        return colonna;
    }
}
