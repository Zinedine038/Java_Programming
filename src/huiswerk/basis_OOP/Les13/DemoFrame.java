package huiswerk.basis_OOP.Les13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoFrame extends JFrame implements ActionListener
{
    private JLabel jlNaam;
    private JLabel jlLeeftijd;
    private JTextField jtfNaam;

    private JTextField jtfLeeftijd;
    private JButton jbOk;
    public DemoFrame()
    {
        setTitle("Titel");
        setSize(100,750);
        setLayout(new FlowLayout());

        //Hier komen controls
        jlNaam= new JLabel("naam");
        add(jlNaam);
        jtfNaam = new JTextField(12);
        add(jtfNaam);
        jlLeeftijd= new JLabel("Leeftijd");
        add(jlLeeftijd);
        jtfLeeftijd = new JTextField(12);
        add(jtfLeeftijd);
        jbOk=new JButton("ok");
        add(jbOk);
        jbOk.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String naam = jtfNaam.getText();
        String leeftijdTxt = jtfLeeftijd.getText();
        try
        {
            int leeftijd = Integer.parseInt(leeftijdTxt);
            if(leeftijd<12)
            {
                JLabel input = new JLabel(naam + " is te jong!");
                add(input);
                setVisible(true);
            }
            else
            {
                JLabel input = new JLabel(naam + " is " + leeftijd + " jaar oud en mag mee");
                add(input);
                setVisible(true);
            }

        }
        catch(NumberFormatException nfe)
        {
            System.out.println("Vul een getal in!");
        }


    }
}
