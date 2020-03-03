package huiswerk.basis_OOP.Les4;


import java.time.*;
import java.time.format.*;

public class Weerbericht
{
    private double temperatuur;
    private int windkracht;
    private String windrichting;
    private boolean bewolking;
    private boolean neerslag;
    private boolean zon;
    private String dag;
    private static LocalDate datum = LocalDate.now();
    private DateTimeFormatter datumFormat = DateTimeFormatter.ofPattern("eeee");


    public void verhoogDag()
    {
        dag = datumFormat.format(datum.plusDays(1));
        datum=datum.plusDays(1);
        System.out.println(dag);
    }

    public void verhoogDag(int aantal)
    {
        dag = datumFormat.format(datum.plusDays(aantal));
        datum=datum.plusDays(aantal);
        System.out.println(dag);
    }


    public Weerbericht(double temperatuur, int windkracht, String windrichting)
    {
        this.temperatuur = temperatuur;
        this.windkracht = windkracht;
        this.windrichting = windrichting;
        bewolking=false;
        neerslag=false;
        zon=true;
        dag = datumFormat.format(datum);

    }

    public Weerbericht(double temperatuur, int windkracht, String windrichting, boolean bewolking, boolean neerslag, boolean zon)
    {
        this(temperatuur, windkracht, windrichting);
        setBewolking(bewolking);
        setNeerslag(neerslag);
        setZon(zon);
        dag = datumFormat.format(datum);

    }

    @Override
    public String toString()
    {
        String weerbericht = "Weerbericht " + dag + " - temperatuur: "+temperatuur+", wind: "+windkracht+" "+windrichting;
        if(neerslag)
            weerbericht+=", neerslag";
        if(bewolking)
            weerbericht+=", bewolking";
        if(zon)
            weerbericht+=", zon";
        return weerbericht;
    }

    public double getTemperatuur()
    {
        return temperatuur;
    }
    public int getWindkracht()
    {
        return windkracht;
    }
    public String getWindrichting()
    {
        return windrichting;
    }

    public void setTemperatuur(double temperatuur)
    {
        this.temperatuur = temperatuur;
    }
    public void setWindkracht(int windkracht)
    {
        this.windkracht = windkracht;
    }
    public void setWindrichting(String windrichting)
    {
        this.windrichting = windrichting;
    }
    public void setBewolking(boolean bewolking)
    {
        this.bewolking = bewolking;
        if(!bewolking)
        {
            setZon(true);
            setNeerslag(false);
        }
    }
    public void setNeerslag(boolean neerslag)
    {
        this.neerslag = neerslag;
        if(neerslag)
            setBewolking(true);
    }
    public void setZon(boolean zon)
    {
        this.zon = zon;
    }
}
