package huiswerk.basis_OOP.Les5.Les5Static;

/**
 * Week 1
 * Les 2
 * Java huiswerk - Basis OOP
 * Opgave 2 A en B
 */

public class Aanhanger
{
    private int aantalWielen;
    private int lengte;

    public int getAantalWielen() {
        return aantalWielen;
    }

    public void setAantalWielen(int w) {
        if (w > 0) {
            aantalWielen = w;
        } else {
            // laten weten dat er een foute invoer is geweest.
            // Wellicht zou je hier ook een exception (komt in een latere les) kunnen gooien, als signaal dat er iets fout is.
            if (w == 0) {
                System.out.println("setAantalWielen(" + w + ") --> hoe wilde je met zo weinig wielen gaan rijden?");
            } else {
                System.out.println("setAantalWielen(" + w + ") --> heb je ooit van " + w + " wielen gehoord?");
            }
        }
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int l) {
        if (l > 0) {
            lengte = l;
        }
        // hier zou een waarschuwing kunnen worden geprint
    }
}

/*
// update van Aanhanger voor les 4:
// zonder setters, maar met een constructor waarin je de waardes meegeeft.
// uiteraard moet je nu de aanroep Aanhanger ... = new Aanhanger(); aanpassen en
// de juiste lengte en aantalWielen meegeven.
//
// nadeel: nu kun je de aanhanger niet meer veranderen nadat hij eenmaal aangemaakt is.

public class Aanhanger
{
    private int aantalWielen;
    private int lengte;

    public Aanhanger(int aantalWielen, int lengte) {
        this.lengte = lengte;
        this.aantalWielen = aantalWielen;
    }
    public int getLengte() {
        return lengte;
    }
    public int getAantalWielen() {
        return aantalWielen;
    }
}
 */

