public class ControllaVincita{
    public static boolean controllaVincita(char[][] griglia, int RIGHE, int COLONNE, char simbolo){
        for(int i = 0; i < RIGHE; i++){
            for(int j = 0; j <= COLONNE - 4; j++){
                if(griglia[i][j] == simbolo && griglia[i][j+1] == simbolo && griglia[i][j+2] == simbolo && griglia[i][j+3] == simbolo){
                    return true;
                }
            }
        }

        for(int i = 0; i <= RIGHE - 4; i++){
            for(int j = 0; j < COLONNE; j++){
                if(griglia[i][j] == simbolo && griglia[i+1][j] == simbolo && griglia[i+2][j] == simbolo && griglia[i+3][j] == simbolo){
                    return true;
                }
            }
        }
        
        for(int i = 0; i <= RIGHE - 4; i++){
            for(int j = 0; j <= COLONNE - 4; j++){
                if(griglia[i][j] == simbolo && griglia[i+1][j+1] == simbolo && griglia[i+2][j+2] == simbolo && griglia[i+3][j+3] == simbolo){
                    return true;
                }
            }
        }
        
        for(int i = 0; i <= RIGHE - 4; i++){
            for(int j = 3; j < COLONNE; j++){
                if(griglia[i][j] == simbolo && griglia[i+1][j-1] == simbolo && griglia[i+2][j-2] == simbolo && griglia[i+3][j-3] == simbolo){
                    return true;
                }
            }
        }
        return false;
    }
}