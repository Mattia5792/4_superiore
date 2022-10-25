import java.lang.Math;
public class Numero
{
    public int numero;
    public double quadrato()
    {
        return this.numero*this.numero;
    }
    public double radice()
    {
        return Math.sqrt(this.numero);
    }
    public int fattoriale()
    {
        int fatt=1;
        for(int i=1;i<=this.numero;i++)
        {
            fatt*=i;
        }
        return fatt;
    }
    public double negativo()
    {
        return this.numero*(-1);
    }
    public String binario()
    {
        return Integer.toBinaryString(this.numero);
    }
    public String esadecimale()
    {
        return Integer.toHexString(this.numero);
    }
    public double incrementa()
    {
        return this.numero+1;
    }
    public double decrementa()
    {
        return this.numero-1;
    }
    public double equazione()
    {
        return Math.pow(this.numero,2)+this.numero+9;
    }
}
