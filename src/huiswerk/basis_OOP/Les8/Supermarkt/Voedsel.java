package huiswerk.basis_OOP.Les8.Supermarkt;

import java.util.Date;

public class Voedsel
{
    Date tht;

    public Voedsel(Date tht)
    {
        this.tht=tht;
    }

    @Override
    public String toString()
    {
        return "Voedsel{" +
                "tht=" + tht +
                '}';
    }
}


