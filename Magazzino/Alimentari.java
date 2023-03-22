package Magazzino;

public class Alimentari extends Merce{
    private int[] scadenza;
    private boolean lattosio;
    private boolean glutine;
    public Alimentari(int numeroprogressivo, String descrizione, String codicefornitore, int quantita, double prezzounitario, int scortaminima, int[] scadenza, boolean lattosio, boolean glutine) {
        super(numeroprogressivo, descrizione, codicefornitore, quantita, prezzounitario, scortaminima);
        setScadenza(scadenza);
        setLattosio(lattosio);
        setGlutine(glutine);
    }
    public void setScadenza(int[] scadenza) {
        this.scadenza = scadenza;
    }
    public void setLattosio(boolean lattosio) {
        this.lattosio = lattosio;
    }
    public void setGlutine(boolean glutine) {
        this.glutine = glutine;
    }
    public int[] getScadenza() {
        return scadenza;
    }
    public boolean getLattosio() {
        return lattosio;
    }
    public boolean getGlutine() {
        return glutine;
    }
}
