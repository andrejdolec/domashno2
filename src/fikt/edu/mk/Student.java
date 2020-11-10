package fikt.edu.mk;
import java.util.Arrays;

public class Student extends Covek {
    private String brindeks;
    private float prosek;
    private static int i = 0;
    private static final int predmeti= 3;
    Ocenka[] nizaocenki = new Ocenka[predmeti];

    public String getBrindeks() {
        return brindeks;
    }

    public void setBrindeks(String brindeks) {
        this.brindeks = brindeks;
    }

    public void setOcenka(Ocenka o) {
        nizaocenki[i] = o;
        Student.i++;
    }
    public float getProsek() {
        int j=0;
        while (j<i){
            prosek=prosek+nizaocenki[j].getOcenka();
            j++;
        }
        prosek=prosek/i;
        return prosek;
    }
    @Override
    public String toString() {
        return "Student so vrednosti: {" +
                "ime='" + getIme() + '\'' +
                ", prezime='" + getPrezime() + '\'' +
                ", index=" + getBrindeks() +
                '}' + '\'' +
                "\t" + Arrays.toString(nizaocenki) +
                '}';
    }
}