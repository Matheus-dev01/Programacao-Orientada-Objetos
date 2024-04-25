import java.util.*;

public class App {

    private static final Scanner READ = new Scanner(System.in);
    private static final int TAMANHO_VETOR = 2;
    private static final int[] VETOR = new int[TAMANHO_VETOR];
    public static void main(String[] args) throws Exception {
        preencherVetor(VETOR);
        int numeroDigitado = Integer.parseInt(READ.nextLine());
        boolean numeroEncontrado = buscarNumero(numeroDigitado);

        if(numeroEncontrado == true){
            System.out.println("ACHEI");
        }
        else{
            System.out.println("NAO ACHEI");
        }
    }

    public static void preencherVetor(int[] VETOR){
        for(int i = 0; i < TAMANHO_VETOR; i++){
            VETOR[i] = Integer.parseInt(READ.nextLine());
        }
    }

    public static boolean buscarNumero(int numeroDigitado){
        boolean numeroProcurado = false;
        
        for(int i = 0; i < TAMANHO_VETOR; i++){
            if(VETOR[i] == numeroDigitado){
                numeroProcurado = true;
            }
        }
        return numeroProcurado;
    }
}
