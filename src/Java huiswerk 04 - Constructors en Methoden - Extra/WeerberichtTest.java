package huiswerk03;

public class WeerberichtTest {

    public static void main(String[] args) {
        // opgave a
        Weerbericht weerbericht = new Weerbericht(5.7, 7, "NO");
        System.out.println(weerbericht.getTemperatuur());
        System.out.println(weerbericht.getWindkracht());
        System.out.println(weerbericht.getWindrichting());

        // opgave b
        System.out.println(weerbericht);
        weerbericht.setBewolking(true);
        System.out.println(weerbericht);
        weerbericht.setNeerslag(true);
        System.out.println(weerbericht);

        // opgave c
        Weerbericht weerbericht2 = new Weerbericht(24.5, 3, "ZO", true, true, true);
        System.out.println(weerbericht2);

        // opgave e
        Weerbericht weerbericht3 = new Weerbericht(4.0, 9, "NO", false, true, false);
        // geen bewolking, wel neerslag, geen zon: kan niet, dus geen bewolking dan ook geen neerslag en wel zon
        System.out.println(weerbericht3);
        weerbericht3.setBewolking(false); // geen wolken, dan dus ook geen neerslag en wel zon
        System.out.println(weerbericht3);
    }
}
