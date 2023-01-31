import java.util.*;
import java.io.*;

public class Scrittura 
{
    public static void main(String[] args) throws Exception 
    {
        File file = new File("C:\\Users\\Mattia\\Desktop\\Password.txt");
        Scanner sc = new Scanner(file);
        String string = "";
        while (sc.hasNextLine()) 
        {
            string = string.concat(sc.nextLine());
        }
        FileWriter fw = new FileWriter("Nuovofile.txt"); // crea un oggetto FileWriter che punta al file Nuovofile.txt
        fw.write(string); // scrive la stringa string nel file Nuovofile.txt
        fw.close(); // chiude il file Nuovofile.txt, altrimenti non verrà salvato, e quindi non verrà stampato altro
    }
}