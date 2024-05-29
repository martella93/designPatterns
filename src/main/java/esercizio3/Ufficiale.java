package esercizio3;

public abstract class Ufficiale {

    private Ufficiale superiore;
    private double stipendio;

    public Ufficiale getSuperiore() {
        return superiore;
    }

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public void verificaStipendio(int importo) {
        if (stipendio >= importo) {
            System.out.println(getClass().getSimpleName() + " percepisce almeno " + importo + " euro.");
        } else if (superiore != null) {
            superiore.verificaStipendio(importo);
        } else {
            System.out.println("Nessun ufficiale percepisce almeno " + importo + " euro.");
        }
    }
}
