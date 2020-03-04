package huiswerk.basis_OOP.Les8.Identificatie;

public class Identiteitskaart extends Reisdocument
{
    public Identiteitskaart(String naam, String bsn)
    {
        super(naam, bsn);
    }

    @Override
    String getGeldigeLanden()
    {
        return "Europa";
    }

    @Override
    public String getDocumentType()
    {
        return "ID-Kaart";
    }
}
