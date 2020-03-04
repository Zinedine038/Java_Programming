package huiswerk.basis_OOP.Oefentoetsen.Oefentoets2;

import java.util.ArrayList;

public class SchoolToets
{
    public static void main(String[] args)
    {
        Computerlokaal cl1 = new Computerlokaal("T4.05",20);
        Leslokaal ll1 = new  Leslokaal("T5.20");
        Computerlokaal cl2 = new Computerlokaal("T4.42",5);
        Leslokaal ll2 = new  Leslokaal("D3.20");

        School windesheim = new School();
        windesheim.voeglokaalToe(cl1);
        windesheim.voeglokaalToe(ll1);
        windesheim.voeglokaalToe(cl2);
        windesheim.voeglokaalToe(ll2);
        windesheim.printLokalen();
        windesheim.zoekLokaal("T4.42").printOmschrijving();
        ArrayList<Lokaal> zoeklokalen = windesheim.zoekLokalen("D");
        for(Lokaal tlokaal : zoeklokalen)
        {
            tlokaal.printOmschrijving();
        }

    }
}
