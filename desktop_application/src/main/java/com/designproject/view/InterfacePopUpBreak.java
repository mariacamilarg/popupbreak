package com.designproject.view;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class InterfacePopUpBreak extends JFrame {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    /**
     * Panel: all tabs panel
     */
    private PanelTabs panelTabs;

    /**
     * Panel: agenda on the right side
     */
    private PanelAgenda panelAgenda;

    /**
     * Dialog: to show the popup messages
     */
    private DialogPopUp dialogPopUp;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates the interface by adding its panels
     */
    public InterfacePopUpBreak() throws IOException {

        // General setup
        setTitle("PopUpBreak");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        // Layout and panels setup
        setLayout(new BorderLayout());

        panelTabs = new PanelTabs(this);
        add(panelTabs, BorderLayout.CENTER);

        panelAgenda = new PanelAgenda(this);
        add(panelAgenda, BorderLayout.EAST);

        // Pop up handler
        dialogPopUp = new DialogPopUp(this);
        timerChecker();
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
    void timerChecker() {

        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
        s.schedule(new Runnable() {
            public void run() {
                String result = dialogPopUp.run();
                System.out.print("resultttt: " + result);
            }
        }, 5, TimeUnit.SECONDS);

        // Pop-up dialog
//        DialogPopUp dialogPopUp = new DialogPopUp(this);
//        String result = dialogPopUp.run();
//        if (result != null) {
//            JOptionPane.showMessageDialog(this, "res: " + result);
//        }
    }


    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
     * Main to run the app
     *
     * @param args Command line params
     */
    public static void main(String[] args) {
        try {
            // Unifies the interface for different operating systems
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

            InterfacePopUpBreak interfacePopUpBreak = new InterfacePopUpBreak();
            interfacePopUpBreak.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
