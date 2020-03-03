package huiswerk03;

public class Hemellichaam {

    private String naam;
    private String type;
    private int temperatuurMin;
    private int temperatuurMax;

    public Hemellichaam(String naam, String type) {
        this.naam = naam;
        this.type = type;
    }

    public Hemellichaam(String naam) {
        this.naam = naam;
        this.type = "onbekend";
    }

    public String toString() {
        return naam + " (" + type + ")";
    }

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("Het type van " + naam + " verandert van " + this.type + " naar " + type);
        this.type = type;
    }

    public void setTemperatuur(int t) {
        this.temperatuurMin = t;
        this.temperatuurMax = t;
    }

    public void setTemperatuur(int t1, int t2) {
        this.temperatuurMin = t1;
        this.temperatuurMax = t2;
    }

    public void printTemperatuur() {
        if (temperatuurMin == temperatuurMax) {
            System.out.println("De temperatuur is ongeveer " + temperatuurMin + " graden");
        } else {
            System.out.println("Het is minmaal " + temperatuurMin + " graden, en maximaal " + temperatuurMax + " graden");
        }
    }
}
