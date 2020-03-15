package huiswerk.basis_OOP.Oefentoetsen.Hybridetoets;

import java.util.ArrayList;

public class Tuin
{
    private static int minimumTuinGrootte = 7;
    private ArrayList<TuinElement> lijst;

    public Tuin()
    {
        lijst=new ArrayList<TuinElement>();
    }

    public void voegToe(TuinElement element)
    {
        lijst.add(element);
    }

    public void print()
    {
        System.out.println("==== Tuin ====");
        for(TuinElement element : lijst)
        {
            System.out.println("-" + element.toString());
        }
    }

    public boolean voldoetAanWensen()
    {
        return lijst.size() >= minimumTuinGrootte;
    }

}
