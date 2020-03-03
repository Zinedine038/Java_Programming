package huiswerk.basis_OOP.Les7;

public class Persoon
{
    private String naam;
    private int lengte;

    public Persoon(String naam, int lengte)
    {
        this.naam = naam;
        this.lengte = lengte;
    }

    @Override
    public String toString()
    {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", lengte=" + lengte +
                '}';
    }
}
