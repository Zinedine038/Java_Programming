package huiswerk.basis_OOP.Les8.Identificatie;

public class Persoon
{
    private String naam;
    private Rijbewijs rijbewijs;
    private Reisdocument reisdocument;

    public Persoon(Rijbewijs rijbewijs)
    {
        this.rijbewijs = rijbewijs;
        this.naam = rijbewijs.getNaam();
    }

    public Persoon(Reisdocument reisdocument)
    {
        this.reisdocument = reisdocument;
        this.naam=reisdocument.getNaam();
    }

    @Override
    public String toString()
    {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", rijbewijs=" + rijbewijs +
                ", reisdocument=" + reisdocument +
                '}';
    }

    public void setRijbewijs(Rijbewijs rijbewijs)
    {
        this.rijbewijs=rijbewijs;
    }

    public void setReisdocument(Reisdocument reisdocument)
    {
        this.reisdocument=reisdocument;
    }

    public Legitimatiebewijs getLegitimatie()
    {
        if(rijbewijs!=null)
        {
            return rijbewijs;
        }
        else if(reisdocument!=null)
        {
            return reisdocument;
        }
        else
        {
            return null;
        }
    }

    public void toonOverzicht()
    {
        if(getLegitimatie()!=null)
        {
            String output = naam + ", BSN: " + getLegitimatie().getBSN()+"\n" ;
            if(rijbewijs!=null)
            {
                output=output+"\t"+"Rijbewijs, categorie" + rijbewijs.getCategorie() + "\n";
            }
            if(reisdocument!=null)
            {
                output=output+"\t"+"Reisdocument: "+reisdocument.getDocumentType()+", reizen in " + reisdocument.getGeldigeLanden() +"\n";
            }
            System.out.println(output);
        }
        else
        {
            System.out.println(naam + ", kan zich niet legitimeren");
        }

    }
}
