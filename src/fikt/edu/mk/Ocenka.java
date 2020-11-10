package fikt.edu.mk;

public class Ocenka {
    private int ocenka;
    private String predmet;
    private String datum;

    public int getOcenka() {
        return ocenka;
    }

    public void setOcenka(int ocenka) {
        this.ocenka = ocenka;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String toString() {
        return "Ocenki: {" +
                "predmet=" + predmet +
                ", ocenka='" + ocenka + '\'' +
                ", datum='" + datum + '\'' +
                '}';
    }
}