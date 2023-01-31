public class Palazzo 
{
    private int numeropiani;
    private int metriquadri;
    private String indirizzo;
    private int numerocivico;
    private String citta;

    public Palazzo(int n, int m, String ind, int numero, String cit) 
    {
        setNumeropiani(n);
        setMetriquadri(m);
        setIndirizzo(ind);
        setNumerocivico(numero);
        setCitta(cit);
    }

    public void setNumeropiani(int n) 
    {
        if (n < 3 || n > 30) 
        {
            System.out.println("Numero piani non valido");
        }
        else
        {
            this.numeropiani = n;
        }
    }

    public void setMetriquadri(int m) 
    {
        if (m < 50 && m > 200) 
        {
            System.out.println("Metri quadri non validi");
        }
        else
        {
            this.metriquadri = m;
        }
    }

    public void setIndirizzo(String ind) 
    {
        this.indirizzo = ind;
    }

    public void setNumerocivico(int numero) 
    {
        if (numero < 0) 
        {
            System.out.println("Numero civico non valido");
        }
        else
        {
            this.numerocivico = numero;
        }
    }

    public void setCitta(String cit) 
    {
        this.citta = cit;
    }

    public void stampa() 
    {
        System.out.println("Numero piani: " + this.numeropiani);
        System.out.println("Metri quadri: " + this.metriquadri);
        System.out.println("Indirizzo: " + this.indirizzo);
        System.out.println("Numero civico: " + this.numerocivico);
        System.out.println("Citta: " + this.citta);
        System.out.println("Valore: " + calcolovalore() + " euro");
    }
    public int calcolovalore() 
    {
        return (this.metriquadri*this.numeropiani) * 1000;
    }
}
