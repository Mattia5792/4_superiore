package Forme;

public class Main {
    public static void main(String[] args) {
        Forma pentagono = new Forma("Pentagono");
        Triangolo rettangolo = new Triangolo("Triangolo rettangolo", 225, 78);
        Quadrato quadratonormale = new Quadrato("Quadrato", 25, 20);
        pentagono.stampa();
        rettangolo.stampa();
        quadratonormale.stampa();
    }
}
