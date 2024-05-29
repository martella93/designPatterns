package esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione extends ComponenteLibro{

    private String titolo;
    private List<ComponenteLibro> componenti = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungi(ComponenteLibro componente) {
        componenti.add(componente);
    }


        @Override
    public int getNumeroPagine() {
        int numPagine=0;
        for (ComponenteLibro componente : componenti){
            numPagine += componente.getNumeroPagine();
        }
        return numPagine;
    }

    @Override
    public void stampa() {
        System.out.println("Sezione " + titolo);
        for (ComponenteLibro componente : componenti) {
            componente.stampa();
        }

    }
}
