package Magazzino;

public class Prodotto {
    private String prodotto;
    private String codice;
    private String fornitore;
    private int quantita;
    private double prezzo;
    private int scorta;
    private String categoria;
    private String taglia;
    private String colore;
    private String tipo;
    private boolean lattosio;
    private boolean glutine;
    private String scadenza;
    public Prodotto(String prodotto, String codice, String fornitore, int quantita, double prezzo, int scorta, String categoria, String taglia, String colore, String tipo, boolean lattosio, boolean glutine, String scadenza) {
        setprodotto(prodotto);
        setCodice(codice);
        setFornitore(fornitore);
        setQuantita(quantita);
        setPrezzo(prezzo);
        setScorta(scorta);
        setCategoria(categoria);
        setTaglia(taglia);
        setColore(colore);
        setTipo(tipo);
        setLattosio(lattosio);
        setGlutine(glutine);
        setScadenza(scadenza);
    }
    public void setprodotto(String prodotto) {
        this.prodotto = prodotto;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }
    public void setFornitore(String fornitore) {
        this.fornitore = fornitore;
    }
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setScorta(int scorta) {
        this.scorta = scorta;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setLattosio(boolean lattosio) {
        this.lattosio = lattosio;
    }
    public void setGlutine(boolean glutine) {
        this.glutine = glutine;
    }
    public void setScadenza(String scadenza) {
        this.scadenza = scadenza;
    }
    public String getProdotto() {
        return prodotto;
    }
    public String getCodice() {
        return codice;
    }
    public String getFornitore() {
        return fornitore;
    }
    public int getQuantita() {
        return quantita;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public int getScorta() {
        return scorta;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getTaglia() {
        return taglia;
    }
    public String getColore() {
        return colore;
    }
    public String getTipo() {
        return tipo;
    }
    public boolean getLattosio() {
        return lattosio;
    }
    public boolean getGlutine() {
        return glutine;
    }
    public String getScadenza() {
        return scadenza;
    }
    @Override
    public String toString() {
        return "Prodotto: " + prodotto + " Codice: " + codice + " Fornitore: " + fornitore + " Quantita: " + quantita + " Prezzo: " + prezzo + " Scorta: " + scorta + " Categoria: " + categoria + " Taglia: " + taglia + " Colore: " + colore + " Tipo: " + tipo + " Lattosio: " + lattosio + " Glutine: " + glutine + " Scadenza: " + scadenza;
    }
}
