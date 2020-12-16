package com.designproject.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabSettings extends JPanel {

    //private final Object SwitchButton;
    boolean toggleWaterBreak;
    boolean toggleExercise;
    boolean toggleEyeExercise;
    boolean toggleSnack;
    boolean toggleBreath;

    int hourFrWaterBreak = 00;
    int minFrWaterBreak = 30;
    int secFrWaterBreak = 03;

    int amountWaterBreak = 500;

    int hourFrExercise = 02;
    int minFrExercise = 30;
    int secFrExercise = 00;

    int amountExercise = 45;

    int hourFrEye = 01;
    int minFrEye = 00;
    int secFrEye = 15;

    int amountEye = 3;

    int hourFrSnack = 00;
    int minFrSnack = 45;
    int secFrSnack = 00;

    int amountSnack = 45;

    int hourFrB = 00;
    int minFrB = 35;
    int secFrB = 20;

    int amountB = 60;
    //psnel.add(label, BorderLayout.CENTER);

    JPanel settingsControls = new JPanel();

    public TabSettings(){

//        JButton button = new JButton("here");
////
        JPanel psnel = new JPanel();
        JLabel label = new JLabel("custimization of reminders ");

        setLayout(new BorderLayout());



        add(label,BorderLayout.NORTH);

        JPanel settings = new JPanel();
        JButton Deault1 = new JButton("  Lazy Day   ");


        JButton Deault2 = new JButton("  Busy Day  ");

        JButton Deault3 = new JButton("  Normal Day  ");

        settings.setLayout(new BoxLayout(settings,BoxLayout.Y_AXIS));
        settings.add(Deault1);
        settings.add(Deault2);
        settings.add(Deault3);
        add(settings, BorderLayout.EAST);



        add(settingsControls,BorderLayout.CENTER);


        settingsControls.setLayout(new BoxLayout(settingsControls,BoxLayout.Y_AXIS));

        JPanel Titles = new JPanel();

        Titles.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        JLabel ONOFF = new JLabel("  ON/OFF  ");
        c.gridwidth = 1;
        c.gridx = 0; c.gridy= 0 ;
        Titles.add(ONOFF,c);

        JLabel reminder = new JLabel("  Reminder  ");
        c.gridwidth = 1;
        c.gridx = 1; c.gridy= 0 ;
        Titles.add(reminder,c);

        JLabel Frequency = new JLabel("  Frequency  ");
        c.gridwidth = 5;
        c.gridx = 2; c.gridy= 0 ;
        Titles.add(Frequency,c);

        JLabel AmountDuration = new JLabel("  Amount/Duration  ");
        c.gridwidth = 2;
        c.gridx = 7; c.gridy= 0;


        Titles.add(AmountDuration,c);
//
        settingsControls.add(Titles);

//
        JPanel panWater = new JPanel();
        panWater.setLayout(new GridLayout(0,9));
        //panWater.setSize(50,10);


        JButton switchWater = new JButton("  O  ");
        switchWater.setBackground(Color.GREEN);
        c.gridwidth = 1;
        c.gridx = 0; c.gridy= 1 ;
        Titles.add(switchWater,c);

        switchWater.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().contentEquals("  O  ")) {
                    switchWater.setBackground(Color.RED);
                    switchWater.setText("  X  ");
                    toggleWaterBreak = false;
                }
                else {
                    switchWater.setBackground(Color.GREEN);
                    switchWater.setText("  O  ");
                    toggleWaterBreak = true ;
                }
            }
        });
        JLabel waterLab = new JLabel("  Water Reminder  ");
        c.gridwidth = 1;
        c.gridx = 1; c.gridy= 1 ;
        Titles.add(waterLab,c);

        JTextField waterHour = new JTextField("  " + hourFrWaterBreak + "  ");
        c.gridwidth = 1;
        c.gridx = 2; c.gridy= 1 ;
        Titles.add(waterHour,c);

        JLabel wb1 = new JLabel("  :  ");
        c.gridwidth = 1;
        c.gridx = 3; c.gridy= 1 ;
        Titles.add(wb1,c);

        JTextField watermin = new JTextField("  "+minFrWaterBreak + "  ");
        c.gridwidth = 1;
        c.gridx = 4; c.gridy= 1 ;
        Titles.add(watermin,c);

        JLabel wb2 = new JLabel("  :  ");
        c.gridwidth = 1;
        c.gridx = 5; c.gridy= 1 ;
        Titles.add(wb2,c);

        JTextField watersec = new JTextField("  "+secFrWaterBreak + "  ");

        c.gridwidth = 1;
        c.gridx = 6; c.gridy= 1 ;
        Titles.add(watersec,c);

        JTextField waterAmount = new JTextField("  " + amountWaterBreak + "  ");
        c.gridwidth = 1;
        c.gridx = 7; c.gridy= 1 ;
        Titles.add(waterAmount,c);
        JLabel waterAmountLab = new JLabel("  mL  ");

        c.gridwidth = 1;
        c.gridx = 8; c.gridy= 1 ;
        Titles.add(waterAmountLab,c);







        // end of water tab

        JPanel panExercise = new JPanel();
        panExercise.setLayout(new GridLayout());

        JButton switchExercise = new JButton("  X  ");
        switchExercise.setBackground(Color.RED);
        c.gridwidth = 1;
        c.gridx = 0; c.gridy= 2 ;
        Titles.add(switchExercise,c);
        switchExercise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().contentEquals("  O  ")) {
                    switchExercise.setBackground(Color.RED);
                    switchExercise.setText("  X  ");
                    toggleExercise = false;
                }
                else {
                    switchExercise.setBackground(Color.GREEN);
                    switchExercise.setText("  O  ");
                    toggleExercise = true;
                }
            }
        });
        JLabel exerciseLab = new JLabel("  Exercise Reminder  ");
        c.gridwidth = 1;
        c.gridx = 1; c.gridy= 2 ;
        Titles.add(exerciseLab,c);
        JTextField exerciseHour = new JTextField("  " + hourFrExercise +"  ");
        c.gridwidth = 1;
        c.gridx = 2; c.gridy= 2 ;
        Titles.add(exerciseHour,c);
        JLabel eb1 = new JLabel("  :  ");
        c.gridwidth = 1;
        c.gridx = 3; c.gridy= 2 ;
        Titles.add(eb1,c);
        JTextField exercisemin = new JTextField("  " + minFrExercise+ "  ");
        c.gridwidth = 1;
        c.gridx = 4; c.gridy= 2 ;
        Titles.add(exercisemin,c);
        JLabel eb2 = new JLabel("  :  ");
        c.gridwidth = 1;
        c.gridx = 5; c.gridy= 2 ;
        Titles.add(eb2,c);
        JTextField exercisesec = new JTextField("  " + secFrExercise + "  ");
        c.gridwidth = 1;
        c.gridx = 6; c.gridy= 2 ;
        Titles.add(exercisesec,c);
        JTextField exerciseAmount = new JTextField("  " + amountExercise+ "  ");
        c.gridwidth = 1;
        c.gridx = 7; c.gridy= 2 ;
        Titles.add(exerciseAmount,c);
        JLabel exerciseAmountLab = new JLabel("  min  ");
        c.gridwidth = 1;
        c.gridx = 8; c.gridy= 2 ;
        Titles.add(exerciseAmountLab,c);






        // end of exercise

        //begin eye exercise

        JPanel panEye = new JPanel();
        panEye.setLayout(new GridLayout());

        JButton switchEye = new JButton("  O  ");
        switchEye.setBackground(Color.GREEN);
        c.gridwidth = 1;
        c.gridx = 0; c.gridy= 3 ;
        Titles.add(switchEye,c);
        switchEye.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().contentEquals("  O  ")) {
                    switchEye.setBackground(Color.RED);
                    switchEye.setText("  X  ");
                    toggleEyeExercise = false;
                }
                else {
                    switchEye.setBackground(Color.GREEN);
                    switchEye.setText("  O  ");
                    toggleEyeExercise = true;
                }
            }
        });
        JLabel eyeLab = new JLabel("  Eye Break Reminder  ");
        c.gridwidth = 1;
        c.gridx = 1; c.gridy= 3 ;
        Titles.add(eyeLab,c);

        JTextField eyeHour = new JTextField(" " + hourFrEye + " ");
        c.gridwidth = 1;
        c.gridx = 2; c.gridy= 3 ;
        Titles.add(eyeHour,c);

        JLabel elb = new JLabel("  :  ");
        c.gridwidth = 1;
        c.gridx = 3; c.gridy= 3 ;
        Titles.add(elb,c);

        JTextField eyemin = new JTextField(" " + minFrEye + "  ");
        c.gridwidth = 1;
        c.gridx = 4; c.gridy= 3 ;
        Titles.add(eyemin,c);

        JLabel elb2 = new JLabel("  :  ");
        c.gridwidth = 1;
        c.gridx = 5; c.gridy= 3 ;
        Titles.add(elb2,c);

        JTextField eyesec = new JTextField(" " + secFrEye + " ");
        c.gridwidth = 1;
        c.gridx = 6; c.gridy= 3 ;
        Titles.add(eyesec,c);

        JTextField eyeAmount = new JTextField(" " + amountEye + "  ");
        c.gridwidth = 1;
        c.gridx = 7; c.gridy= 3 ;
        Titles.add(eyeAmount,c);

        JLabel eyeAmountLab = new JLabel("  min  ");
        c.gridwidth = 1;
        c.gridx = 8; c.gridy= 3 ;
        Titles.add(eyeAmountLab,c);





        //settingsControls.add(Box.createRigidArea(new Dimension(20,0)));
//        settingsControls.add(panEye);

        // end of eye

        //begin snack

        JPanel panSnack = new JPanel();
        panSnack.setLayout(new GridLayout());

        JButton switchSnack = new JButton("  O  ");
        switchSnack.setBackground(Color.GREEN);
        c.gridwidth = 1;
        c.gridx = 0; c.gridy= 4 ;
        Titles.add(switchSnack,c);
        switchSnack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().contentEquals("  O  ")) {
                    switchSnack.setBackground(Color.RED);
                    switchSnack.setText("  X  ");
                    toggleSnack = false;
                }
                else {
                    switchSnack.setBackground(Color.GREEN);
                    switchSnack.setText("  O  ");
                    toggleSnack = true;
                }
            }
        });
        JLabel snackLab = new JLabel("Snack Break Reminder");
        c.gridwidth = 1;
        c.gridx = 1; c.gridy= 4 ;
        Titles.add(snackLab,c);

        JTextField snackHour = new JTextField(" " + hourFrSnack + " ");
        c.gridwidth = 1;
        c.gridx = 2; c.gridy= 4 ;
        Titles.add(snackHour,c);

        JLabel b1S = new JLabel("  :  ");
        c.gridwidth = 1;
        c.gridx = 3; c.gridy= 4 ;
        Titles.add(b1S,c);

        JTextField snackmin = new JTextField(" " + minFrSnack +" ");
        c.gridwidth = 1;
        c.gridx = 4; c.gridy= 4 ;
        Titles.add(snackmin,c);

        JLabel b2S = new JLabel("  :  ");
        c.gridwidth = 1;
        c.gridx = 5; c.gridy= 4 ;
        Titles.add(b2S,c);

        JTextField snacksec = new JTextField(" " + secFrSnack +" ");
        c.gridwidth = 1;
        c.gridx = 6; c.gridy= 4 ;
        Titles.add(snacksec,c);

        JTextField snackAmount = new JTextField(" "+ amountSnack+" ");
        c.gridwidth = 1;
        c.gridx = 7; c.gridy= 4 ;
        Titles.add(snackAmount,c);

        JLabel snackAmountLab = new JLabel(" snacks ");
        c.gridwidth = 1;
        c.gridx = 8; c.gridy= 4 ;
        Titles.add(snackAmountLab,c);





        settingsControls.add(panSnack);

        // end snack

        // begin breathing


        JPanel panBreath = new JPanel();
        panBreath.setLayout(new GridLayout());

        JButton switchBreath = new JButton("  X  ");
        switchBreath.setBackground(Color.RED);
        c.gridwidth = 1;
        c.gridx = 0; c.gridy= 5 ;
        Titles.add(switchBreath,c);

        switchBreath.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().contentEquals("  O  ")) {
                    switchBreath.setBackground(Color.RED);
                    switchBreath.setText("  X  ");
                    toggleBreath = false;
                }
                else {
                    switchBreath.setBackground(Color.GREEN);
                    switchBreath.setText("  O  ");
                    toggleBreath = true;
                }
            }
        });
        JLabel breathLab = new JLabel(" Breath Break Reminder ");

        c.gridwidth = 1;
        c.gridx = 1; c.gridy= 5 ;
        Titles.add(breathLab,c);

        JTextField breathHour = new JTextField(" " + hourFrB + " ");

        c.gridwidth = 1;
        c.gridx = 2; c.gridy= 5 ;
        Titles.add(breathHour,c);

        JLabel br1S = new JLabel("  :  ");

        c.gridwidth = 1;
        c.gridx = 3; c.gridy= 5 ;
        Titles.add(br1S,c);

        JTextField breathmin = new JTextField(" " + minFrB + " ");

        c.gridwidth = 1;
        c.gridx = 4; c.gridy= 5 ;
        Titles.add(breathmin,c);

        JLabel br2S = new JLabel("  :  ");

        c.gridwidth = 1;
        c.gridx = 5; c.gridy= 5 ;
        Titles.add(br2S,c);

        JTextField breathsec = new JTextField(" " + secFrB +" ");

        c.gridwidth = 1;
        c.gridx = 6; c.gridy= 5 ;
        Titles.add(breathsec,c);

        JTextField breathAmount = new JTextField(" " + amountB + " ");

        c.gridwidth = 1;
        c.gridx = 7; c.gridy= 5 ;
        Titles.add(breathAmount,c);

        JLabel breathAmountLab = new JLabel(" min ");

        c.gridwidth = 1;
        c.gridx = 8; c.gridy= 5 ;
        Titles.add(breathAmountLab,c);





        settingsControls.add(panBreath);

        // end of breath

        // begin buttons

        JPanel buttonControls = new JPanel();
        buttonControls.setLayout(new GridLayout());
        JButton customReminderAdd = new JButton("+");
        customReminderAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame form = new JFrame();
                form.setSize(200,200);
//                form.setPreferredSize(new Dimension(200,200));
                form.setTitle("Reminder Creation in progress");

                JPanel panny  = new JPanel();


                panny.setLayout(new BoxLayout(panny, BoxLayout.Y_AXIS));


                JLabel nameReminder = new JLabel("  Reminder's name  " );
                JTextField reminder = new JTextField(50);
                JLabel amountReminder = new JLabel("  Amount  " );
                JTextField amountreminder = new JTextField(10);
                JButton createButton = new JButton("  Create Reminder  ");
                createButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        newReminderCustom((String) reminder.getText(), amountreminder.getText());
                        form.setVisible(false);
                    }
                });

                panny.add(nameReminder);
                panny.add(reminder);
                panny.add(amountReminder);
                panny.add(amountreminder);
                panny.add(createButton);

                form.add(panny);

                form.pack();
                form.setVisible(true);

            }
        });

        c.gridwidth = 1;
        c.gridx = 0; c.gridy= 7;
        Titles.add(customReminderAdd,c);


        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TabHome();
                repaint();
            }
        });

        c.gridwidth = 4;
        c.gridx = 2; c.gridy= 7 ;
        Titles.add(cancelButton,c);

        JButton saveButton = new JButton("Save");

        c.gridwidth = 2;
        c.gridx = 6; c.gridy= 7 ;
        Titles.add(saveButton,c);


        settingsControls.add(buttonControls, BOTTOM_ALIGNMENT);

        Deault1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                breathAmount.setText("  30  ");
                breathAmount.repaint();

                eyeAmount.setText("  05  ");
                eyeAmount.repaint();

                breathmin.setText("  15  ");
                breathmin.repaint();

                eyemin.setText("  10  ");
                eyemin.repaint();

                snackmin.setText("  33  ");
                snackmin.repaint();

                snackHour.setText( "  01  ");
                snackHour.repaint();

                exercisemin.setText("  45  ");
                exercisemin.repaint();
                repaint();
            }
        });

        Deault2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                breathAmount.setText("  20  ");
                breathAmount.repaint();

                eyeAmount.setText("  03  ");
                eyeAmount.repaint();

                breathmin.setText("  05  ");
                breathmin.repaint();

                eyemin.setText("  40  ");
                eyemin.repaint();

                snackmin.setText("  53  ");
                snackmin.repaint();

                snackHour.setText( "  00  ");
                snackHour.repaint();

                exercisemin.setText("  55  ");
                exercisemin.repaint();

                exerciseHour.setText("  02  ");
                exerciseHour.repaint();

                repaint();
            }
        });

        Deault3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                breathAmount.setText("  59  ");
                breathAmount.repaint();

                eyeAmount.setText("  01  ");
                eyeAmount.repaint();

                breathmin.setText("  59  ");
                breathmin.repaint();

                eyemin.setText("  20  ");
                eyemin.repaint();

                snackmin.setText("  45  ");
                snackmin.repaint();

                snackHour.setText( "  40  ");
                snackHour.repaint();

                exercisemin.setText("  03  ");
                exercisemin.repaint();

                exercisemin.setText("  55  ");
                exercisemin.repaint();

                repaint();
            }
        });
        repaint();
        //System.out.println("Settings Panel here");
    }

    boolean toggle = false ;

    public void newReminderCustom(String text, String amountReminder){


        JPanel pan = new JPanel();
        pan.setLayout(new FlowLayout());

        JButton switchButton = new JButton("  O  ");
        switchButton.setBackground(Color.GREEN);
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getActionCommand().contentEquals("  O  ")) {
                    switchButton.setBackground(Color.RED);
                    switchButton.setText("  X  ");
                    toggle = false;
                }
                else {
                    switchButton.setBackground(Color.GREEN);
                    switchButton.setText("  O  ");
                    toggle = true;
                }
            }
        });
        JLabel Lab = new JLabel("  " + text + "  ");
        JTextField Hour = new JTextField(" " + hourFrEye + " ");
        JLabel lb = new JLabel("  :  ");
        JTextField min = new JTextField(" " + minFrEye + "  ");
        JLabel lb2 = new JLabel("  :  ");
        JTextField sec = new JTextField(" " + secFrEye + " ");
        JTextField Amount = new JTextField(" " + amountEye + "  ");
        JLabel AmountLab = new JLabel("  "+ amountReminder+"  ");

        pan.add(switchButton);
        pan.add(Lab);
        pan.add(Hour);
        pan.add(lb);
        pan.add(min);
        pan.add(lb2);
        pan.add(sec);
        pan.add(Amount);
        pan.add(AmountLab);

        pan.repaint();




        settingsControls.add(pan);
        settingsControls.repaint();

        repaint();
    }

}
