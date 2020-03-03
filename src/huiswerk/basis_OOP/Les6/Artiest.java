package huiswerk.basis_OOP.Les6;

public class Artiest
{
    private String naam;

    public String getNaam()
    {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    @Override
    public String toString()
    {
        return "Artiest{" +
                "naam='" + naam + '\'' +
                '}';
    }
}
