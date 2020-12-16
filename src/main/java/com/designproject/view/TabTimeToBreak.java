package com.designproject.view;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.net.URL;

import static com.designproject.utils.ImageUtils.resizeIcon;

public class TabTimeToBreak extends JComponent {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    JPanel panelRight;
    JPanel panelLeft;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public TabTimeToBreak() {

        // Initialize attributes

        // Set style
        setBackground(Color.WHITE);

        // Set layout
        setLayout(new BorderLayout());

        // Left panel
        panelLeft = new JPanel(new BorderLayout());
        panelLeft.setBackground(Color.WHITE);
        URL url = getClass().getResource("/animations/hello.gif");
        panelLeft.add(new JLabel(new ImageIcon(url)), BorderLayout.CENTER);
        add(panelLeft, BorderLayout.CENTER);

        // Right panel
        panelRight = new JPanel(new GridBagLayout());
        panelRight.setBackground(Color.WHITE);

        JLabel waterBreakLabel = new JLabel(
                "<html>Could you please let me know approximately how much <br> water will you take? </html>");
        JLabel waterBreakLabel2 = new JLabel(
                "<html>In the meantime would you like to learn more \n" +
                        "about good practices for sedentary workers?<html>");

        AbstractBorder bubbleBorder = new TextBubbleBorder(Color.BLACK,2,16,16);
        waterBreakLabel.setBorder(bubbleBorder);
        waterBreakLabel2.setBorder(bubbleBorder);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.ipady = 20;
        c.insets = new Insets(20,20,40,20);
        panelRight.add(waterBreakLabel, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        c.ipady = 20;
        c.insets = new Insets(20,20,40,20);
        panelRight.add(waterBreakLabel2, c);

        // panel glass
        JPanel panelGlass = new JPanel(new BorderLayout());
        JLabel glassLabel = new JLabel(resizeIcon(
                new ImageIcon(getClass().getResource("/images/glass.png")), 80, 100));

        JPanel panelButtons = new JPanel(new GridLayout(3, 1));
        JButton button_glass = new JButton("+1 glass");
        JButton button_bottle = new JButton("+1 water bottle");
        JButton button_liter = new JButton("+1 liter!");
        panelButtons.add(button_glass);
        panelButtons.add(button_bottle);
        panelButtons.add(button_liter);

        panelGlass.add(glassLabel, BorderLayout.WEST);
        panelGlass.add(panelButtons, BorderLayout.EAST);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        c.ipady = 20;
        c.insets = new Insets(10,20,40,20);

        panelRight.add(panelGlass, c);

        // bottom panel buttons
        JButton button_yes = new JButton("Sure!");
        JButton button_no = new JButton("Maybe later...");

        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(50,10,10,10);
        panelRight.add(button_yes, c);

        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        c.ipady = 10;
        c.insets = new Insets(50,10,10,10);
        panelRight.add(button_no, c);

        add(panelRight, BorderLayout.EAST);
    }
}
