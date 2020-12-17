package com.designproject.view;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import static com.designproject.utils.ImageUtils.resizeIcon;

public class TabHabitTracking extends JPanel implements ActionListener {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    InterfacePopUpBreak interfacePopUpBreak;
    JPanel panelTop;
    JPanel panelRight;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------
    public TabHabitTracking(InterfacePopUpBreak interfacePopUpBreak) {

        // Initialize attributes
        this.interfacePopUpBreak = interfacePopUpBreak;
        panelTop = new JPanel(new GridBagLayout());
        panelRight = new JPanel(new GridBagLayout());

        // Set layout
        setLayout(new BorderLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Set style
        setBackground(Color.WHITE);

        // Panel top: buttons on the top for today, week and month
        panelTop.setBackground(Color.WHITE);

        JButton button_today = new JButton("TODAY'S SUMMARY");
        button_today.setBackground(Color.WHITE);
        JButton button_week = new JButton("WEEKLY");
        JButton button_month = new JButton("MONTHLY");

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.ipady = 10;
        c.insets = new Insets(10,0,10,0);
        panelTop.add(button_today, c);
        c.gridx = 1;
        c.gridy = 0;
        panelTop.add(button_week, c);
        c.gridx = 2;
        c.gridy = 0;
        panelTop.add(button_month, c);

        add(panelTop, BorderLayout.NORTH);

        // Pic left: image adding on the left
        JLabel picLabel = new JLabel(resizeIcon(
                new ImageIcon(getClass().getResource("/images/day.png")), 482, 541));
        picLabel.setForeground(Color.white);
        picLabel.setBackground(Color.white);
        picLabel.setOpaque(true);
        add(picLabel, BorderLayout.CENTER);

        // Panel right: description on the right
        panelRight.setBackground(Color.WHITE);

        JLabel congrats1 = new JLabel();
        congrats1.setText("<html>You are doing great progress! Keep it up!<br/> " +
                "The ways you could improve from here could be:<br/> <br/> " +
                "<ul><li>Implement a new and different habit </li><br/>  " +
                "<li>Increase your number of eye breaks</li><br/> " +
                "<li>Remove water reminders, you got them covered!</li><br/></ul>"+
                "You may also click on Settings to do the changes yourself <br/> <br/></html>");
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.insets = new Insets(5,5,5,5);

        AbstractBorder brdrLeft = new TextBubbleBorder(Color.BLACK,2,16,16);
        congrats1.setBorder(brdrLeft);
        panelRight.add(congrats1,c);

        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.VERTICAL;
        c.gridwidth = 1;
        c.gridheight = 4;
        c.ipady = 10;
        c.insets = new Insets(5,5,5,5);
        URL url = getClass().getResource("/animations/happy-with-hands.gif");
        panelRight.add(new JLabel(new ImageIcon(url)), c);

        JButton buttonImplement = new JButton("Implement new habit");
        buttonImplement.addActionListener(this);
        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.NONE;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.ipady = 10;
        c.insets = new Insets(15,5,5,5);
        panelRight.add(buttonImplement, c);

        JButton buttonEye = new JButton("Increase eye breaks");
        buttonEye.addActionListener(this);
        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.NONE;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.ipady = 10;
        c.insets = new Insets(5,5,5,5);
        panelRight.add(buttonEye, c);

        JButton buttonWater = new JButton("Remove water reminders");
        buttonWater.addActionListener(this);
        c.gridx = 1;
        c.gridy = 3;
        c.fill = GridBagConstraints.NONE;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.ipady = 10;
        c.insets = new Insets(5,5,5,5);
        panelRight.add(buttonWater, c);

        JButton buttonSettings = new JButton("Go to settings");
        buttonSettings.addActionListener(this);
        c.gridx = 1;
        c.gridy = 4;
        c.fill = GridBagConstraints.NONE;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(5,5,5,5);
        panelRight.add(buttonSettings, c);

        add(panelRight, BorderLayout.EAST);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        interfacePopUpBreak.switchToSettings();
    }
}
