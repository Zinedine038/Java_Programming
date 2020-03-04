package huiswerk.basis_OOP.Les8.LichtSchakelaar;

import javax.swing.*;

public class SchermMetKnop
{

    public static void main(String[] args)
    {
        JFrame scherm = new JFrame("licht");
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scherm.setSize(300,300);
        JButton knop = new JButton("klik hier");


        Schakelaar s = new Schakelaar(false);

        knop.addActionListener(s);
        scherm.add(knop);
        scherm.setVisible(true);
    }
}
