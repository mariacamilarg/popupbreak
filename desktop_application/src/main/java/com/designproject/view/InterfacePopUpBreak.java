package com.designproject.view;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.io.IOException;

public class InterfacePopUpBreak extends JFrame {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    /**
     * Panel: all tabs panel
     */
    private PanelTabs panelTabs;

    /**
     * Panel: agenda on the right side
     */
    private PanelAgenda panelAgenda;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates the interface by adding its panels
     */
    public InterfacePopUpBreak() throws IOException {

        // General setup
        setTitle("PopUpBreak");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        // Layout and panels setup
        setLayout(new BorderLayout());

        panelTabs = new PanelTabs(this);
        add(panelTabs, BorderLayout.CENTER);

        panelAgenda = new PanelAgenda(this);
        add(panelAgenda, BorderLayout.EAST);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------



    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Main to run the app
     *
     * @param args Command line params
     */
    public static void main(String[] args) {
        try {
            // Unifies the interface for different operating systems
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

            InterfacePopUpBreak interfacePopUpBreak = new InterfacePopUpBreak();
            interfacePopUpBreak.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
