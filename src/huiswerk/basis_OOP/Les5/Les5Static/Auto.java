package huiswerk.basis_OOP.Les5.Les5Static;

/**
 * Les 1, 2, 3 en 4
 * Java huiswerk - Basis OOP
 */


public class Auto {

    // alle attributen zijn private: les 2 opgave 3 B
    private String merk;
    private String type;
    private int pk;
    private Aanhanger aanhanger;
    private int serienummer;
    private static int huidigNieuwsteSerienummer=1000;

    private String fabrieksNaam;
    private Fabriek fabriek;
    private boolean gesjoemeld;
    private boolean opgevoerd;


    // =========================================== Les 4 - Opgave 2 ====================================================
    /**
     * Overloaded constructor van de auto klasse.
     * @param merk merk van de auto.
     * @param type type van de auto.
     * @param pk aantal pks dat de auto heeft.
     */
    public Auto(String merk, String type, int pk, Fabriek fabriek) {
        System.out.println("auto:               constructor - De constructer zal nu een AUTO object gaan maken. ");
        this.merk = merk;
        this.type = type;
        this.pk = pk;
        this.fabriek=fabriek;
        opgevoerd = false;
        huidigNieuwsteSerienummer++;
        serienummer = huidigNieuwsteSerienummer;
    }

    public void sjoemel()
    {
        if(!gesjoemeld && fabriek!=null)
        {
            gesjoemeld=true;
            fabriek.registreerProductieFout(this);
        }
    }

    public boolean isGesjoemeld()
    {
        return gesjoemeld;
    }

    // =========================================== Les 2 - Opgave 3 A ====================================================
    /**
     * Hier zie je een overload van de toString methode.
     * @return Het is belangrijk om de zelfde syntax als de toString() aan te houden dus je moet ook een string teruggeven en je mag geen parameters opgeven.
     */

    public String toString() {
        if (opgevoerd) {
            return merk + " " + type + " (" + pk + " pk, is al opgevoerd) uit de fabriek: " + fabrieksNaam;
        } else {
            return merk + " " + type + " (" + pk + " pk, maximaal op te voeren met " + berekenOpvoerMogelijkheid() + ") uit de fabriek: " + fabrieksNaam;

        }
    }

    // =========================================== Les 2 - Opgave 3 B, getters en setters ====================================================

    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getPk() {
        return pk;
    }
    public void setPk(int pk) {
        this.pk = pk;
    }

    // ===========================================les 2, opgave 5 ====================================================

    /**
     *
     * Hier zie je een publieke methode. Doordat de methode publiek is kan deze overal gebruikt worden zolang er een object is aangemaakt.
     * @param extraPk Er is maar 1 parameter opgegeven en dit is van het type int.
     * Omdat deze methode is aangemaakt met void is er geen return waarde. Deze methode zal dus alleen iets uitvoeren en niks terug geven.
     */
    public void voerOp(int extraPk) {
        System.out.println("auto:                    voerOP - Is de auto al eerder opgevoerd?");
        if (opgevoerd) { // if(opgevoerd == true) kan ook
            System.out.println("auto:                    voerOP - Deze auto is al een keer opgevoerd.");
        } else {
            System.out.println("auto:                    voerOP - Deze auto is nog niet eerder opgevoerd.");
            System.out.println();
            System.out.println("auto:                    voerOP - Ik wil de auto graag opvoeren met " + extraPk + ". Kan dit?");
            if (extraPk <= berekenOpvoerMogelijkheid()) {
                System.out.println("auto:                    voerOP - Dit is geen probleem we voegen de pk's nu toe aan de auto.");
                pk = pk + extraPk; // Hier worden de pk's aangepast.
                opgevoerd = true; // We geven nu aan dat de auto is opgevoerd.
            } else {
                System.out.println("auto:                    voerOP - Helaas kunnen we de extra pk's " + extraPk + " niet toe voegen.");
                System.out.println("auto:                    voerOP - Het maximale wat de auto aan kan is: " + berekenOpvoerMogelijkheid());
            }
            System.out.println("auto:                    voerOP - resultaat: " + this.toString());
        }
    }

    // ===========================================les 2, opgave 6 ====================================================

    /**
     * Hier hebben we hun publieke methode om verschil van pk's te bekijken.
     * @param andereAuto Dit is de auto die we mee geven aan de methode waarbij we de auto willen vergelijken van huidige instantie(this).
     * @return We geven het verschil tussen de twee auto's terug. Als het getal negative is betekent dat de andereAuto meer pk's heeft.
     * Je ziet hier dat je Auto nu ook als type kan gebruiken ipv een int of string.
     */
    public int vergelijkPK(Auto andereAuto) {

        System.out.println("auto:               vergelijkPK - Even kijken per auto hoeveel pk ze hebben.");
        int pk1 = this.getPk();
        int pk2 = andereAuto.getPk();

        int verschil = 0; // Het verschil is bij het begin altijd 0;

        System.out.println("auto:               vergelijkPK - Oke nu kan ik het verschil gaan bepalen.");
        if (pk1 > pk2) {
            verschil = pk1 - pk2;
            System.out.println("auto:               vergelijkPK - De " + this.getMerk() + " heeft meer vermogen dan de " + andereAuto.getMerk() + ", het verschil is " + verschil + " pk.");
        } else if (pk1 < pk2) {
            verschil = pk2 - pk1;
            System.out.println("auto:               vergelijkPK - De " + andereAuto.getMerk() + " heeft meer vermogen dan de " + this.getMerk() + ", het verschil is " + verschil + " pk.");
        } else {
            System.out.println("auto:               vergelijkPK - De " + andereAuto.getMerk() + " en de " + this.getMerk() + " hebben even veel vermogen (" + pk1 + " pk)");
        }
        System.out.println(); //nieuwe line om het meer leesbaar te maken.

        return verschil;
    }


    // ===========================================les 2, opgave 7 ====================================================

    /**
     * Dit is een publieke methode met zonder parameters.
     * @return Je ziet nu dat er wel een return value is. Dit moet een int zijn.
     */
    public int berekenOpvoerMogelijkheid() {
        System.out.println("auto: berekenOpvoerMogelijkheid - Is de auto al eerder opgevoerd?");
        if (opgevoerd) {
            System.out.println("auto: berekenOpvoerMogelijkheid - Deze auto is al een keer opgevoerd er kan niks meer bij.");
            return 0;
        } else {
            System.out.println("auto: berekenOpvoerMogelijkheid - Deze auto is nog niet opgevoerd nu even bepalen wat maximale pk's zijn die er nog bij kunnen.");
            return pk - 20;
        }
    }


    // =============================================== Les 2 - Opgave 10 ===============================================
    public boolean isOpgevoerd(){ return opgevoerd; }

    public int getSerienummer()
    {
        return serienummer;
    }

    public static int getHuidigNieuwsteSerienummer()
    {
        return huidigNieuwsteSerienummer;
    }
}
