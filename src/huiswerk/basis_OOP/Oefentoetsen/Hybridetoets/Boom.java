package huiswerk.basis_OOP.Oefentoetsen.Hybridetoets;

public class Boom extends TuinElement
{
    private int straal;
    public Boom(int x, int y, int straal)
    {
        super("boom",x, y);
        if(straal<1)
            straal=1;
        else
            this.straal=straal;
    }

    @Override
    public String toString()
    {
        return "Boom ("+getX()+", "+getY()+")  :  Straal = "+straal;
    }

}

