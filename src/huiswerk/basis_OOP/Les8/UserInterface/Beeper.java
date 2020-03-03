package huiswerk.basis_OOP.Les8.UserInterface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.TrayIcon.MessageType;


public class Beeper implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(SystemTray.isSupported())
        {
            try
            {
                message();
            } catch (AWTException ex)
            {
                ex.printStackTrace();
            }
        }
        System.out.println("buttonpressed");
    }

    public void message() throws AWTException
    {
        SystemTray tray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("Button Pressed");
        tray.add(trayIcon);
        trayIcon.displayMessage("Klikker", "Je moeder", MessageType.INFO);
    }
}
