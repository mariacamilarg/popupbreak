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


public class TabHome extends JComponent {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------


    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public TabHome() {

        // Initialize attributes


        // Set layout
        setLayout(new BorderLayout());

        JPanel panel_right = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //panel_right.setMaximumSize( new Dimension(  10, 10) );

        JLabel welcome1 = new JLabel();
        JLabel welcome2 = new JLabel();

        welcome1.setText("<html>Hi Lucy!<br/> Welcome to a beautiful new day :)<br/> <br/>" +
                "You can see our planned agenda for today in the right pane</html>");

        welcome2.setText("<html>You still have some time until you 9am meeting, let's start<br/> " +
                "the day with some breathing excercises!<html>");



        AbstractBorder brdrLeft = new TextBubbleBorder(Color.BLACK,2,16,16);
        welcome1.setBorder(brdrLeft);
        welcome2.setBorder(brdrLeft);


        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.ipady = 60;
        c.insets = new Insets(10,5,50,5);
        panel_right.add(welcome1, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        c.ipady = 50;
        c.insets = new Insets(30,5,50,5);
        panel_right.add(welcome2, c);



        JButton button_yes = new JButton("Sure!");
        JButton button_no = new JButton("Maybe later...");


        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(50,10,10,10);
        panel_right.add(button_yes, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        c.insets = new Insets(50,10,10,10);
        panel_right.add(button_no, c);


        add(panel_right, BorderLayout.EAST);







    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

}
