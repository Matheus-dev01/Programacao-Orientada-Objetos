public class Musico {
    String nome;
    int idade;
    boolean ehInstrumentista;
    String instrumento;
    boolean ehCantor;

    public void imprimirDetalhes(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(ehInstrumentista);
        System.out.println(instrumento);
        System.out.println(ehCantor);
    }

    public void cantar(){
        if(ehCantor){
            System.out.println("LALAIA LALAIA LAIA");
        }
        else{
            System.out.println("LSLSOAJDIANFOBOBAAOFDKLABFLAB");
        }
    }

    public void tocar(){
        if(ehInstrumentista){
            System.out.println("TIRANDO UM SOM!!!");
        }
        else{
            System.out.println("15165196105164651");
        }
    }
}
