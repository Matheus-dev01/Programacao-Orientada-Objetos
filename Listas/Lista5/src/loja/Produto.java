package loja;

public class Produto {
    private String nomeProduto;
    private double preco;
    private String tipoProduto;

    public Produto(String nomeProduto, double preco){

    }

    public void exibirAtributos(){
        System.out.println(nomeProduto + preco + tipoProduto);
    }

    public void setnomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public String getnomeProduto(){
        return this.nomeProduto;
    }

    public void setpreco(double preco){
        this.preco = preco;
    }

    public double getpreco(){
        return this.preco;
    }

    public void settipoProduto(String tipoProduto){
        this.tipoProduto = tipoProduto;
    }

    public String gettipoProduto(){
        return this.tipoProduto;
    }
}
