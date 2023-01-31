import java.util.*;
import java.lang.Math;

public class Tombolamain {
    public static void avanti() {
        Scanner input = new Scanner(System.in);
        try {
            System.in.read();
            input.nextLine();
        } catch (Exception e) {

        }
    }

    public static int random() {
        int min = 1;
        int max = 90;
        int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random;
    }

    public static int estrazione(ArrayList<Integer> numeriestratti) {
        int estratto = random();
        while (numeriestratti.contains(estratto)) {
            estratto = random();
        }
        numeriestratti.add(estratto);
        System.out.println("Estratto: " + estratto);
        return estratto;
    }

    // controllo
    public static void controllo(int[][] cartella, int estratto) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (cartella[i][j] == estratto) {
                    cartella[i][j] = -1;
                }
            }
        }
    }

    public static boolean controlloambo(int[][] cartella) {
        int contatore = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (cartella[i][j] == -1) {
                    contatore++;
                }
            }
            if (contatore == 2) {
                return true;
            }
            contatore = 0;
        }
        return false;
    }

    public static boolean controlloterno(int[][] cartella) {
        int contatore = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (cartella[i][j] == -1) {
                    contatore++;
                }
            }
            if (contatore == 3) {
                return true;
            }
            contatore = 0;
        }
        return false;
    }

    public static boolean controlloquaterna(int[][] cartella) {
        int contatore = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (cartella[i][j] == -1) {
                    contatore++;
                }
            }
            if (contatore == 4) {
                return true;
            }
            contatore = 0;
        }
        return false;
    }

    public static boolean controllocinquina(int[][] cartella) {
        int contatore = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (cartella[i][j] == -1) {
                    contatore++;
                }
            }
            if (contatore == 5) {
                return true;
            }
            contatore = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Tombola p1 = new Tombola("Mario", "Rossi");
        Tombola p2 = new Tombola("Luigi", "Verdi");
        Tombola p3 = new Tombola("Giovanni", "Bianchi");
        boolean vittoria = false;
        String ambo = "Nessuno";
        String terno = "Nessuno";
        String quaterna = "Nessuno";
        String cinquina = "Nessuno";
        int estratto;
        ArrayList<Integer> numeriestratti = new ArrayList<Integer>();
        p1.generaCartella();
        p2.generaCartella();
        p3.generaCartella();
        do {
            System.out.println("Proprietario Cartella 1: " + p1.getNome() + " " + p1.getCognome());
            p1.stampa();
            System.out.println();
            System.out.println("Proprietario Cartella 2: " + p2.getNome() + " " + p2.getCognome());
            p2.stampa();
            System.out.println();
            System.out.println("Proprietario Cartella 3: " + p3.getNome() + " " + p3.getCognome());
            p3.stampa();
            System.out.println();
            estratto = estrazione(numeriestratti);
            controllo(p1.getCartella(), estratto);
            controllo(p2.getCartella(), estratto);
            controllo(p3.getCartella(), estratto);

            System.out.println();
            if (ambo.equals("Nessuno")) {
                if (controlloambo(p1.getCartella()) == true && p1.getAmbo() == false) {
                    p1.setAmbo(true);
                    ambo = p1.getNome() + " " + p1.getCognome();
                }
                if (controlloambo(p2.getCartella()) == true && p2.getAmbo() == false) {
                    p2.setAmbo(true);
                    ambo = p2.getNome() + " " + p2.getCognome();
                }
                if (controlloambo(p3.getCartella()) == true && p3.getAmbo() == false) {
                    p3.setAmbo(true);
                    ambo = p3.getNome() + " " + p3.getCognome();
                }
            }
            if (terno.equals("Nessuno")) {
                if (controlloterno(p1.getCartella()) == true && p1.getTerno() == false) {
                    p1.setTerno(true);
                    terno = p1.getNome() + " " + p1.getCognome();
                }
                if (controlloterno(p2.getCartella()) == true && p2.getTerno() == false) {
                    p2.setTerno(true);
                    terno = p2.getNome() + " " + p2.getCognome();
                }
                if (controlloterno(p3.getCartella()) == true && p3.getTerno() == false) {
                    p3.setTerno(true);
                    terno = p3.getNome() + " " + p3.getCognome();
                }
            }
            if (quaterna.equals("Nessuno")) {
                if (controlloquaterna(p1.getCartella()) == true && p1.getQuaterna() == false) {
                    p1.setQuaterna(true);
                    quaterna = p1.getNome() + " " + p1.getCognome();
                }
                if (controlloquaterna(p2.getCartella()) == true && p2.getQuaterna() == false) {
                    p2.setQuaterna(true);
                    quaterna = p2.getNome() + " " + p2.getCognome();
                }
                if (controlloquaterna(p3.getCartella()) == true && p3.getQuaterna() == false) {
                    p3.setQuaterna(true);
                    quaterna = p3.getNome() + " " + p3.getCognome();
                }
            }
            if (cinquina.equals("Nessuno")) {
                if (controllocinquina(p1.getCartella()) == true && p1.getCinquina() == false) {
                    p1.setCinquina(true);
                    cinquina = p1.getNome() + " " + p1.getCognome();
                }
                if (controllocinquina(p2.getCartella()) == true && p2.getCinquina() == false) {
                    p2.setCinquina(true);
                    cinquina = p2.getNome() + " " + p2.getCognome();
                }
                if (controllocinquina(p3.getCartella()) == true && p3.getCinquina() == false) {
                    p3.setCinquina(true);
                    cinquina = p3.getNome() + " " + p3.getCognome();
                }
            }
            System.out.println("Vincitore ambo: " + ambo);
            System.out.println("Vincitore terno: " + terno);
            System.out.println("Vincitore quaterna: " + quaterna);
            System.out.println("Vincitore cinquina: " + cinquina);
            System.out.println();
            System.out.print("Premi invio per continuare");
            avanti();
            if (p1.vittoria() == true || p2.vittoria() == true || p3.vittoria() == true) {
                vittoria = true;
            }
        } while (vittoria == false);
        if (p1.vittoria() == true) {
            System.out.println("Tombola! Il vincitore è:" + p1.getNome() + " " + p1.getCognome());
        } else if (p2.vittoria() == true) {
            System.out.println("Tombola! Il vincitore è:" + p2.getNome() + " " + p2.getCognome());
        } else if (p3.vittoria() == true) {
            System.out.println("Tombola! Il vincitore è:" + p3.getNome() + " " + p3.getCognome());
        }
    }
}
