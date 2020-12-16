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
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        // Set margin
        this.setBorder(new EmptyBorder(20, 10, 10, 10));

        // Initialize day commitments
        ArrayList<JCheckBox> dayCommitments = new ArrayList<>();
        dayCommitments.add(new JCheckBox("<html>9.00 - 10.00 <br> Team meeting</html>", true));
        dayCommitments.add(new JCheckBox("<html>10.30 - 10.35 <br> Drink water</html>", true));
        dayCommitments.add(new JCheckBox("<html>12.00 - 13.00 <br> Lunch</html>", true));
        dayCommitments.add(new JCheckBox("<html>14.00 - 16.00 <br> Assignments</html>", true));
        dayCommitments.add(new JCheckBox("<html>16.00 - 16.30 <br> Healthy snack <br> Move exercise</html>", true));
        dayCommitments.add(new JCheckBox("<html>17.30 - 17.35 <br> Eye break</html>", true));

        // Add day commitments to panel
        for (int i = 0; i < dayCommitments.size(); i++) {
            dayCommitments.get(i).setVerticalTextPosition(SwingConstants.NORTH);
            add(dayCommitments.get(i));
            add(Box.createRigidArea(new Dimension(0, 10)));;
        }

        // Initialize calendar button
        ImageIcon calendarIcon = resizeIcon(
                new ImageIcon("desktop_application/src/main/resources/icons/calendar-sync.png"),
                25, 25);
        JButton calendarButton = new JButton(calendarIcon);

        // Add calendar button
        add(Box.createVerticalGlue());
        //calendarButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
        add(calendarButton);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    public static ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage().getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }
}
