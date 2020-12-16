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
    AbstractBorder bubbleBorder;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public TabTimeToBreak() {

        // Initialize attributes
        panelLeft = new JPanel(new BorderLayout());
        panelRight = new JPanel(new GridBagLayout());
        bubbleBorder = new TextBubbleBorder(Color.BLACK,2,16,16);

        // Set style
        setBackground(Color.WHITE);

        // Set layout
        setLayout(new BorderLayout());

        // Left panel
        panelLeft.setBackground(Color.WHITE);
        URL url = getClass().getResource("/animations/good-job.gif");
        panelLeft.add(new JLabel(new ImageIcon(url)), BorderLayout.CENTER);
        add(panelLeft, BorderLayout.CENTER);

        // Right panel
        panelRight.setBackground(Color.WHITE);
        GridBagConstraints c = new GridBagConstraints();

        // msg1
        JLabel waterBreakLabel = new JLabel(
                "<html>Could you please let me know approximately how much water will you take? </html>");
        waterBreakLabel.setBorder(bubbleBorder);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.ipady = 20;
        c.insets = new Insets(20,20,20,20);
        panelRight.add(waterBreakLabel, c);

        // img and buttons
        JLabel glassLabel = new JLabel(resizeIcon(
                new ImageIcon(getClass().getResource("/images/glass.png")), 80, 100));
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 3;
        c.ipady = 10;
        c.insets = new Insets(10,10,10,10);
        panelRight.add(glassLabel, c);

//        JButton buttonGlass = new JButton("+1 glass");
//        c.gridx = 1;
//        c.gridy = 1;
//        c.gridwidth = 1;
//        c.gridheight = 1;
//        c.ipady = 10;
//        c.insets = new Insets(10,10,10,10);
//        panelRight.add(buttonGlass, c);
//
//        JButton buttonBottle = new JButton("+1 water bottle");
//        c.gridx = 2;
//        c.gridy = 1;
//        c.gridwidth = 1;
//        c.gridheight = 1;
//        c.ipady = 10;
//        c.insets = new Insets(10,10,10,10);
//        panelRight.add(buttonBottle, c);
//
//        JButton buttonLiter = new JButton("+1 liter!");
//        c.gridx = 3;
//        c.gridy = 1;
//        c.gridwidth = 1;
//        c.gridheight = 1;
//        c.ipady = 10;
//        c.insets = new Insets(10,10,10,10);
//        panelRight.add(buttonLiter, c);
//
//        // msg 2
//        JLabel waterBreakLabel2 = new JLabel(
//                "<html>In the meantime would you like to learn more <br>" +
//                        "about good practices for sedentary workers?<html>");
//        waterBreakLabel2.setBorder(bubbleBorder);
//        c.fill = GridBagConstraints.HORIZONTAL;
//        c.gridx = 0;
//        c.gridy = 4;
//        c.gridwidth = 2;
//        c.ipady = 20;
//        c.insets = new Insets(20,20,40,20);
//        panelRight.add(waterBreakLabel2, c);

        // bottom panel buttons
//        JButton button_yes = new JButton("Sure!");
//        JButton button_no = new JButton("Maybe later...");
//
//        c.fill = GridBagConstraints.VERTICAL;
//        c.weightx = 0.5;
//        c.gridx = 0;
//        c.gridy = 2;
//        c.gridwidth = 1;
//        c.ipady = 10;
//        c.insets = new Insets(50,10,10,10);
//        panelRight.add(button_yes, c);
//
//        c.fill = GridBagConstraints.VERTICAL;
//        c.weightx = 0.5;
//        c.gridx = 1;
//        c.gridy = 2;
//        c.ipady = 10;
//        c.insets = new Insets(50,10,10,10);
//        panelRight.add(button_no, c);

        add(panelRight, BorderLayout.EAST);
    }
}
