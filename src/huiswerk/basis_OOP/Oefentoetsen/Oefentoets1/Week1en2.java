package huiswerk.basis_OOP.Oefentoetsen.Oefentoets1;
import java.time.DayOfWeek;

public class Week1en2
{
    public static void main(String[] args)
    {
        Melding melding1 = new Melding("De kroketten zijn op!");
        System.out.println(melding1);
        melding1.setAangepasteDag(DayOfWeek.TUESDAY);
        System.out.println(melding1);
    }
}
