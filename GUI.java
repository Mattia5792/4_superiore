package Magazzino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {

    private JTextField prodottoField;
    private JTextField codiceField;
    private JTextField fornitoreField;
    private JTextField quantitaField;
    private JTextField prezzoField;
    private JTextField scortaField;
    private JButton addButton;
    private JComboBox<String> categoriaBox;
    private JComboBox<String> tagliaBox;
    private JTextField coloreField;
    private JTextField tipoField;
    private JCheckBox lattosioCheckBox;
    private JCheckBox glutineCheckBox;
    private JTextField scadenzaField;
    Magazzino magazzino = new Magazzino();

    public GUI() {
        super("Gestione magazzino");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));

        JLabel prodottoLabel = new JLabel("Prodotto:");
        panel.add(prodottoLabel);
        prodottoField = new JTextField();
        panel.add(prodottoField);

        JLabel codiceLabel = new JLabel("Codice fornitore:");
        panel.add(codiceLabel);
        codiceField = new JTextField();
        panel.add(codiceField);

        JLabel fornitoreLabel = new JLabel("Fornitore:");
        panel.add(fornitoreLabel);
        fornitoreField = new JTextField();
        panel.add(fornitoreField);

        JLabel quantitaLabel = new JLabel("Quantità:");
        panel.add(quantitaLabel);
        quantitaField = new JTextField();
        panel.add(quantitaField);

        JLabel prezzoLabel = new JLabel("Prezzo unitario:");
        panel.add(prezzoLabel);
        prezzoField = new JTextField();
        panel.add(prezzoField);

        JLabel scortaLabel = new JLabel("Scorta minima:");
        panel.add(scortaLabel);
        scortaField = new JTextField();
        panel.add(scortaField);

        JLabel categoriaLabel = new JLabel("Categoria:");
        panel.add(categoriaLabel);
        String[] categorie = {"", "Casalinghi", "Alimentari", "Abbigliamento"};
        categoriaBox = new JComboBox<>(categorie);
        categoriaBox.addActionListener(this);
        panel.add(categoriaBox);

        JLabel tagliaLabel = new JLabel("Taglia:");
        panel.add(tagliaLabel);
        String[] taglie = {"", "S", "M", "L", "XL", "XXL"};
        tagliaBox = new JComboBox<>(taglie);
        panel.add(tagliaBox);

        JLabel coloreLabel = new JLabel("Colore:");
        panel.add(coloreLabel);
        coloreField = new JTextField();
        panel.add(coloreField);

        JLabel tipoLabel = new JLabel("Tipo:");
        panel.add(tipoLabel);
        tipoField = new JTextField();
        panel.add(tipoField);

        JLabel lattosioLabel = new JLabel("Lattosio:");
        panel.add(lattosioLabel);
        lattosioCheckBox = new JCheckBox();
        panel.add(lattosioCheckBox);

        JLabel glutineLabel = new JLabel("Glutine:");
        panel.add(glutineLabel);
        glutineCheckBox = new JCheckBox();
        panel.add(glutineCheckBox);

        JLabel scadenzaLabel = new JLabel("Scadenza (GG/MM/AAAA):");
        panel.add(scadenzaLabel);
        scadenzaField = new JTextField();
        panel.add(scadenzaField);

        addButton = new JButton("Aggiungi");
        addButton.addActionListener(this);
        panel.add(addButton);

        add(panel);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String prodotto = prodottoField.getText();
            String codice = codiceField.getText();
            String fornitore = fornitoreField.getText();
            int quantita = Integer.parseInt(quantitaField.getText());
            double prezzo = Double.parseDouble(prezzoField.getText());
            int scorta = Integer.parseInt(scortaField.getText());
            String categoria = (String) categoriaBox.getSelectedItem();
            String taglia = (String) tagliaBox.getSelectedItem();
            String colore = coloreField.getText();
            String tipo = tipoField.getText();
            boolean lattosio = lattosioCheckBox.isSelected();
            boolean glutine = glutineCheckBox.isSelected();
            String scadenza = scadenzaField.getText();

            // qui bisogna creare un oggetto Prodotto
            Prodotto prodottoaggiunto = new Prodotto(prodotto, codice, fornitore, quantita, prezzo, scorta, categoria, taglia, colore, tipo, lattosio, glutine, scadenza);
            magazzino.aggiungiProdotto(prodottoaggiunto);
            // mostrare tutti i prodotti aggiunti
            JOptionPane.showMessageDialog(null, magazzino.toString());
            
            
            // infine, si puliscono i campi della GUI
            prodottoField.setText("");
            codiceField.setText("");
            fornitoreField.setText("");
            quantitaField.setText("");
            prezzoField.setText("");
            scortaField.setText("");
            categoriaBox.setSelectedIndex(0);
            tagliaBox.setSelectedIndex(0);
            coloreField.setText("");
            tipoField.setText("");
            lattosioCheckBox.setSelected(false);
            glutineCheckBox.setSelected(false);
            scadenzaField.setText("");

        } else if (e.getSource() == categoriaBox) {
            String categoria = (String) categoriaBox.getSelectedItem();
            if (categoria.equals("Abbigliamento")) {
                tagliaBox.setEnabled(true);
                coloreField.setEnabled(true);
                tipoField.setEnabled(true);
                lattosioCheckBox.setEnabled(false);
                glutineCheckBox.setEnabled(false);
                scadenzaField.setEnabled(false);
            } else if (categoria.equals("Alimentari")) {
                tagliaBox.setEnabled(false);
                coloreField.setEnabled(false);
                tipoField.setEnabled(false);
                lattosioCheckBox.setEnabled(true);
                glutineCheckBox.setEnabled(true);
                scadenzaField.setEnabled(true);
            } else {
                tagliaBox.setEnabled(false);
                coloreField.setEnabled(false);
                tipoField.setEnabled(false);
                lattosioCheckBox.setEnabled(false);
                glutineCheckBox.setEnabled(false);
                scadenzaField.setEnabled(false);
            }
        }
    }
}
