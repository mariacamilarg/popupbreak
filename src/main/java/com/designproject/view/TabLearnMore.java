package com.designproject.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.net.URL;

public class TabLearnMore extends JPanel {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    JPanel panelRight;
    JPanel panelLeft;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------
    public TabLearnMore() {

        // Initialize attributes
        panelLeft = new JPanel(new BorderLayout());
        panelRight = new JPanel(new GridBagLayout());

        // Set style
        setBackground(Color.WHITE);
        panelLeft.setBackground(Color.WHITE);
        panelRight.setBackground(Color.WHITE);

        // Set layout
        setLayout(new BorderLayout());

        // Left panel
        URL url = getClass().getResource("/animations/thinking-pointing.gif");
        panelLeft.add(new JLabel(new ImageIcon(url)), BorderLayout.CENTER);
        add(panelLeft, BorderLayout.CENTER);

        // Right panel
        panelRight = new JPanel(new GridBagLayout());
        panelRight.setBackground(Color.WHITE);

        JLabel msg1 = new JLabel(
                "<html>Did you know you're already dehydrated when <br/>" +
                        "you start to feel thirsty?</html>");
        JLabel msg2 = new JLabel(
                "<html>Don't wait to take a drink. Instead, practice these simple tips <br/> " +
                        "to master a hydration habit that lasts for life:<html>");

        AbstractBorder bubbleBorder = new TextBubbleBorder(Color.BLACK,2,16,16);
        msg1.setBorder(bubbleBorder);
        msg2.setBorder(bubbleBorder);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.ipady = 20;
        c.insets = new Insets(20,20,40,20);
        panelRight.add(msg1, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        c.ipady = 20;
        c.insets = new Insets(20,20,40,20);
        panelRight.add(msg2, c);

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

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
}
