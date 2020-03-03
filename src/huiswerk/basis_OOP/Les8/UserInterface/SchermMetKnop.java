package huiswerk.basis_OOP.Les8.UserInterface;

import javax.swing.*;
import java.awt.*;

public class SchermMetKnop
{
    public static void main(String[] args)
    {
        JFrame scherm = new JFrame("piep");
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scherm.setSize(300,300);
        scherm.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        JButton knop = new JButton("klik hier");
        knop.addActionListener(new Beeper());
        scherm.add(knop);
        scherm.setVisible(true);
    }
}
