// implementare la classe Math con l'overloading dei seguenti metodi:
// - somma
// - sottrazione
// - radice di una somma
import java.lang.Math;

public class Matematica {
    public int somma(int a, int b){
        return a + b;
    }
    public int somma(int a, int b, int c){
        return a + b + c;
    }
    public int sottrazione(int a, int b){
        return a - b;
    }
    public int sottrazione(int a, int b, int c){
        return a - b - c;
    }
    public double radice(int a, int b){
        return Math.sqrt(a + b);
    }
    public double radice(int a, int b, int c){
        return Math.sqrt(a + b + c);
    }
}