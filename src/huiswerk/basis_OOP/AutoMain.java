package huiswerk.basis_OOP;

/**
 * Week 1
 * Les 1
 * Java huiswerk - Basis OOP
 * Opgave 2, 3, 4
 */

public class AutoMain {

    public static void main(String[] args)
    {

        System.out.println("\n");
        // ================================================ Les2 ============================================

        Motor motor1 = new Motor("S54",343,355,"Benzine", Motor.Type.I6, false);
        Aandrijflijn aandrijflijn1 = new Aandrijflijn(Aandrijflijn.Type.RWD,6,false);
        Auto auto1 = new Auto("BMW","E46 M3",motor1,aandrijflijn1);
        System.out.println(auto1);

        Motor motor2 = new Motor("EJ257",309,407,"Benzine", Motor.Type.B4, true);
        Aandrijflijn aandrijflijn2 = new Aandrijflijn(Aandrijflijn.Type.AWD,6,false);
        Auto auto2 = new Auto("Subaru","Impreza WRX STI",motor2,aandrijflijn2);
        System.out.println(auto2);

        Motor motor3 = new Motor("S62",400,500,"Benzine", Motor.Type.V8, false);
        Aandrijflijn aandrijflijn3 = new Aandrijflijn(Aandrijflijn.Type.RWD,6,false);
        Auto auto3 = new Auto("BMW","E39 M5",motor3,aandrijflijn3);
        //System.out.println(auto3);

        Motor motor4 = new Motor("B6ZE",114,136,"Benzine", Motor.Type.I4, false);
        Aandrijflijn aandrijflijn4 = new Aandrijflijn(Aandrijflijn.Type.RWD,5,false);
        Auto auto4 = new Auto("Mazda","Miata",motor4,aandrijflijn4);
        //System.out.println(auto4);

        Motor motor5 = new Motor("S70/2",627,650,"Benzine", Motor.Type.V12, false);
        Aandrijflijn aandrijflijn5 = new Aandrijflijn(Aandrijflijn.Type.RWD,6,false);
        Auto auto5 = new Auto("McLaren","F1",motor5,aandrijflijn5);
        //System.out.println(auto5);

        System.out.println("\n");

        comparePower(auto1,auto2);
        auto2.getMotor().voerOp();
        comparePower(auto1,auto2);
        auto1.getMotor().voerOp();
        comparePower(auto1,auto2);
    }

    public static void comparePower(Auto a1, Auto a2)
    {
        Auto winner;
        Auto loser;
        double powerdiff;
        if(a1.getPower()>a2.getPower())
        {
            winner=a1;
            loser=a2;
        }
        else
        {
            winner=a2;
            loser=a1;
        }
        powerdiff=winner.getPower()-loser.getPower();
        System.out.println("De "+winner.getMerk()+" heeft meer vermogen dan de "+loser.getMerk()+", het verschil is "+ powerdiff +"pk!");
    }
}




