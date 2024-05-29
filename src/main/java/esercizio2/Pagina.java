package esercizio2;

public class Pagina extends ComponenteLibro{

    private int numPagine;

    public Pagina(int numPagine) {
        this.numPagine = numPagine;
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Numero pagina: " + numPagine);

    }
}
