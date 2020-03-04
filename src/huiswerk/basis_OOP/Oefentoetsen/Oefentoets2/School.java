package huiswerk.basis_OOP.Oefentoetsen.Oefentoets2;

import java.util.ArrayList;

public class School
{
    private ArrayList<Lokaal> lokalen = new ArrayList();

    public School()
    {

    }

    public void voeglokaalToe(Lokaal lokaal)
    {
        lokalen.add(lokaal);
    }

    public void printLokalen()
    {
        for(Lokaal lokaal : lokalen)
        {
            lokaal.printOmschrijving();
        }
    }

    public Lokaal zoekLokaal(String code)
    {
        for(Lokaal lokaal : lokalen)
        {
            if(lokaal.getCode().equals(code))
            {
                return lokaal;
            }
        }
        return null;
    }

    public ArrayList<Lokaal> zoekLokalen(String gebouw)
    {
        ArrayList<Lokaal> lokaleningebouw = new ArrayList<>();
        for(Lokaal lokaal : lokalen)
        {
            if(lokaal.getCode().startsWith(gebouw))
            {
                lokaleningebouw.add(lokaal);
            }
        }
        return lokaleningebouw;
    }

}
