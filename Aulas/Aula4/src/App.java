public class App {
    public static void main(String[] args) throws Exception {
        Musica musica = new Musica();
        musica.melodia = "la lala laiala lelele";
        musica.cifra = "G D Em C";
        musica.temLetra = true;
        musica.letra = "Joao robou pao na casa do Joao";

        Musico guitarrista = new Musico();
        guitarrista.ehCantor = false;
        guitarrista.ehInstrumentista = true;
        guitarrista.idade = 13;
        guitarrista.instrumento = "Guitarra";
        guitarrista.nome = "Pedro";

        Musico cantor = new Musico();
        cantor.ehCantor = true;
        cantor.ehInstrumentista = false;
        cantor.idade = 27;
        cantor.instrumento = "Voz";
        cantor.nome = "Davi";

        musica.musicos.add(guitarrista);
        musica.musicos.add(cantor);

        musica.tocarMusica();

        musica.imprimirDetalhes();
    }
}
