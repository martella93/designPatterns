package esercizio1;

import java.util.Date;

public class Adapter implements DataSource{

    private Info info;

    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return this.info.getNome() + " " + this.info.getCognome();
    }

    @Override
    public int getEta() {
        Date currentDate = new Date();
        int currentYear = currentDate.getYear();
        int birthYear = info.getDataDiNascita().getYear();
        return currentYear - birthYear;
    }
}
