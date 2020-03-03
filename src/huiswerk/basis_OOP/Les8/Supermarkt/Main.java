package huiswerk.basis_OOP.Les8.Supermarkt;

import java.util.ArrayList;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        Vlees vlees1 = new Vlees(new Date(), "Rund", 3);
        Vlees vlees2 = new Vlees(new Date(), "Kip", 1);

        System.out.println(vlees1);
        System.out.println(vlees2);

        Koelproduct koelproduct = new Vlees(new Date(), "Lams", 2);

        ArrayList<Koelproduct> koelproducts = new ArrayList<>();
        koelproducts.add(vlees1);
        koelproducts.add(vlees2);
        koelproducts.add(koelproduct);

        for(Koelproduct koel : koelproducts)
        {
            System.out.println(koel.getBewaartemperatuur());
        }

    }
}
