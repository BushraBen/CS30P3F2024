package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class BreakAPlate extends JFrame {
    private JLabel plateLabel;
    private JButton playButton;
    private JLabel prizeLabel;
    private ImageIcon unbrokenPlates;
    private ImageIcon twoBrokenPlates;
    private ImageIcon threeBrokenPlates;
    private Random random;

    public BreakAPlate() {
        setTitle("Break A Plate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        random = new Random();

        // Load images
        unbrokenPlates = new ImageIcon("C:\\Users\\47026501\\git\\CS30P3F2024\\Chapter10\\src\\images\\plates.gif");
        twoBrokenPlates = new ImageIcon("C:\\Users\\47026501\\git\\CS30P3F2024\\Chapter10\\src\\images\\plates_two_broken.gif");
        threeBrokenPlates = new ImageIcon("C:\\Users\\47026501\\git\\CS30P3F2024\\Chapter10\\src\\images\\plates_all_broken.gif");
        // Create components
        plateLabel = new JLabel(unbrokenPlates);
        playButton = new JButton("Play");
        prizeLabel = new JLabel("Win a prize!", SwingConstants.CENTER);

        // Add components to the frame
        add(plateLabel, BorderLayout.CENTER);
        add(playButton, BorderLayout.SOUTH);
        add(prizeLabel, BorderLayout.NORTH);

        // Add action listener to the play button
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playGame();
            }
        });

        pack();
        setLocationRelativeTo(null);
    }

    private void playGame() {
        int brokenPlates = 0;
        for (int i = 0; i < 3; i++) {
            if (random.nextInt(2) == 1) {
                brokenPlates++;
            }
        }

        if (brokenPlates == 3) {
            plateLabel.setIcon(threeBrokenPlates);
            prizeLabel.setText("Congratulations!");
           
        } else {
            plateLabel.setIcon(twoBrokenPlates);
            prizeLabel.setText("Congrats!");
        }

        playButton.setText("Play Again");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BreakAPlate().setVisible(true);
            }
        });
    }
}
