import java.util.*;

public class App {
    public static final int TAMANHO_VETOR = 3;
    public static final int[] VETOR = new int[TAMANHO_VETOR];
    public static final Scanner READ = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
       ReceberNotas(VETOR);
       ImprimirMedia(VETOR);
    }
    public static void ReceberNotas(int[] VETOR){
        for (int i = 0; i < VETOR.length; i++) {
            VETOR[i] = Integer.parseInt(READ.nextLine());
        }
    }
    public static void ImprimirMedia(int[] VETOR){
        int Media = 0;
        for (int i = 0; i < VETOR.length; i++) {
            Media = Media + VETOR[i];
        }
        Media =  Media / TAMANHO_VETOR;
        System.out.println(Media);
    }
}
