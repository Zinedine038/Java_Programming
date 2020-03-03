package huiswerk.basis_OOP.Les4;

public class Hemellichaam
{
    private String naam;
    private String type;
    private int tempMax;
    private int tempMin;

    public Hemellichaam(String naam, String type)
    {
        this.naam = naam;
        this.type = type;
        tempMin=0;
        tempMax=0;
    }

    public Hemellichaam(String naam)
    {
        this.naam = naam;
        type="onbekend";
        tempMin=0;
        tempMax=0;
    }

    @Override
    public String toString()
    {
        return naam+" ("+type+")";
    }

    public String getNaam()
    {
        return naam;
    }
    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        System.out.println("Het type van "+naam+" verandert van "+this.type+" naar " +type);
        this.type = type;
    }

    public void setTemperatuur(int temp)
    {
        tempMin=temp;
        tempMax=temp;
    }

    public void setTemperatuur(int tempMin, int tempMax)
    {
        this.tempMin = tempMin;
        this.tempMax= tempMax;
    }

    public void printTemperatuur()
    {
        if(tempMax==tempMin)
        {
            System.out.println("Het is ongeveer "+tempMax+" graden");
        }
        else
        {
            System.out.println("Het is minimaal "+tempMin+" graden, en maximaal "+tempMax+" graden");
        }
    }
}
