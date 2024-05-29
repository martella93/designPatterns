package esercizio1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Info info = new Info("Mario", "Rossi",new Date(90, 2, 1));

        // Creiamo l'adattatore per Info
        DataSource adapter = new Adapter(info);

        // Creiamo un'istanza di UserData e utilizziamo l'adattatore
        UserData userData = new UserData();
        userData.getData(adapter);

        // Stampiamo i risultati
        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());

    }
}
