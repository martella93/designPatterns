package esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Libro extends ComponenteLibro{

    private List<String> autori;
    private double prezzo;
    private List<ComponenteLibro> componenti = new ArrayList<>();

    public Libro(List<String> autori, double prezzo) {
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public void aggiungi(ComponenteLibro componente) {
        componenti.add(componente);
    }

    @Override
    public int getNumeroPagine() {
        int numeroPagine = 0;
        for (ComponenteLibro componente : componenti) {
            numeroPagine += componente.getNumeroPagine();
        }
        return numeroPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa libro con autori: " + String.join(", ", autori));
        for (ComponenteLibro componente : componenti) {
            componente.stampa();
        }
    }

    public double getPrezzo() {
        return prezzo;
    }
}
