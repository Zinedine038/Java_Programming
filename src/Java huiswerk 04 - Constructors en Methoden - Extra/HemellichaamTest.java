package huiswerk03;

public class HemellichaamTest {

    public static void main(String[] args) {
        Hemellichaam hl1 = new Hemellichaam("Mercurius", "planeet");
        System.out.println("naam: " + hl1.getNaam());
        System.out.println("type: " + hl1.getType());
        System.out.println(hl1);
        Hemellichaam hl2 = new Hemellichaam("PSO J318.5-22");
        System.out.println(hl2);

        Hemellichaam hl3 = new Hemellichaam("Pluto", "planeet");
        System.out.println(hl3);
        hl3.setType("dwergplaneet");
        System.out.println(hl3);

        Hemellichaam hl4 = new Hemellichaam("Aarde", "planeet");
        hl4.setTemperatuur(-89, 58);
        hl4.printTemperatuur();

        Hemellichaam hl5 = new Hemellichaam("Antares", "ster");
        hl5.setTemperatuur(3204);
        hl5.printTemperatuur();
    }
}
