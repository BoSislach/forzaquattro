public class ProssimaRigaVuota {
    public static int prossimaRigaVuota(char[][] griglia, int colonna) {
        for (int i = griglia.length - 1; i >= 0; i--) {
            if (griglia[i][colonna] == ' ') {
                return i;
            }
        }
        return -1; 
    }
}