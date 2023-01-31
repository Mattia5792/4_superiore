public class MainMatematica {
    public static void main (String[] args) {
        Matematica math = new Matematica();
        System.out.println("Somma:" + math.somma(1, 2));
        System.out.println("Somma:" + math.somma(1, 2, 3));
        System.out.println("Sottrazione:" + math.sottrazione(5, 2));
        System.out.println("Sottrazione:" + math.sottrazione(5, 2, 1));
        System.out.println("Radice:" + math.radice(60, 4));
        System.out.println("Radice:" + math.radice(60,4, 36));
    }
}
