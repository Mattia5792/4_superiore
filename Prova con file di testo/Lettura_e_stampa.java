import java.util.*;
import java.io.*;

public class Lettura_e_stampa 
{
    public static void main(String[] args) throws Exception // il metodo main può lanciare un'eccezione, quindi è necessario dichiararlo
    {
        File file = new File("C:\\Users\\Mattia\\Desktop\\Raccolta informatica 4 anno\\Pentamestre\\Prova con file di testo\\Password.txt"); // crea un oggetto File che punta al file Password.txt
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) // sc.hasNextLine() serve per verificare se ci sono altre righe da leggere, ritornando true o false
        {
            System.out.println(sc.nextLine()); // stampa la riga corrente e passa alla successiva
        }
    }
}
