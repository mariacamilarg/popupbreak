package com.designproject.view;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;


public class TabHome extends JPanel implements ActionListener {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    InterfacePopUpBreak interfacePopUpBreak;
    JLabel virtualCoach;
    JPanel panelRight;
    JPanel panelLeft;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public TabHome(InterfacePopUpBreak interfacePopUpBreak) {

        // Initialize attributes
        this.interfacePopUpBreak = interfacePopUpBreak;

        // Set style
        setBackground(Color.WHITE);

        // Set layout
        setLayout(new BorderLayout());

        // Left panel
        panelLeft = new JPanel(new BorderLayout());
        panelLeft.setBackground(Color.WHITE);
        virtualCoach = new JLabel(new ImageIcon(getClass().getResource("/animations/hello.gif")));
        panelLeft.add(virtualCoach, BorderLayout.CENTER);
        add(panelLeft, BorderLayout.CENTER);

        // Right panel
        panelRight = new JPanel(new GridBagLayout());
        panelRight.setBackground(Color.WHITE);

        JLabel welcome1 = new JLabel(
                "<html>Hi Lucy!<br/><br/> Welcome to a beautiful new day :)<br/> <br/>" +
                "You can see our planned agenda for today in the right pane => </html>");
        JLabel welcome2 = new JLabel(
                "<html>You still have some time until you 9am meeting, let's start the day <br/> " +
                "with some breathing exercises!<html>");

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
        panelRight.add(welcome1, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        c.ipady = 20;
        c.insets = new Insets(20,20,40,20);
        panelRight.add(welcome2, c);

        JButton button_yes = new JButton("Sure!");
        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(50,10,10,10);
        panelRight.add(button_yes, c);

        JButton button_no = new JButton("Maybe later...");
        button_no.addActionListener(this);
        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        c.ipady = 10;
        c.insets = new Insets(50,10,10,10);
        panelRight.add(button_no, c);

        add(panelRight, BorderLayout.EAST);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    public void showEndOfDaySummary() {
        virtualCoach.setIcon(new ImageIcon(getClass().getResource("/animations/happy.gif")));
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        interfacePopUpBreak.minimize();
    }
}
