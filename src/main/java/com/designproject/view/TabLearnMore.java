package com.designproject.view;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import static com.designproject.utils.ImageUtils.resizeIcon;

public class TabLearnMore extends JPanel implements ActionListener {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    JPanel panelRight;
    JPanel panelLeft;
    JButton buttonCool;
    JButton buttonMore;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------
    public TabLearnMore() {

        // Initialize attributes
        panelLeft = new JPanel(new BorderLayout());
        panelRight = new JPanel(new GridBagLayout());
        buttonCool = new JButton("Cool!");
        buttonMore = new JButton("Learn about other habits");

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
                "<html>Did you know you're already dehydrated when you start to feel thirsty?<br/>" +
                        "Don't wait to take a drink. Instead, practice these simple tips:</html>");
        JLabel pic = new JLabel(resizeIcon(
                new ImageIcon(getClass().getResource("/images/water.png")), 236, 240));
        JLabel tips = new JLabel(
                "<html><ul><li>Set up a daily goal </li><br/>  " +
                        "<li>Keep a reusable water bottle</li><br/> " +
                        "<li>Set up reminders</li><br/> " +
                        "<li>Replace other drinks with water</li><br/> " +
                        "<li>Drink a glass of water before meals</li><br/> " +
                        "<li>Get a water filter</li><br/> " +
                        "<li>Flavor your water</li><br/></ul></html>");
        JPanel msg2 = new JPanel(new BorderLayout());
        msg2.add(pic, BorderLayout.WEST);
        msg2.add(tips, BorderLayout.CENTER);

        AbstractBorder bubbleBorder = new TextBubbleBorder(Color.BLACK,2,16,16);
        msg1.setBorder(bubbleBorder);
        msg2.setBorder(bubbleBorder);

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.ipady = 20;
        c.insets = new Insets(20,20,20,20);
        panelRight.add(msg1, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 3;
        c.ipady = 20;
        c.insets = new Insets(20,20,20,20);
        panelRight.add(msg2, c);

        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 1;
        c.ipady = 10;
        c.insets = new Insets(50,10,10,10);
        panelRight.add(buttonCool, c);

        buttonMore.addActionListener(this);
        c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        c.ipady = 10;
        c.insets = new Insets(50,10,10,10);
        panelRight.add(buttonMore, c);

        add(panelRight, BorderLayout.EAST);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    public void learnMoreHabits() {
        this.removeAll();

        setLayout(new GridLayout(2,3));

        JLabel waterLabel = labelWithIconOnTop("Drinking Habits", new ImageIcon(getClass().getResource("/images/water.png")));
        JLabel sleepLavel = labelWithIconOnTop("Sleeping Habits", new ImageIcon(getClass().getResource("/images/sleeping.jpg")));
        JLabel breakLabel = labelWithIconOnTop("Perfect Breaks", new ImageIcon(getClass().getResource("/images/break.jpg")));
        JLabel eyeLabel = labelWithIconOnTop("Eyes Excercises", new ImageIcon(getClass().getResource("/images/eye.jpg")));
        JLabel eatLabel = labelWithIconOnTop("Eating Habits", new ImageIcon(getClass().getResource("/images/eating.jpg")));
        JLabel exerciseLabel = labelWithIconOnTop("Exercises", new ImageIcon(getClass().getResource("/images/exercise.jpg")));

        add(waterLabel);
        add(sleepLavel);
        add(breakLabel);
        add(eyeLabel);
        add(eatLabel);
        add(exerciseLabel);

        revalidate();
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        learnMoreHabits();
    }

    public JLabel labelWithIconOnTop(String text, ImageIcon icon) {
        ImageIcon imageIcon = resizeIcon(icon, 200, 150);
        JLabel label = new JLabel(imageIcon);
        label.setText(text);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        return label;
    }
}
