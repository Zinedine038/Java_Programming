package huiswerk.basis_OOP.Oefentoetsen.Oefentoets1;

import java.time.LocalDate;
import java.time.DayOfWeek;


public class Melding
{
    private String berichtTekst;
    private int niveau;
    private String dagAanduiding;
    private LocalDate aanmaakDatum;
    private DayOfWeek dagVanBericht;


    public Melding(String berichtTekst)
    {
        this.berichtTekst = berichtTekst;
        this.dagAanduiding="vandaag";
        this.aanmaakDatum=LocalDate.now();
        this.dagVanBericht=aanmaakDatum.getDayOfWeek();
        this.niveau=1;
    }

    public Melding(String berichtTekst, int niveau)
    {
        this(berichtTekst);
        dagAanduiding="vandaag";
        aanmaakDatum=LocalDate.now();
        dagVanBericht=aanmaakDatum.getDayOfWeek();
        setNiveau(niveau);
    }

    @Override
    public String toString()
    {
        return getNiveauAlsTekst()+": "+berichtTekst+" ("+dagAanduiding+", "+dagVanBericht+" "+aanmaakDatum+", niveau="+niveau+")";
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
        {
            return false;
        }
        if( !(obj instanceof Melding))
        {
            return false;
        }
        Melding other = (Melding) obj;

        if(berichtTekst.equals(other.berichtTekst) &&
           niveau==other.niveau &&
           dagAanduiding.equals(other.dagAanduiding) &&
           dagVanBericht==other.dagVanBericht &&
           aanmaakDatum==other.aanmaakDatum)
        {
            return true;

        }
        else
            return false;
    }

    //Getters
    public String getBerichtTekst()
    {
        return berichtTekst;
    }
    public int getNiveau()
    {
        return niveau;
    }
    public String getDagAanduiding()
    {
        return dagAanduiding;
    }
    public LocalDate getAanmaakDatum()
    {
        return aanmaakDatum;
    }
    public DayOfWeek getDagVanBericht()
    {
        return dagVanBericht;
    }

    public String getNiveauAlsTekst()
    {
        switch(niveau)
        {
            case 1:
                return "Mededeling";
            case 2:
                return "WAARSCHUWING";
            case 3:
                return "NOODSITUATIE";
            default:
                break;
        }
        return "ERROR: geen niveau";
    }

    //Setters
    public void setNiveau(int niveau)
    {
        if(niveau<1)
            niveau=1;
        else if(niveau>3)
            niveau=3;
        else
            this.niveau = niveau;
    }

    public void setAangepasteDag(DayOfWeek aangepasteDag)
    {
        int oud = dagVanBericht.getValue();
        int nieuw = aangepasteDag.getValue();
        String nieuweDagaanduiding="";
        boolean first =true;
        while(oud!=nieuw)
        {
            if(first)
            {
                nieuweDagaanduiding="morgen";
                first=false;
            }
            oud++;
            nieuweDagaanduiding="over"+nieuweDagaanduiding;
            if(oud==8)
                oud=1;
        }
        dagAanduiding=nieuweDagaanduiding;
        dagVanBericht=aangepasteDag;

    }
}
