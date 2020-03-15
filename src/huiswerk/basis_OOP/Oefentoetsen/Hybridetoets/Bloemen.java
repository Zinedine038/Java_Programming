package huiswerk.basis_OOP.Oefentoetsen.Hybridetoets;

public class Bloemen extends TuinElement
{
    private String kleur;
    public Bloemen(int x, int y, String kleur)
    {
        super("Bloemen", x, y);
        if(kleur.equals("geel") || kleur.equals("wit") || kleur.equals("rood"))
        {
            this.kleur=kleur;
        }
        else
        {
            this.kleur="?";
        }
    }

    @Override
    public String toString()
    {
        return "Bloemen ("+getX()+", "+getY()+")  :  Kleur = "+kleur;
    }
}
