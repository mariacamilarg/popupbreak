package com.designproject.view;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.io.IOException;

public class PanelTabs extends JTabbedPane {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    /**
     * Interface: connection to main interface for communication among panels
     */
    private InterfacePopUpBreak interfacePopUpBreak;

    /**
     * Panel: home
     */
    private TabHome tabHome;

    /**
     * Panel: habit tracking
     */
    private TabHabitTracking tabHabitTracking;

    /**
     * Panel: learn more
     */
    private TabLearnMore tabLearnMore;

    /**
     * Panel: settings
     */
    private TabSettings tabSettings;

    /**
     * Panel: time to break
     */
    private TabTimeToBreak tabTimeToBreak;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public PanelTabs(InterfacePopUpBreak interfacePopUpBreak) throws IOException {

        // Initialize attributes
        this.interfacePopUpBreak = interfacePopUpBreak;

        // Set layout
        tabHome = new TabHome();
        ImageIcon homeIcon = new ImageIcon(getClass().getResource("/icons/home.png"));
        addTab("Home", homeIcon, tabHome,"Main view of application");

        tabHabitTracking = new TabHabitTracking();
        ImageIcon habitTrackingIcon = new ImageIcon(getClass().getResource("/icons/tracking.png"));
        addTab("Habit Tracking", habitTrackingIcon, tabHabitTracking,"To view stat summaries");

        tabLearnMore = new TabLearnMore();
        ImageIcon learnMoreIcon = new ImageIcon(getClass().getResource("/icons/learn.png"));
        addTab("Learn More", learnMoreIcon, tabLearnMore,"To gather more knowledge");

        tabSettings = new TabSettings();
        ImageIcon settingsIcon = new ImageIcon(getClass().getResource("/icons/settings.png"));
        addTab("Settings", settingsIcon, tabSettings,"To tweak the reminders");

        tabTimeToBreak = new TabTimeToBreak();
        ImageIcon timerIcon = new ImageIcon(getClass().getResource("/icons/timer.png"));
        addTab("01:05 min left until you next break", timerIcon, tabTimeToBreak,"To tweak the reminders");

        // Set style
        setBackground(Color.WHITE);
        for (int i = 0; i < this.getTabCount(); i++) {
            this.setBackgroundAt(i, Color.WHITE);
            this.getComponentAt(i).setBackground(Color.WHITE);
        }
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
}
