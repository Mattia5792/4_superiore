public class Palazzomain 
{
    public static void main(String[] args)
    {
        Palazzo palazzo1 = new Palazzo(1, 100, "Via Tevere", 70, "Roma");
        Palazzo palazzo2 = new Palazzo(20, 200, "Via Gramsci", 59, "Milano");
        Palazzo palazzo3 = new Palazzo(6, 90, "Via Salvo D'Acquisto", 32, "Napoli");
        palazzo1.stampa();
        System.out.println();
        palazzo2.stampa();
        System.out.println();
        palazzo3.stampa();
    }
}
