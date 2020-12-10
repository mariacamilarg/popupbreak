package com.designproject.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class PanelAgenda extends JPanel {

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
    public PanelAgenda(InterfacePopUpBreak interfacePopUpBreak) {

        // Initialize attributes
        this.interfacePopUpBreak = interfacePopUpBreak;

        // Set layout
        setLayout(new GridLayout(10,1));

        add(new JLabel("space for agenda... "));
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
}
