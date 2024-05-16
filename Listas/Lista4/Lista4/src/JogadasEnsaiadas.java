public class JogadasEnsaiadas {
    boolean sabeFazer;
    int velocidade;
    boolean ehEfetiva;

    public void novaJogada(){
        System.out.println("Vamos nos reunir para criar uma nova jogada ensaiada!");
        sabeFazer = false;
        velocidade = 0;
        ehEfetiva = false;
    }

    public void treinarJogada(){
        System.out.println("Vamos treinar nossas jogadas ensaiadas!");
        ehEfetiva = true;
        velocidade++;
        sabeFazer = true;
    }

    public void imprimirDetalhes(){
        System.out.println("\nDados das jogadas ensaiadas");
        System.out.println("Sabe fazer? " + sabeFazer);
        System.out.println("Velocidade da jogada: " + velocidade);
        System.out.println("Eh efetiva? " + ehEfetiva);
    }

}
