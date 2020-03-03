package huiswerk.basis_OOP.Les8;

public class Selfie implements Likeable
{
    private int aantalLikes;

    public void like()
    {
        this.aantalLikes++;
    }

    public int getAantalLikes()
    {
        return aantalLikes;
    }
}
