package huiswerk.basis_OOP.Oefentoetsen.Oefentoets2;

public abstract class Lokaal
{
    protected String code;

    public Lokaal(String code)
    {
        this.code = code;
    }

    public abstract void printOmschrijving();

    public String getCode()
    {
        return code;
    }
}
