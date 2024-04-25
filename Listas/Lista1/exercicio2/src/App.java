import java.util.*;

public class App {

    private static final Scanner READ = new Scanner(System.in);
    private static final int TAMANHO_MATRIZ = 4;
    private static final boolean[][] MATRIZ = new boolean[TAMANHO_MATRIZ][TAMANHO_MATRIZ];
    public static void main(String[] args) throws Exception {
        preencherMatriz(MATRIZ);
        int linha = Integer.parseInt(READ.nextLine());
        int coluna = Integer.parseInt(READ.nextLine());      
        receberCoordenadas(linha, coluna);
        imprimirMatriz();
    }
    public static void preencherMatriz(boolean[][] MATRIZ){
        for(int i = 0; i < TAMANHO_MATRIZ; i++){
            for(int j = 0; j < TAMANHO_MATRIZ; j++){
                MATRIZ[i][j] = false;
            }
        }
    }
    public static void receberCoordenadas(int linha, int coluna){
        for(int i = 0; i < TAMANHO_MATRIZ; i++){
            for(int j = 0; j < TAMANHO_MATRIZ; j++){
                if(i == linha && j == coluna){
                    MATRIZ[i][j] = true;
                }
            }
        }
    }
    public static void imprimirMatriz(){
        for(int i = 0; i < TAMANHO_MATRIZ; i++){
            for(int j = 0; j < TAMANHO_MATRIZ; j++){
                if(MATRIZ[i][j] == true){
                    System.out.print("|O");
                }
                else
                {
                    System.out.print("|X");
                }
            }
            System.out.println("|");
        }
    }
}