package Magazzino;

import java.util.ArrayList;
import java.util.List;

public class Magazzino {
    private List<Prodotto> prodotti;

    public Magazzino() {
        this.prodotti = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    @Override
    public String toString() {
        return "Magazzino{" +
                "prodotti=" + prodotti +
                '}';
    }
}
