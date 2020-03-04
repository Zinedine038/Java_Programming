package huiswerk.basis_OOP.Les8.Identificatie;

public class Main
{
    public static void main(String[] args)
    {
        Persoon persoon1 = new Persoon(new Paspoort("Hannie", "44320098"));
        Persoon persoon2 = new Persoon(new Identiteitskaart("Jennie", "44320098"));
        Persoon persoon3 = new Persoon(new Rijbewijs("Tonnie", "44320098", "BE"));
        persoon3.setRijbewijs(null);
        persoon1.toonOverzicht();
        persoon2.toonOverzicht();
        persoon3.toonOverzicht();
    }
}
