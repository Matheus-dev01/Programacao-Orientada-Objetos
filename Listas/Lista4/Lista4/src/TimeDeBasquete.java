public class TimeDeBasquete {
    String nomeDoTime;
    int quantidadeJogadores;
    boolean ehForte;

    public void reunião(){
        System.out.println("Quanto melhor nos conhecermos mais entrosados seremos!");
    }

    public void treinar(){
        System.out.println("Vamos treinar!");
        ehForte = true;
    }

    public void imprimirDetalhes(){
        System.out.println("\nDados do time");
        System.out.println("Nome do time: " + nomeDoTime);
        System.out.println("Quantidade de jogadores: " + quantidadeJogadores);
        System.out.println("Eh forte? " + ehForte);
    }
}
