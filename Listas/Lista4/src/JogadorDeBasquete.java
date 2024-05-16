public class JogadorDeBasquete {
    String nome;
    double altura;
    int idade;
    int numeroDaCamisa;
    String posicao;
    boolean ehCapitao;
    boolean jogaBem;

    public void gritoDeGuerra(){
        System.out.println("Pra cima deles!!!");
    }

    public void organizarTime(){
        if (ehCapitao) {
            System.out.println("Voltem para suas posições");
        }
    }

    public void imprimirDetalhes(){
        System.out.println("\nDados do Jogador");
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
        System.out.println("Numero da camisa: " + numeroDaCamisa);
        System.out.println("Posição: " + posicao);
        System.out.println("Eh capitão? " + ehCapitao);
        System.out.println("Joga bem? " + jogaBem);
    }
}
