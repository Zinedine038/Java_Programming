package huiswerk.basis_OOP.Les12;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

public class TryCatch
{
    public static void main(String[] args)
    {
        JFrame scherm = new JFrame("Plaatje");
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scherm.setLayout(new FlowLayout());
        scherm.setSize(1000, 400);

        ImageIcon javaStrand;


        try
        {
            URL afbUrl = new URL("wellou");
            javaStrand = new ImageIcon(afbUrl);
        }
        catch(MalformedURLException mURL)
        {
            System.out.println("fout in url: standaardplaatje.");
            javaStrand = new ImageIcon("src/fout.png");
        }

        JLabel plaatje = new JLabel(javaStrand);
        scherm.add(plaatje);
        scherm.setVisible(true);


    }

}
