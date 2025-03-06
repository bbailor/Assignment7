package GUIControls;

import java.awt.*;
import javax.swing.*;

public class Window {
    private static JFrame window;
    private static JLabel scoreLabel;
    private static int score = 0;

    public Window() {
        // Create a new JFrame (window)
        JFrame window = new JFrame("");

        // Set the layout of the window to BorderLayout
        window.setLayout(new BorderLayout());

        // Create a JPanel with FlowLayout aligned to the right (for the top right corner)
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        // Create a JTextField (textbox) with an initial width of 10 columns (smaller)
        // JTextField textField = new JTextField(10);

        // Create a JLabel
        JLabel label = new JLabel("Score: " + score);

        // Add the components to the panel
        panel.add(label);
        // panel.add(textField);

        // Set a preferred size for the panel to avoid taking up too much space
        panel.setPreferredSize(new Dimension(200, 50)); // Width: 200, Height: 50

        // Add the panel to the top of the window (BorderLayout.NORTH)
        window.add(panel, BorderLayout.NORTH);

        // Set window properties
        window.setSize(800, 600); // Set window size to 800x600
        window.setLocationRelativeTo(null);  // Centers the window on the screen
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        window.setVisible(true);
    }

    public static void setTitle(String title) {
        window.setTitle(title);
    }

    public static void setSize(int width, int height) {
        window.setSize(width, height);
        window.setLocationRelativeTo(null);
    }
    
    public static void setResizeable(boolean isResizeable) {
    	window.setResizable(isResizeable);
    }

    public static void setContentPane(JPanel panel) {
        window.getContentPane().removeAll();
        panel.setPreferredSize(new Dimension(window.getWidth(), window.getHeight()));
        window.setContentPane(panel);
        window.revalidate();
        window.repaint();
    }
}
