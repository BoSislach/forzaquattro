public class AlternaTurni {
    public static char alternaTurni(char turno, char simboloGiocatore1, char simboloGiocatore2) {
        if (turno == simboloGiocatore1) {
            return simboloGiocatore2;
        } else {
            return simboloGiocatore1;
        }
    }
}
