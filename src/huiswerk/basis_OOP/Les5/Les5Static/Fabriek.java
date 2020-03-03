package huiswerk.basis_OOP.Les5.Les5Static;


public class Fabriek {

    private String naam;

    private int aantalGemaakteAutos=0;
    private static int totaalGemaakteAutos=0;

    private int sjoemelAuto=0;
    private static int totaalSjoemelAutos=0;
    private static int totaalZonderSjoemel=0;


    public Fabriek(String naam) {
        System.out.println("fabriek:            constructor - De constructer zal nu een FABRIEK object gaan maken.");
        // Hier makwen we een nieuwe standaard auto voor de fabriek.
        this.naam = naam;
    }

    public void registreerProductieFout(Auto auto)
    {
        sjoemelAuto++;
        totaalSjoemelAutos++;
        totaalZonderSjoemel--;
    }

    public Auto maakAuto(String type, int pk) {
        System.out.println("fabriek:               maakAuto - Nu wordt er custom auto gemaakt.");
        aantalGemaakteAutos++;
        totaalGemaakteAutos++;
        totaalZonderSjoemel++;
        return new Auto(naam, type, pk, this);
    }

    public static int getTotaalGemaakteAutos()
    {
        return totaalGemaakteAutos;
    }

    public static void printTotaalAantalGemaakteAutos()
    {
        System.out.println(totaalGemaakteAutos);
    }

    public static void printTotaalAantalSjoemelAutos()
    {
        System.out.println(totaalSjoemelAutos);
    }
}
