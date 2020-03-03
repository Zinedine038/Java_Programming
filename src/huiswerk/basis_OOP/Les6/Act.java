package huiswerk.basis_OOP.Les6;

import java.util.Arrays;

public class Act
{
    private String naam;
    private Artiest[] artiesten;

    public Act(String naam, Artiest[] artiesten)
    {
        this.naam=naam;
        this.artiesten=artiesten;
    }

    public String getNaam()
    {
        return naam;
    }
    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public Artiest[] getArtiesten()
    {
        return artiesten;
    }
    public void setArtiesten(Artiest[] artiesten)
    {
        this.artiesten = artiesten;
    }

    @Override
    public String toString()
    {
        return "Act{" +
                "naam='" + naam + '\'' +
                ", artiesten=" + Arrays.toString(artiesten) +
                '}';
    }
}
