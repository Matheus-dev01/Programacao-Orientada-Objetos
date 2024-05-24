package loja;
import java.util.*;

public class Loja {
    private String nomeLoja;
    private ArrayList<String> produtos = new ArrayList<String>();

    public Loja(String nomeLoja){

    }

    public void adicionarProduto(String nomeProduto){
        produtos.add(nomeProduto);
    }

    public void listaProdutos(){
        System.out.println(produtos);
    }

    public void setnomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public String getnomeLoja(){
        return this.nomeLoja;
    }

}
