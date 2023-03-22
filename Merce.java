package Magazzino;

public class Merce {
    private int numeroprogressivo;
    private String descrizione;
    private String codicefornitore;
    private int quantita;
    private double prezzounitario;
    private int scortaminima;
    public Merce(int numeroprogressivo, String descrizione, String codicefornitore, int quantita, double prezzounitario, int scortaminima) {
        setNumeroprogressivo(numeroprogressivo);
        setDescrizione(descrizione);
        setCodicefornitore(codicefornitore);
        setQuantita(quantita);
        setPrezzounitario(prezzounitario);
        setScortaminima(scortaminima);
    }
    public void setNumeroprogressivo(int numeroprogressivo) {
        this.numeroprogressivo = numeroprogressivo;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public void setCodicefornitore(String codicefornitore) {
        this.codicefornitore = codicefornitore;
    }
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    public void setPrezzounitario(double prezzounitario) {
        this.prezzounitario = prezzounitario;
    }
    public void setScortaminima(int scortaminima) {
        this.scortaminima = scortaminima;
    }
    public int getNumeroprogressivo() {
        return numeroprogressivo;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public String getCodicefornitore() {
        return codicefornitore;
    }
    public int getQuantita() {
        return quantita;
    }
    public double getPrezzounitario() {
        return prezzounitario;
    }
    public int getScortaminima() {
        return scortaminima;
    }
}
