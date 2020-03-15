package huiswerk.basis_OOP.Oefentoetsen.Hybridetoets;

public abstract class TuinElement
{
    private String naam;
    private int x;
    private int y;

    public TuinElement(String naam, int x, int y)
    {
        this.naam = naam;
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    @Override
    public String toString()
    {
        return naam + " ("+x+","+y+")";
    }
}
