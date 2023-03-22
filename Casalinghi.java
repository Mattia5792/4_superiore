package Magazzino;

public class Casalinghi extends Merce{
    private String tipo;
    public Casalinghi (int numeroprogressivo, String descrizione, String codicefornitore, int quantita, double prezzounitario, int scortaminima, String tipo) {
        super(numeroprogressivo, descrizione, codicefornitore, quantita, prezzounitario, scortaminima);
        setTipo(tipo);
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
}