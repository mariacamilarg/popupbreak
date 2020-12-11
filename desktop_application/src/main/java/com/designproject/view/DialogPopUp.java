package com.designproject.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.net.URL;

public class DialogPopUp extends JDialog {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    /**
     * Interface: connection to main interface for communication among panels
     */
    private InterfacePopUpBreak interfacePopUpBreak;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public DialogPopUp(InterfacePopUpBreak interfacePopUpBreak) {

        // Super
        super(interfacePopUpBreak,"Break time!",true);
        Point location = interfacePopUpBreak.getLocation();
        //setLocation(location.x+interfacePopUpBreak.ge80,location.y+80);
        setSize(new Dimension(50,50));

        // Initialize attributes
        this.interfacePopUpBreak = interfacePopUpBreak;
        //super.setLocationRelativeTo(interfacePopUpBreak);

        // Set layout
        setLayout(new BorderLayout());

        // Add gif to center
        URL url = getClass().getResource("/animations/test.gif");
        System.out.println(url);
        JLabel label = new JLabel(new ImageIcon(url));
        add(label, BorderLayout.CENTER);

        // Add buttons to the right
        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(3,1));
        panelButtons.add(new JButton("yes"));
        panelButtons.add(new JButton("no"));
        panelButtons.add(new JButton("later"));
        add(panelButtons, BorderLayout.EAST);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    public String run() {
        this.pack();
        this.setVisible(true);
        return "response";
    }
}
