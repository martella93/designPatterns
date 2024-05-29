package esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pagina pagina1 = new Pagina(1);
        Pagina pagina2 = new Pagina(2);
        Pagina pagina3 = new Pagina(3);

        // Creazione delle sezioni
        Sezione sezione1 = new Sezione("Introduzione");
        Sezione sezione2 = new Sezione("Capitolo 1");

        // Aggiunta delle pagine alle sezioni
        sezione1.aggiungi(pagina1);
        sezione2.aggiungi(pagina2);
        sezione2.aggiungi(pagina3);

        // Creazione del libro
        List<String> autori = new ArrayList<>();
        autori.add("Autore 1");
        autori.add("Autore 2");
        Libro libro = new Libro(autori, 29.99);

        // Aggiunta delle sezioni al libro
        libro.aggiungi(sezione1);
        libro.aggiungi(sezione2);

        // Stampa del libro
        libro.stampa();

        // Numero totale di pagine
        System.out.println("Numero totale di pagine: " + libro.getNumeroPagine());
    }
}
