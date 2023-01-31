package Forme;

public class Triangolo extends Forma{
    private float area;
    private float perimetro;
    public Triangolo(String nome, float area, float perimetro) {
        super(nome);
        this.area = area;
        this.perimetro = perimetro;
    }   
    public void stampa() {
        super.stampa();
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
