import java.util.Scanner;

public class App {
    public static final int AnoAtual = 2024;
    public static void main(String[] args) throws Exception{
        final Scanner READ = new Scanner(System.in);
        int AnoDeNascimento = Integer.parseInt(READ.nextLine());
        int idade = CalcularIdade(AnoDeNascimento);
        System.out.println("Ate o final de 2024 voce tera " + idade + " anos");
    }
    public static int CalcularIdade(int AnoDeNascimento){
        int Idade = AnoAtual - AnoDeNascimento;
        return Idade;
    }
}
