package com.designproject.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import static com.designproject.utils.ButtonCommands.LATER;
import static com.designproject.utils.ButtonCommands.NO;
import static com.designproject.utils.ButtonCommands.YES;
import static com.designproject.utils.ImageUtils.resizeIcon;

public class DialogPopUp extends JFrame implements ActionListener {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    /**
     * Interface: connection to main interface for communication among panels
     */
    private InterfacePopUpBreak interfacePopUpBreak;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Creates a panel with tabs on top that represent each screen of the desktop app
     */
    public DialogPopUp(InterfacePopUpBreak interfacePopUpBreak) {

        // Layout
        setTitle("Break time!");

        GraphicsConfiguration config = getGraphicsConfiguration();
        Rectangle bounds = config.getBounds();
        Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(config);
        int x = bounds.x + bounds.width - insets.right - getWidth();
        int y = bounds.y + bounds.height - insets.bottom - getHeight();
        setLocation(x, y);

        // Initialize attributes
        this.interfacePopUpBreak = interfacePopUpBreak;

        // Set layout
        setLayout(new BorderLayout());

        // Add text bubble to north
        JLabel question = new JLabel("<html>How about a water break now?</html>");
        AbstractBorder bubbleBorder = new TextBubbleBorder(Color.BLACK,2,16,16);
        question.setBorder(bubbleBorder);
        add(question, BorderLayout.NORTH);

        // Add gif to center
        URL url = getClass().getResource("/animations/water.gif");
        JLabel label = new JLabel(new ImageIcon(url));
        add(label, BorderLayout.CENTER);

        // Add buttons to the right
        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(3,1));

        panelButtons.add(createButton(YES));
        panelButtons.add(createButton(LATER));
        panelButtons.add(createButton(NO));

        add(panelButtons, BorderLayout.EAST);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    public JButton createButton(String iconName){
        JButton btn = new JButton(resizeIcon(
                new ImageIcon(getClass().getResource("/icons/" + iconName + ".png")), 64, 64));
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setFocusPainted(false);
        btn.setOpaque(false);

        btn.addActionListener(this);
        btn.setActionCommand(iconName);

        return btn;
    }

    public String run() {
        this.pack();
        this.setVisible(true);
        return "response";
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String command = actionEvent.getActionCommand();

        if (YES.equals(command)) {
            interfacePopUpBreak.maximize();
            interfacePopUpBreak.switchToBreak();
            dispose();
        } else if (NO.equals(command)) {
            // TODO show sad face and wait 5seconds
            dispose();
        }
    }
}
