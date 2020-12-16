package com.designproject.view;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import static com.designproject.utils.ImageUtils.resizeIcon;

public class TabTimeToBreak extends JComponent implements ActionListener {

    // -----------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------
    private final static String ADD_WATER = "ADD_WATER";
    private final static String LEARN_MORE = "LEARN_MORE";

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    InterfacePopUpBreak interfacePopUpBreak;
    JPanel panelRight;
    JPanel panelLeft;
    AbstractBorder bubbleBorder;
    JLabel glassLabel;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public TabTimeToBreak(InterfacePopUpBreak interfacePopUpBreak) {

        // Initialize attributes
        this.interfacePopUpBreak = interfacePopUpBreak;
        panelLeft = new JPanel(new BorderLayout());
        panelRight = new JPanel(new GridBagLayout());
        bubbleBorder = new TextBubbleBorder(Color.BLACK,2,16,16);
        glassLabel = new JLabel(resizeIcon(
                new ImageIcon(getClass().getResource("/images/glass1.png")), 80, 100));

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
                "<html>Could you please let me know approximately how much water <br> will you take? </html>");
        waterBreakLabel.setBorder(bubbleBorder);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        c.ipady = 20;
        c.insets = new Insets(20,20,20,20);
        panelRight.add(waterBreakLabel, c);

        // img and buttons
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(10,40,10,20);
        panelRight.add(glassLabel, c);

        JButton buttonGlass = new JButton("+1 glass");
        buttonGlass.addActionListener(this);
        buttonGlass.setActionCommand(ADD_WATER);
        c.fill = GridBagConstraints.NONE;
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(10,10,10,25);
        panelRight.add(buttonGlass, c);

        JButton buttonBottle = new JButton("+1 bottle");
        buttonBottle.addActionListener(this);
        buttonBottle.setActionCommand(ADD_WATER);
        c.fill = GridBagConstraints.NONE;
        c.gridx = 2;
        c.gridy = 1;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(10,10,10,10);
        panelRight.add(buttonBottle, c);

        JButton buttonLiter = new JButton("+1 liter");
        buttonLiter.addActionListener(this);
        buttonLiter.setActionCommand(ADD_WATER);
        c.fill = GridBagConstraints.NONE;
        c.gridx = 3;
        c.gridy = 1;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(10,10,10,10);
        panelRight.add(buttonLiter, c);

        add(panelRight, BorderLayout.EAST);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();
        if (ADD_WATER.equals(command)) {
            incrementWater();
            showMoreMessages();
        } else if (LEARN_MORE.equals(command)) {
            interfacePopUpBreak.switchToLearnMore();
        }
    }

    private void incrementWater() {
        glassLabel.setIcon(resizeIcon(
                new ImageIcon(getClass().getResource("/images/glass2.png")), 80, 100));
        repaint();
    }

    private void showMoreMessages() {
        //The leftmost column has address gridx=0 and the top row has address gridy=0.

        GridBagConstraints c = new GridBagConstraints();

        // msg 2
        JLabel waterBreakLabel2 = new JLabel(
                "<html>In the meantime would you like to learn more about good <br>" +
                        "practices for sedentary workers?<html>");
        waterBreakLabel2.setBorder(bubbleBorder);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 4;
        c.ipady = 20;
        c.insets = new Insets(20,20,10,20);
        panelRight.add(waterBreakLabel2, c);

        // bottom panel buttons
        JButton buttonSure = new JButton("Sure!");
        JButton buttonLater = new JButton("Maybe later...");

        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        c.ipady = 10;
        c.insets = new Insets(10,10,10,10);
        panelRight.add(buttonSure, c);

        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 5;
        c.gridwidth = 2;
        c.ipady = 10;
        c.insets = new Insets(10,10,10,10);
        panelRight.add(buttonLater, c);
    }

}
