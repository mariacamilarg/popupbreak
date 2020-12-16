package com.designproject.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;

import static com.designproject.utils.ImageUtils.resizeIcon;

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

        // Set style
        setBackground(Color.WHITE);
        this.setBorder(new EmptyBorder(5, 10, 10, 10));

        // Set title
        JLabel jLabel = new JLabel("AGENDA", JLabel.CENTER);
        jLabel.setBackground(Color.WHITE);
        add(jLabel);
        add(Box.createRigidArea(new Dimension(0, 10)));

        // Initialize day commitments
        ArrayList<JCheckBox> dayCommitments = new ArrayList<>();

        JCheckBox jCheckBox1 = new JCheckBox("<html>9.00 - 10.00 <br> Team meeting</html>", true);
        jCheckBox1.setBackground(Color.WHITE);
        dayCommitments.add(jCheckBox1);
        JCheckBox jCheckBox2 = new JCheckBox("<html>10.30 - 10.35 <br> Drink water</html>", true);
        jCheckBox2.setBackground(Color.WHITE);
        dayCommitments.add(jCheckBox2);
        JCheckBox jCheckBox3 = new JCheckBox("<html>10.30 - 10.35 <br> Drink water</html>", true);
        jCheckBox3.setBackground(Color.WHITE);
        dayCommitments.add(jCheckBox3);
        JCheckBox jCheckBox4 = new JCheckBox("<html>12.00 - 13.00 <br> Lunch</html>", true);
        jCheckBox4.setBackground(Color.WHITE);
        dayCommitments.add(jCheckBox4);
        JCheckBox jCheckBox5 = new JCheckBox("<html>14.00 - 16.00 <br> Assignments</html>", true);
        jCheckBox5.setBackground(Color.WHITE);
        dayCommitments.add(jCheckBox5);
        JCheckBox jCheckBox6 = new JCheckBox("<html>16.00 - 16.30 <br> Healthy snack <br> Move exercise</html>", true);
        jCheckBox6.setBackground(Color.WHITE);
        dayCommitments.add(jCheckBox6);
        JCheckBox jCheckBox7 = new JCheckBox("<html>17.30 - 17.35 <br> Eye break</html>", true);
        jCheckBox7.setBackground(Color.WHITE);
        dayCommitments.add(jCheckBox7);

        // Add day commitments to panel
        for (int i = 0; i < dayCommitments.size(); i++) {
            dayCommitments.get(i).setVerticalTextPosition(SwingConstants.NORTH);
            add(dayCommitments.get(i));
            add(Box.createRigidArea(new Dimension(0, 10)));
        }

        // Initialize calendar button
        ImageIcon calendarIcon = resizeIcon(
                new ImageIcon(getClass().getResource("/icons/calendar-sync.png")),
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

}
