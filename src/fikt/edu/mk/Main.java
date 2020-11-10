package fikt.edu.mk;

public class Main {

    public static void main(String[] args) {
    Student student = new Student();
    student.setIme("Andrej");
    student.setPrezime("Dolevski");
    student.setGodini(20);
    student.setBrindeks("INKI-600");

    Ocenka ocenka1=new Ocenka();
    ocenka1.setPredmet("Kalkulus 1");
    ocenka1.setDatum("10.02.2020");
    ocenka1.setOcenka(10);
    student.setOcenka(ocenka1);

    Ocenka ocenka2=new Ocenka();
    ocenka2.setPredmet("Strukturirano Programiranje");
    ocenka2.setDatum("13.01.2020");
    ocenka2.setOcenka(8);
    student.setOcenka(ocenka2);

    Ocenka ocenka3=new Ocenka();
    ocenka3.setPredmet("Inovaciski Menadzhment");
    ocenka3.setDatum("13.02.2020");
    ocenka3.setOcenka(9);
    student.setOcenka(ocenka3);

    System.out.println(student);
    System.out.println("Prosekot na studentot iznesuva " + student.getProsek() + ".");
    }
}