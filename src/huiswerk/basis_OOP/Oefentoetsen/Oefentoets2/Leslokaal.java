package huiswerk.basis_OOP.Oefentoetsen.Oefentoets2;

public class Leslokaal extends Lokaal
{
    public Leslokaal(String code)
    {
        super(code);
    }

    @Override
    public void printOmschrijving()
    {
        System.out.println("Leslokaal "+code);
    }


}
