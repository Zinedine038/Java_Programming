package huiswerk.basis_OOP.Les6;

public class Circus
{
    private String naam;
    private Artiest[] artiesten;

    public Circus(String naam, Artiest[] artiesten)
    {
        this.artiesten = artiesten;
        this.naam=naam;
    }

    public void printArtiesten()
    {
        System.out.println("Circus " + naam + " heeft de volgende artiesten");
        for (int i = 0; i<artiesten.length; i++)
        {
            System.out.println("* artiest nr. "+(i+1)+" = "+artiesten[i].getNaam() + " (een artiest)");
        }
    }

    public void SetArtiest(int nummer, Artiest artiest)
    {
        if(nummer-1<=artiesten.length && nummer-1>=0)
        {
            System.out.println("Lmao "+artiesten[nummer-1].getNaam()+" got fired");
            artiesten[nummer-1]=artiest;
        }
        else
        {
            System.out.println("Wellou bounds");
        }

    }
}
