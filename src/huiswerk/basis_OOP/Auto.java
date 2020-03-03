package huiswerk.basis_OOP;

public class Auto
{
    private String merk;
    private String type;
    private Motor motor;
    private Aandrijflijn aandrijflijn;

    @Override
    public String toString()
    {
        if(merk=="Tesla")
        {
            return "Dikke stofzuiger wel";
        }
        else if(motor.isTurbo())
        {
            return  "Merk:"+merk+"\n" +
                    "Type:"+type+"\n" +
                    "Motor:" + motor.getMotorcode() +"\n" +
                    "Brandstof:" + motor.getBrandstof() +"\n" +
                    "Vermogen & Koppel:"+motor.getVermogen()+"pk en "+motor.getKoppel()+"Nm \n" +
                    "Aandrijflijn:" + aandrijflijn.toString() +"\n" +
                    "*Let op! Auto met Turbolader!*" +"\n";
        }
        else
        {
            return  "Merk:"+merk+"\n" +
                    "Type:"+type+"\n" +
                    "Motor:" + motor.getMotorcode() +"\n" +
                    "Brandstof:" + motor.getBrandstof() +"\n" +
                    "Vermogen & Koppel:"+motor.getVermogen()+"pk en "+motor.getKoppel()+"Nm \n" +
                    "Aandrijflijn:" + aandrijflijn.toString() +"\n";
        }
    }

    public Auto(String merk, String type, Motor motor, Aandrijflijn aandrijflijn)
    {
        this.merk = merk;
        this.type = type;
        this.motor = motor;
        this.aandrijflijn = aandrijflijn;
    }

    public String getMerk()
    {
        return merk;
    }
    public String getType()
    {
        return type;
    }
    public Motor getMotor()
    {
        return motor;
    }
    public double getPower()
    {
        return motor.getVermogen();
    }
    public Aandrijflijn getAandrijflijn()
    {
        return aandrijflijn;
    }




}

