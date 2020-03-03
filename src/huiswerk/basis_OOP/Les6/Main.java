package huiswerk.basis_OOP.Les6;

import java.lang.reflect.Array;

public class Main
{
    public static void main(String[] args)
    {
        Artiest artiest1= new Artiest();
        artiest1.setNaam("James Hetfield");
        Artiest artiest2= new Artiest();
        artiest2.setNaam("Lars Ulrich");
        Artiest artiest3= new Artiest();
        artiest3.setNaam("Dave Mustaine");
        Artiest artiest4= new Artiest();
        artiest4.setNaam("Cliff Burton");

        Artiest artiest5 = new Artiest();
        artiest5.setNaam("Kirk Hammett");

        Artiest[] alcohollica = {artiest1,artiest2,artiest3,artiest4};
        Circus circus1 = new Circus("Alcohollica",alcohollica);
        circus1.printArtiesten();
        System.out.println("");
        circus1.SetArtiest(3,artiest5);
        System.out.println("");
        circus1.printArtiesten();
    }
}
