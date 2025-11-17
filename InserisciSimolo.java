import java.util.Scanner;

public class InserisciSimbolo {
    static char inserisciSimbolo(char[][] griglia, char turno, int COLONNE, char simboloGiocatore1, char simboloGiocatore2, Scanner scanner) {
        char pedina = turno;

        System.out.print("Giocatore " + pedina + ", scegli una colonna (1-" + COLONNE + "): ");
        int colonna = scanner.nextInt() - 1;

        if (colonna < 0 || colonna >= COLONNE) {
            System.out.println("Mossa non valida, riprova!");
            return turno;
        }

        if (!PosizioneValida.posizioneValida(griglia, colonna, ' ')) {
            System.out.println("Colonna piena, scegli un'altra colonna.");
            return turno;
        }

        int riga = ProssimaRigaVuota.prossimaRigaVuota(griglia, colonna);
        griglia[riga][colonna] = pedina;
        StampaGriglia.stampaGriglia(griglia, griglia.length, COLONNE);
        return AlternaTurni.alternaTurni(turno, simboloGiocatore1, simboloGiocatore2);
    }
}
