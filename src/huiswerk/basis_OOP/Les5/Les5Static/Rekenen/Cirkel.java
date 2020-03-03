package huiswerk.basis_OOP.Les5.Les5Static.Rekenen;

public class Cirkel
{
    private double straal;
    public Cirkel(double straal)
    {
        this.straal = straal;
    }

    public double berekenOmtrek()
    {
        return 2*straal*Math.PI;
    }

    public double berekenOppervlakte()
    {
        return Math.PI*Math.pow(straal,2);
    }
}
