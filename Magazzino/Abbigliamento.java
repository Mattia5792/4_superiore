package Magazzino;

public class Abbigliamento extends Merce{
    private char taglia;
    private String colore;
    private String tipo;
    public Abbigliamento (int numeroprogressivo, String descrizione, String codicefornitore, int quantita, double prezzounitario, int scortaminima, char taglia, String colore, String tipo) {
        super(numeroprogressivo, descrizione, codicefornitore, quantita, prezzounitario, scortaminima);
        setTaglia(taglia);
        setColore(colore);
        setTipo(tipo);
    }
    public void setTaglia(char taglia) {
        this.taglia = taglia;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public char getTaglia() {
        return taglia;
    }
    public String getColore() {
        return colore;
    }
    public String getTipo() {
        return tipo;
    }

}
