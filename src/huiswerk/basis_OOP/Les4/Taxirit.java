package huiswerk.basis_OOP.Les4;

public class Taxirit
{
    private static double minimalekost=2.50;
    private static int totaleTaxiRitten;
    private double prijsPerKm=1.25;
    private int aantalPers;
    private int maxAantal;
    private double afstand;

    public Taxirit(double afstand)
    {
        this.afstand = afstand;
        aantalPers=1;
        maxAantal=4;
        totaleTaxiRitten++;
    }

    public Taxirit(int aantalPers, int maxAantal, double afstand)
    {
        this.aantalPers = aantalPers;
        this.maxAantal = maxAantal;
        this.afstand = afstand;
        totaleTaxiRitten++;
    }

    public void voegPersoonToe()
    {
        if(aantalPers+1>maxAantal)
            System.out.println("Taxi vol! Kan persoon niet toevoegen");
        else
            aantalPers++;
    }

    public void voegPersoonToe(int aantal)
    {
        if(aantalPers+aantal>maxAantal)
            System.out.println("Taxi vol! Kan personen niet toevoegen");
        else
            aantalPers+=aantal;
    }

    public double totaalPrijs()
    {
        if((afstand*prijsPerKm)<minimalekost)
            return 2.50;
        else
            return afstand*prijsPerKm;
    }

    public double berekenPrijsPerPersoon()
    {
        double pp=totaalPrijs()/aantalPers;
        if(aantalPers==maxAantal)
            return pp*0.9;
        else
            return pp;
    }

    public double berekenPrijsPerPersoon(double kortingPerc)
    {
        double pp=totaalPrijs()/aantalPers;
            return pp*(kortingPerc/100);
    }

    public static int getTotaleTaxiRitten()
    {
        return totaleTaxiRitten;
    }
}
