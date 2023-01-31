import java.util.*;
import java.lang.Math;

public class Tombola {
    private String nome;
    private String cognome;
    private boolean ambo;
    private boolean terno;
    private boolean quaterna;
    private boolean cinquina;
    private int[][] cartella = new int[3][5];
    ArrayList<Integer> numericartella = new ArrayList<Integer>();

    // Costruttore
    public Tombola (String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    // Random
    public int random() {
        int min = 1;
        int max = 90;
        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random;
    }

    // Genera Cartella
    public void generaCartella() {
        // Riempimento
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                cartella[i][j] = random();
                while (numericartella.contains(cartella[i][j])) {
                    cartella[i][j] = random();
                }
                numericartella.add(cartella[i][j]);
            }
        }
    }
    // metodi set
    public void setAmbo(boolean ambo) {
        this.ambo = ambo;
    }
    public void setTerno(boolean terno) {
        this.terno = terno;
    }
    public void setQuaterna(boolean quaterna) {
        this.quaterna = quaterna;
    }
    public void setCinquina(boolean cinquina) {
        this.cinquina = cinquina;
    }
    // metodi get
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int[][] getCartella() {
        return cartella;
    }

    public boolean getAmbo() {
        return ambo;
    }

    public boolean getTerno() {
        return terno;
    }

    public boolean getQuaterna() {
        return quaterna;
    }

    public boolean getCinquina() {
        return cinquina;
    }

    // Stampa
    public void stampa() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Riga " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(cartella[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean vittoria() {
        int contavittoria = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (cartella[i][j] == -1) {
                    contavittoria++;
                }
            }
        }
        if (contavittoria == 15) {
            return true;
        } else {
            return false;
        }
    }
}
