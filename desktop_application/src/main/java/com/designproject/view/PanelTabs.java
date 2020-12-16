package com.designproject.view;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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
        ImageIcon icon = new ImageIcon("resources/icons/home.png"); // TODO: put an icon for each tab

        tabHome = new TabHome();
        addTab("Home", icon, tabHome,"Main view of application");

        tabHabitTracking = new TabHabitTracking();
        addTab("Habit Tracking", icon, tabHabitTracking,"To view stat summaries");

        tabLearnMore = new TabLearnMore();
        addTab("Learn More", icon, tabLearnMore,"To gather more knowledge");

        tabSettings = new TabSettings();
        addTab("Settings", icon, tabSettings,"To tweak the reminders");

        tabTimeToBreak = new TabTimeToBreak();
        addTab("01:05 min left until you next break", icon, tabTimeToBreak,"To tweak the reminders");

    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
}
