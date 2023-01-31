package Forme;
// Implementare la classe forma con il nome della forma, costruttore e metodo stampa.
// Implementare due classe figlie, triangolo e quadrato, il metodo stampa deve stampare sia area sia perimetro.
public class Forma {
    private String nome;
    public Forma(String nome) {
        this.nome = nome;
    }
    public void stampa() {
        System.out.println("Nome forma: " + nome);
    }
}