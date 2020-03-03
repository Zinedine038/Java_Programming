package huiswerk.basis_OOP.Les8.Supermarkt;

import java.util.Date;

public class Vlees extends Voedsel implements Koelproduct
{
    private String diersoort;
    private int bewaar;

    public Vlees(Date tht, String diersoort, int bewaar)
    {
        super(tht);
        this.diersoort = diersoort;
        this.bewaar = bewaar;
    }

    @Override
    public int getBewaartemperatuur()
    {
        return bewaar;
    }

    @Override
    public String toString()
    {
        return "Vlees{" +
                "diersoort='" + diersoort + '\'' +
                ", bewaar=" + bewaar +
                ", tht=" + tht +
                '}';
    }
}
