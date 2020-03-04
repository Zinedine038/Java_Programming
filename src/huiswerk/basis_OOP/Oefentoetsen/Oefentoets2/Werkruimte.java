package huiswerk.basis_OOP.Oefentoetsen.Oefentoets2;

public class Werkruimte implements Reserveerbaar
{
    private boolean[] dagen = new boolean[5];

    @Override
    public void reserveer(int dag)
    {
        if(dag>0 && dag<5)
        {
            if(!isGereserveerd(dag))
            {
                dagen[dag]=true;
            }
        }

    }

    @Override
    public boolean isGereserveerd(int dag)
    {
        return dagen[dag];
    }
}
