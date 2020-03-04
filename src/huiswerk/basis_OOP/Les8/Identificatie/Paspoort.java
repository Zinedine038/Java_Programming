package huiswerk.basis_OOP.Les8.Identificatie;

public class Paspoort extends Reisdocument
{
    public Paspoort(String naam, String bsn)
    {
        super(naam, bsn);
    }

    @Override
    String getGeldigeLanden()
    {
        return "de hele wereld";
    }

    @Override
    public String getDocumentType()
    {
        return "paspoort";
    }
}
