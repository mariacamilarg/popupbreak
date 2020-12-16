package com.designproject.view;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.io.IOException;

public class TabHabitTracking extends JComponent {

    public TabHabitTracking() throws IOException {
        setLayout(new BorderLayout());
        JPanel panel_top = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //Buttons on the top for today, week and month
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
        panel_top.add(button_today, c);
        c.gridx = 1;
        c.gridy = 0;
        panel_top.add(button_week, c);
        c.gridx = 2;
        c.gridy = 0;
        panel_top.add(button_month, c);

        add(panel_top, BorderLayout.NORTH);


        // image adding on the left
//        ImageIcon imageIcon = new ImageIcon(new ImageIcon
//                (getClass().getResource("/plots/day.png")).
//                getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH));
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/day.png"));
        JLabel picLabel = new JLabel();
        picLabel.setIcon(imageIcon);
        picLabel.setForeground(Color.white);
        picLabel.setBackground(Color.white);
        picLabel.setOpaque(true);
        add(picLabel, BorderLayout.CENTER);

        // description on the right
        JPanel panel_right = new JPanel(new GridBagLayout());

        JLabel congrats1 = new JLabel();
        congrats1.setText("<html>You are doing great progress! Keep it up!<br/> " +
                "The ways you could improve from here could be:<br/> <br/> " +
                "<ul><li>Implement new habit </li><br/> <br/>  " +
                "<li>Increase eye breaks</li> <br/>  <br/> " +
                "<li>Remove water reminders, got them covered!</li><br/></ul>"+
                "You may click the SETTING to do the changes <br/> <br/></html>");
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5,5,5,5);

        AbstractBorder brdrLeft = new TextBubbleBorder(Color.BLACK,2,16,16);
        congrats1.setBorder(brdrLeft);
        //welcome2.setBorder(brdrLeft);

        panel_right.add(congrats1,c);

        JButton button_setting = new JButton("SETTING");
        c.gridx = 0;
        c.gridy = 1;
        panel_right.add(button_setting,c);

        add(panel_right, BorderLayout.EAST);



    }

}
