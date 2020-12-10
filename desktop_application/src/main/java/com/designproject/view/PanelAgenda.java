package com.designproject.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

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
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Set margin
        this.setBorder(new EmptyBorder(20, 10, 10, 10));

        // Initialize elements
        ArrayList<JCheckBox> dayCommitments = new ArrayList<>();
        dayCommitments.add(new JCheckBox("<html>9.00 - 10.00 <br> Team meeting</html>"));
        dayCommitments.add(new JCheckBox("<html>10.30 - 10.35 <br> Drink water</html>"));
        dayCommitments.add(new JCheckBox("<html>12.00 - 13.00 <br> Lunch</html>"));
        dayCommitments.add(new JCheckBox("<html>14.00 - 16.00 <br> Assignments</html>"));
        dayCommitments.add(new JCheckBox("<html>16.00 - 16.30 <br> Healthy snack <br> Move excercise</html>"));
        dayCommitments.add(new JCheckBox("<html>17.30 - 17.35 <br> Eye break</html>"));

        // Add elements to panel
        for (int i = 0; i < dayCommitments.size(); i++) {
            dayCommitments.get(i).setVerticalTextPosition(SwingConstants.NORTH);
            add(dayCommitments.get(i));
            add(Box.createRigidArea(new Dimension(0, 10)));;
        }

    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
}
