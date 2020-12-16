package com.designproject.view;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;


public class TabHome extends JPanel {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    JPanel panel_right;
    JPanel panel_left;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public TabHome() {

        // Initialize attributes

        // Set style
        setBackground(Color.WHITE);

        // Set layout
        setLayout(new BorderLayout());

        // Left panel
        panel_left = new JPanel(new BorderLayout());
        panel_left.setBackground(Color.WHITE);
        URL url = getClass().getResource("/animations/hello.gif");
        panel_left.add(new JLabel(new ImageIcon(url)), BorderLayout.CENTER);
        add(panel_left, BorderLayout.CENTER);

        // Right panel
        panel_right = new JPanel(new GridBagLayout());
        panel_right.setBackground(Color.WHITE);

        JLabel welcome1 = new JLabel(
                "<html>Hi Lucy!<br/> Welcome to a beautiful new day :)<br/> <br/>" +
                "You can see our planned agenda for today in the right pane</html>");
        JLabel welcome2 = new JLabel(
                "<html>You still have some time until you 9am meeting, let's start<br/> " +
                "the day with some breathing exercises!<html>");

        AbstractBorder bubbleBorder = new TextBubbleBorder(Color.BLACK,2,16,16);
        welcome1.setBorder(bubbleBorder);
        welcome2.setBorder(bubbleBorder);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.ipady = 20;
        c.insets = new Insets(20,20,40,20);
        panel_right.add(welcome1, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        c.ipady = 20;
        c.insets = new Insets(20,20,40,20);
        panel_right.add(welcome2, c);

        JButton button_yes = new JButton("Sure!");
        JButton button_no = new JButton("Maybe later...");

        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(50,10,10,10);
        panel_right.add(button_yes, c);

        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        c.ipady = 10;
        c.insets = new Insets(50,10,10,10);
        panel_right.add(button_no, c);

        add(panel_right, BorderLayout.EAST);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

}
