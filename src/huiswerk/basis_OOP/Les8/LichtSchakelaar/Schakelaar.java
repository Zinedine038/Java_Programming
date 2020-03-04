package huiswerk.basis_OOP.Les8.LichtSchakelaar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Schakelaar implements ActionListener
{
    boolean knopaan;

    public Schakelaar(boolean knopaan)
    {
        this.knopaan = knopaan;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        knopaan=!knopaan;
        if(knopaan)
        {
            System.out.println("Het licht is aan");
        }
        else
        {
            System.out.println("Het licht is uit");
        }
    }
}
