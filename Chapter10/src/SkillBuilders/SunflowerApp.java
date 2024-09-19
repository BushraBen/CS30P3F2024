package SkillBuilders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SunflowerApp extends JFrame {
    private JLabel nameLabel;
    private JButton latinButton;
    private JButton englishButton;

    public SunflowerApp() {
        setTitle("Sunflower Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        // Create main panel with BoxLayout
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create and add components
        nameLabel = new JLabel("Click a button to display the name");
        nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(nameLabel);
        mainPanel.add(Box.createVerticalStrut(20));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        latinButton = new JButton("Latin");
        englishButton = new JButton("English");

        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(latinButton);
        buttonPanel.add(Box.createHorizontalStrut(10));
        buttonPanel.add(englishButton);
        buttonPanel.add(Box.createHorizontalGlue());

        mainPanel.add(buttonPanel);
        mainPanel.add(Box.createVerticalGlue());

        // Add action listeners
        latinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameLabel.setText("Helianthus annuus");
            }
        });

        englishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameLabel.setText("Sunflower");
            }
        });

        // Add main panel to frame
        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SunflowerApp().setVisible(true);
            }
        });
    }
}

