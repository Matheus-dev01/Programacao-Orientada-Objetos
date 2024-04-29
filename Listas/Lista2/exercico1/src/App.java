import java.util.*;

public class App {

    private static final int QUANTIDADE_DE_PERGUNTAS = 3;
    private static final String[] REPOSTAS = new String[QUANTIDADE_DE_PERGUNTAS];
    private static final String[] GABARITO = new String[QUANTIDADE_DE_PERGUNTAS];
    private static final Scanner READ = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nome = ReceberNomePartcipante();
        Saudacao(nome);
        PrimeiraPergunta(nome);
        SegundaPergunta(nome);
        TerceiraPergunta(nome);
        Resultado(nome);
        Agradecimentos(nome);
    }
    public static String ReceberNomePartcipante(){
        System.out.println("Digite seu nome: ");
        return FormatarNome(READ.nextLine());
    }
    public static String FormatarNome(String nome){
        if(nome.isBlank()){
            return "NPC";
        }
        nome.trim();
        String primeiraLetradoNome = String.valueOf(nome.charAt(0));
        String nomeSemLetraInicial = nome.substring(1);
        String nomeFormatado = primeiraLetradoNome.toUpperCase() + nomeSemLetraInicial.toLowerCase(); 
        return nomeFormatado;
    }
    public static void Saudacao(String nome){
        System.out.println(String.format(
            """
            Olá, %s!
            Vamos começar o Quiz sobre basquete.
            Segue as regras:
            Se a tecla digitada for diferente das alternativas a questão será considerada como errada;

            Tecle Enter para começar o quiz...
            """, nome
        ));        
        READ.nextLine();
    }
    public static void PrimeiraPergunta(String nome){
        String resposta = "";

        do{
            System.out.println(
                """
                1 - Qual o jogador com mais titulos na história do basquete?

                (A) Michael Jordan
                (B) LeBron James
                (C) Bill Russell
                (D) Sam Jones
                """
            );
            resposta = READ.nextLine();
            
        }while (!ValidarResposta(resposta));
        
        GABARITO[0] = "C";
        REPOSTAS[0] = resposta;
    }
    public static void SegundaPergunta(String nome){
        String resposta = "";

        do{
            System.out.println(
                """
                2 - Qual time foi ganhador do titulo da NBA na temporada 2022/2023?

                (A) Los Angeles Lakers
                (B) Denver Nuggets
                (C) Miami Heat
                (D) Golden State Warriors
                """
            );
            resposta = READ.nextLine();
            
        }while (!ValidarResposta(resposta));
        
        GABARITO[1] = "B";
        REPOSTAS[1] = resposta;
    }
    public static void TerceiraPergunta(String nome){
        String resposta = "";

        do{
            System.out.println(
                """
                3 - Qual o maior pontuador da história da NBA ?

                (A) Michael Jordan
                (B) LeBron James
                (C) Bill Russell
                (D) Stephen Curry 
                """
            );
            resposta = READ.nextLine();
            
        }while (!ValidarResposta(resposta));
        
        GABARITO[2] = "B";
        REPOSTAS[2] = resposta;
    }
    public static boolean ValidarResposta(String resposta) {
        if (resposta.isBlank()){
            System.out.println(
                """
                    Sua resposta não pode ser vazia.
                    Tente novamente!  
                """
            );
            return false;
        }
        return true;
    }
    public static void Resultado(String nome){
        System.out.println(String.format(
            """
                %s, Vamos ver se você sabe mesmo sobre basquete.  
            """, nome
        ));

            if(REPOSTAS[0].equalsIgnoreCase(GABARITO[0]) && REPOSTAS[1].equalsIgnoreCase(GABARITO[1]) && REPOSTAS[2].equalsIgnoreCase(GABARITO[2])){
                System.out.println(String.format(
                    """
                        Parabéns %s, você acertou todas!
                        Você sabe tudo sobre basquete.  
                    """, nome
                ));
            }
            else if(REPOSTAS[0].equalsIgnoreCase(GABARITO[0]) && REPOSTAS[1].equalsIgnoreCase(GABARITO[1]) || REPOSTAS[2].equalsIgnoreCase(GABARITO[2]) && REPOSTAS[1].equalsIgnoreCase(GABARITO[1]) || REPOSTAS[0].equalsIgnoreCase(GABARITO[0]) && REPOSTAS[2].equalsIgnoreCase(GABARITO[2])){
                System.out.println(String.format(
                    """
                        Parabéns %s, você acertou duas!
                        Você sabe bastante sobre basquete.  
                    """, nome
                ));
            }
            else if(REPOSTAS[0].equalsIgnoreCase(GABARITO[0]) == false && REPOSTAS[1].equalsIgnoreCase(GABARITO[1]) == false && REPOSTAS[2].equalsIgnoreCase(GABARITO[2]) == false){
                System.out.println(String.format(
                    """
                        %s, infelizmente você errou todas.
                        Você não sabe nada sobre basquete!  
                    """, nome
                ));
            }
            else{
                System.out.println(String.format(
                    """
                        Parabéns %s, você acertou uma!
                        Você sabe um pouco sobre basquete.  
                    """, nome
                ));
            }
        }
    public static void Agradecimentos(String nome) {
        System.out.println(String.format(
            """
               Obrigado %s por participar deste quiz, espero que tenha gostado!     
            """, nome
        ));
    }
}
