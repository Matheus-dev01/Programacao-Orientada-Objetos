import java.util.*;

import loja.Loja;
import loja.Produto;

public class App {

    private static final Scanner READ = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o nome da Loja: ");
        String nomeLoja = READ.nextLine();

        Loja loja = new Loja(nomeLoja);
        loja.setnomeLoja(nomeLoja);

        int i = 0;
        while (i < 1) {
            System.out.println("Digite o nome do produto que deseja adicionar a sua loja: ");
            String nomeProduto = READ.nextLine();

            System.out.println("Digite o valor do produto: ");
            double preco = Double.parseDouble(READ.nextLine());

            System.out.println("Digite para que este produto serve: ");
            String tipoProduto = READ.nextLine();

            Produto produto = new Produto(nomeProduto, preco);

            produto.setnomeProduto(nomeProduto);
            produto.setpreco(preco);
            produto.settipoProduto(tipoProduto);
            loja.adicionarProduto(nomeProduto);
            System.out.println("Deseja adicionar outro produto? S/N");
            String resposta = READ.nextLine();
            if(resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("N")){
                i++;
            }else{}
        }
        loja.listaProdutos();
    }
}
