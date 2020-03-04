package huiswerk.basis_OOP.Oefentoetsen.Oefentoets2;

public class Computerlokaal extends Lokaal
{
    private int aantalComputers;

    public Computerlokaal(String code, int aantalComputers)
    {
        super(code);
        this.aantalComputers = aantalComputers;
    }

    @Override
    public void printOmschrijving()
    {
        System.out.println("Computerlokaal " + code + " met "+aantalComputers+" computers");
    }



}
