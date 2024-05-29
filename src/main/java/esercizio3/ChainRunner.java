package esercizio3;

public class ChainRunner {
    public static void main(String[] args) {

        Generale generale = new Generale();
        Colonnello colonnello = new Colonnello();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Tenente tenente = new Tenente();

        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(tenente);
        tenente.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        capitano.verificaStipendio(2500);
    }
}
