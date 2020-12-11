package com.designproject.view;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

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

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public PanelTabs(InterfacePopUpBreak interfacePopUpBreak) {

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
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
}
