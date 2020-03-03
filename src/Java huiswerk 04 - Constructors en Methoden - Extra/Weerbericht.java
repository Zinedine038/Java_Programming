package huiswerk03;

public class Weerbericht {

    private double temperatuur;
    private int windkracht;
    private String windrichting;
    private boolean bewolking;
    private boolean neerslag;
    private boolean zon;

    // opgave a en b
    /*
     public Weerbericht(double temperatuur, int windkracht, String windrichting) {
     // opgave a
     this.temperatuur = temperatuur;
     this.windkracht = windkracht;
     this.windrichting = windrichting;

     // opgave b
     neerslag = false;
     bewolking = false;
     zon = true;
     }
     */
    // opgave d
    public Weerbericht(double temperatuur, int windkracht, String windrichting) {
        // default waarden:
        // bewolking=false
        // neerslag=false
        // zon=false
        this(temperatuur, windkracht, windrichting, false, false, true);
    }

    // opgave c, d
    public Weerbericht(double temperatuur, int windkracht, String windrichting, boolean bewolking, boolean neerslag, boolean zon) {
        // opgave c
        /*
         this.temperatuur = temperatuur;
         this.windkracht = windkracht;
         this.windrichting = windrichting;
         this.bewolking = bewolking;
         this.neerslag = neerslag;
         this.zon = zon;
         */
        // opgave e
        setTemperatuur(temperatuur);
        setWindkracht(windkracht);
        setWindrichting(windrichting);
        setBewolking(bewolking);
        setNeerslag(neerslag);
        setZon(zon);
    }

    // opgave opgave b
    public String toString() {
        String weerbericht = "Weerbericht - temperatuur: " + temperatuur + ", wind: " + windkracht + " " + windrichting;
        if (neerslag) {
            weerbericht += ", neerslag";
        }
        if (bewolking) {
            weerbericht += ", bewolking";
        }
        if (zon) {
            weerbericht += ", zon";
        }
        return weerbericht;
    }

    public double getTemperatuur() {
        return temperatuur;
    }

    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }

    public int getWindkracht() {
        return windkracht;
    }

    public void setWindkracht(int windkracht) {
        this.windkracht = windkracht;
    }

    public String getWindrichting() {
        return windrichting;
    }

    public void setWindrichting(String windrichting) {
        this.windrichting = windrichting;
    }

    public void setBewolking(boolean bewolking) {
        this.bewolking = bewolking;
        // opgave e
        if (!bewolking) { // zelfde als bewolking == false
            zon = true;
            neerslag = false;
        }
    }

    public void setNeerslag(boolean neerslag) {
        this.neerslag = neerslag;
        // opgave e
        if (neerslag) { // zelfde als neerslag == true
            bewolking = true;
        }
    }

    public void setZon(boolean zon) {
        this.zon = zon;
    }
}
