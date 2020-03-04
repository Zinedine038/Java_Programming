package huiswerk.basis_OOP.Les8.Identificatie;

public class Rijbewijs implements Legitimatiebewijs
{
    private String naam;
    private String bsn;
    private String categorie;

    public Rijbewijs(String naam, String bsn, String categorie)
    {
        this.naam = naam;
        this.bsn = bsn;
        this.categorie = categorie;
    }

    @Override
    public String getDocumentType()
    {
        return "Rijbewijs";
    }

    @Override
    public String getNaam()
    {
        return naam;
    }

    @Override
    public String getBSN()
    {
        return bsn;
    }

    public String getCategorie()
    {
        return categorie;
    }



    @Override
    public String toString()
    {
        return "Rijbewijs{" +
                "naam='" + naam + '\'' +
                ", bsn='" + bsn + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}
