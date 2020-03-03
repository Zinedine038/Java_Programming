package huiswerk.basis_OOP;

public class Motor
{
    public enum Type
    {
        I4,
        I6,
        V6,
        V8,
        V10,
        V12,
        B4,
        B6,
        R,
        ElektroMotor
    }

    private String motorcode;
    private double vermogen;
    private double koppel;
    private String brandstof;
    private Type typeMotor;
    private boolean turbo;
    private boolean opgevoerd;

    public String getMotorcode()
    {
        return motorcode;
    }
    public double getVermogen()
    {
        return vermogen;
    }
    public double getKoppel()
    {
        return koppel;
    }
    public String getBrandstof()
    {
        return brandstof;
    }
    public Type getType()
    {
        return typeMotor;
    }
    public boolean isTurbo()
    {
        return turbo;
    }
    public boolean isOpgevoerd()
    {
        return opgevoerd;
    }

    public Motor(String motorcode, int vermogen, int koppel, String brandstof, Type typeMotor, boolean turbo)
    {
        this.motorcode = motorcode;
        this.vermogen = vermogen;
        this.koppel = koppel;
        this.brandstof = brandstof;
        this.typeMotor = typeMotor;
        this.turbo=turbo;
    }

    public void voerOp()
    {
        if(!opgevoerd)
        {
            double extraVermogen;
            double extraKoppel;
            if(isTurbo())
            {
                extraVermogen = Math.round(vermogen*0.4);
                extraKoppel = Math.round(koppel*0.4);
                vermogen+=extraVermogen;
                koppel+=extraKoppel;
                System.out.println("De "+motorcode+" word opgevoerd door middel van het afstellen van de Turbo");

            }
            else
            {
                extraVermogen = Math.round(vermogen*0.15);
                extraKoppel = Math.round(koppel*0.15);
                vermogen+=extraVermogen;
                koppel+=extraKoppel;
                System.out.println("De "+motorcode+" word opgevoerd door middel van kleptiming en in/uitlaat");
            }
            System.out.println("Extra vermogen:"+extraVermogen+"pk\n"+
                               "Extra koppel:" + extraKoppel+"pk\n"+
                                "Nieuw vermogen en koppel:" + vermogen+"pk en "+koppel+"Nm! Resultaat! \n");

        }
        else
        {
            System.out.println("Opgevoerd tot zijn maximum!");
        }
    }

    public void turboCharge()
    {
        if(!isOpgevoerd())
        {
            if(!isTurbo())
            {
                turbo=true;
                vermogen=vermogen*2;
                koppel=koppel*2;
                System.out.println("De auto is nu voorzien van een turbo! \n" +
                                    "Nieuw vermogen en koppel:" + vermogen+"pk en "+koppel+"Nm! Resultaat! \n");
            }
            else
            {
                System.out.println("De Auto heeft al een turbo!");
            }
        }
        else
        {
            System.out.println("Opgevoerd tot zijn maximum!");
        }

    }

    @Override
    public String toString()
    {
        if(turbo)
        {
            return motorcode + " "+typeMotor+ " turbo-" +brandstof+"motor met " + vermogen +"pk en " + koppel +"Nm koppel";
        }
        else
        {
            return motorcode + " "+typeMotor+ " " +brandstof+"motor met " + vermogen +"pk en " + koppel +"Nm koppel";
        }
    }


}
