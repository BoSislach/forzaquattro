public class StampaGriglia {
    public static void stampaGriglia(char[][] griglia, int RIGHE, int COLONNE) {
        System.out.println();
        for (int i = 0; i < RIGHE; i++) {
            System.out.print("|");
            for (int j = 0; j < COLONNE; j++) {
                System.out.print(griglia[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("---------------");
        System.out.println(" 1 2 3 4 5 6 7 ");
        System.out.println();
    }
}
