public class App {
    public static void main(String[] args) throws Exception {
        JogadorDeBasquete Jogador1 = new JogadorDeBasquete();
        Jogador1.nome = "Matheus";
        Jogador1.idade = 19;
        Jogador1.altura = 1.80;
        Jogador1.numeroDaCamisa = 24;
        Jogador1.posicao = "Ala-Pivô";
        Jogador1.ehCapitao = true;
        Jogador1.jogaBem = true;

        TimeDeBasquete Time = new TimeDeBasquete();
        Time.nomeDoTime = "Ursos";
        Time.quantidadeJogadores = 10;

        JogadasEnsaiadas Jogadas = new JogadasEnsaiadas();
        Jogadas.sabeFazer = false;
        Jogadas.velocidade = 0;
        Jogadas.ehEfetiva = false;

        Jogador1.imprimirDetalhes();
        Time.imprimirDetalhes();
        Jogadas.imprimirDetalhes();

    }
}
