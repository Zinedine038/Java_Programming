package huiswerk.basis_OOP.Les5;

public class Verpakking
{
    private int lengte;
    private int breedte;
    private int hoogte;
    private boolean vloeistof;

    public Verpakking(int lengte, int breedte, int hoogte, boolean vloeistof)
    {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.vloeistof = vloeistof;
    }

    public int getInhoud()
    {
        return lengte*breedte*hoogte;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
        {
            return false;
        }
        if( !(obj instanceof Verpakking))
        {
            return false;
        }

        Verpakking other = (Verpakking) obj;
        if(vloeistof && other.vloeistof)
        {
            return (getInhoud()==other.getInhoud());
        }
        else if(!vloeistof && !other.vloeistof)
        {
            if(hoogte==other.hoogte && lengte==other.lengte && breedte==other.breedte)
                return true;
            else
                return false;
        }
        else
        {
            return false;
        }
    }

    public int getLengte()
    {
        return lengte;
    }
    public int getBreedte()
    {
        return breedte;
    }
    public int getHoogte()
    {
        return hoogte;
    }
    public boolean isVloeistof()
    {
        return vloeistof;
    }
}
