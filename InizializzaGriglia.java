public class InizializzaGriglia {
    public static void inizializzaGriglia(char[][] griglia, int RIGHE, int COLONNE, char VUOTO) {
        for (int i = 0; i < RIGHE; i++) {
            for (int j = 0; j < COLONNE; j++) {
                griglia[i][j] = VUOTO;
            }
        }
    }
}
