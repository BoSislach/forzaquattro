public class PosizioneValida {
    public static boolean posizioneValida(char[][] griglia, int colonna, char VUOTO) {
        if (griglia[0][colonna] == VUOTO) {
            return true;
        } else {
            return false;  
        }
    }
}
