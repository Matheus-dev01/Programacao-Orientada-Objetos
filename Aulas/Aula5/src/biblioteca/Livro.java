package biblioteca;
public class Livro {
    private String autor;
    private String nome;
    private int anoLancamento;

    public void setAutor(String autor){
        
        if(autor.isBlank()){
            this.autor = "Desconhecido";
        }else{
            this.autor = autor;
        }
    }

    public String getAutor(){
        return this.autor;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getnome(){
        return this.nome;
    }

    public void setanoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public int getanoLancamento(){
        return this.anoLancamento;
    }
}
 