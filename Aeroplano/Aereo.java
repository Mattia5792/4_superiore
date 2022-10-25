/*Implementare la classe aeroplano con i seguenti attributi, velocità massima, velocità di crociera, nome aereo,numero di motopri. metodo info*/
import java.util.Scanner;
public class Aereo 
{
    Scanner input=new Scanner(System.in); 
    private double velocitam;
    private double velocitac;
    private String nomeaereo;
    private int motori;
    public Aereo(double max,double crociera,String nome,int n)
    {
        this.velocitam=max;
        this.velocitac=crociera;
        this.nomeaereo=nome;
        this.motori=n;
    }
    public void info()
    {
        System.out.println("Velocità massima:"+velocitam+"km/h");
        System.out.println("Velocità di crociera:"+velocitac+"km/h");
        System.out.println("Nome velivolo:"+nomeaereo);
        System.out.println("Numero motori:"+motori);
    }
    public void setVelocitam(double velocitam) 
    {
        if (velocitam>2000) 
        {
            System.out.println("Velocità troppo alta,inserire una velocità più bassa di 2000km/h");
        }
        if (velocitam<=this.velocitac)
        {
            System.out.println("Errore, la velocità massima non può essere uguale o minore alla velocità di crociera.");
        }
        else
        {
            this.velocitam=velocitam;
        }
    }
    public void setVelocitac(double velocitac) 
    {
        if (velocitac>2000) 
        {
            System.out.println("Velocità troppo alta,inserire una velocità più bassa di 2000km/h");
        }
        else
        {
            this.velocitac=velocitac;
        }
    }
    public void setNomeaereo(String nomeaereo) 
    {
        this.nomeaereo = nomeaereo;
    }
    public void setMotori(int motori) 
    {
        if(motori>4)
        {
            System.out.println("Errore,non possono esserci più di quattro motori.");
        }
        if (motori<=0)
        {
            System.out.println("Deve essersi almeno un motore nell'aereo");
        }
        else
        {
            this.motori=motori;
        }
    }
}
