package huiswerk.basis_OOP.Oefentoetsen.Hybridetoets;

public class Main
{
    public static void main(String[] args)
    {
        Tuin tuin = new Tuin();
        Boom boom = new Boom(5,5,5);
        Bloemen bloemen = new Bloemen(5,5,"wit");

        tuin.voegToe(boom);
        tuin.voegToe(bloemen);

        tuin.print();
    }
}
