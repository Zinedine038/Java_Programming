package huiswerk.basis_OOP.Les4;

public class main
{
    public static void main(String[] args)
    {
        //Hemellichaam hl5 = new Hemellichaam("Antares", "ster");
        //hl5.setTemperatuur(3204);
        //hl5.printTemperatuur();

        Weerbericht weerbericht = new Weerbericht(5.7, 7, "NO");

        System.out.println(weerbericht);
        weerbericht.verhoogDag();
        System.out.println(weerbericht);
        weerbericht.verhoogDag(2);
        System.out.println(weerbericht);
    }
}
