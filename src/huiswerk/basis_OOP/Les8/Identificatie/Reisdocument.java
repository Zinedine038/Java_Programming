package huiswerk.basis_OOP.Les8.Identificatie;

public abstract class Reisdocument implements Legitimatiebewijs
{
    protected String naam;
    protected String bsn;
    abstract String getGeldigeLanden();

    public Reisdocument(String naam, String bsn)
    {
        this.naam = naam;
        this.bsn = bsn;
    }

    @Override
    public String toString()
    {
        return "Reisdocument{" +
                "naam='" + naam + '\'' +
                ", bsn='" + bsn + '\'' +
                "type: " + getDocumentType() +
                " geldig in " + getGeldigeLanden() +
                '}' ;
    }

    public String getNaam()
    {
        return naam;
    }

    public String getBSN()
    {
        return bsn;
    }
}
