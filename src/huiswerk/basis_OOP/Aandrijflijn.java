package huiswerk.basis_OOP;

public class Aandrijflijn
{
    public enum Type
    {
        FWD,
        RWD,
        AWD,
    }

    private Type aandrijflijn;
    private int versnellingen;
    private boolean automaat;

    public Type getType()
    {
        return aandrijflijn;
    }
    public int getVersnellingen()
    {
        return versnellingen;
    }
    public boolean isAutomaat()
    {
        return automaat;
    }

    public Aandrijflijn(Type aandrijflijn, int versnellingen, boolean automaat)
    {
        this.aandrijflijn = aandrijflijn;
        this.versnellingen = versnellingen;
        this.automaat = automaat;
    }

    @Override
    public String toString()
    {
        if(!automaat)
        {
            return aandrijflijn.toString() + " met een handgeschakelde "+versnellingen+" bak";
        }
        else
        {
            return aandrijflijn.toString() + " met een automatische "+versnellingen+" bak";
        }
    }
}
