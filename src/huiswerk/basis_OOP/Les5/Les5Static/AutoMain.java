package huiswerk.basis_OOP.Les5.Les5Static;

/**
 * behorend bij Les 1,2,3 en 4
 * Java huiswerk - Basis OOP
 */

public class AutoMain {
    public static void main(String[] args)
    {
        // ergens, bv in de main:
        System.out.println("aantal: " + Fabriek.getTotaalGemaakteAutos()); // 0
        Fabriek fabriek = new Fabriek("BMW");
        Auto a = fabriek.maakAuto("E46 M3",343);
        Auto bb = fabriek.maakAuto("E60 M5",507);
        System.out.println("aantal: " + Fabriek. getTotaalGemaakteAutos()); // 2
        Fabriek fabriekTwee = new Fabriek("Volkswagen");
        Auto ccc = fabriekTwee.maakAuto("Golf TDI",115);
        Auto dddd = fabriekTwee.maakAuto("Jetta TDI",105);
        Auto eeeee = fabriek.maakAuto("E39 M5",400);
        System.out.println("aantal: " + Fabriek.getTotaalGemaakteAutos()); // 5

        dddd.sjoemel();
        Fabriek.printTotaalAantalSjoemelAutos();

    }
}
