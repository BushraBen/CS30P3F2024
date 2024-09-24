package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MetricConversion extends JFrame {
    private JComboBox<String> conversionBox;
    private JLabel formulaLabel;

    public MetricConversion() {
        setTitle("Metric Conversion");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] conversions = {
            "Select a conversion",
            "Inches to Centimeters",
            "Feet to Meters",
            "Gallons to Liters",
            "Pounds to Kilograms"
        };

        conversionBox = new JComboBox<>(conversions);
        formulaLabel = new JLabel("The Formula will appear here");

        conversionBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFormula();
            }
        });

        add(conversionBox);
        add(formulaLabel);

        setVisible(true);
    }

    private void updateFormula() {
        String selectedConversion = (String) conversionBox.getSelectedItem();
        switch (selectedConversion) {
            case "Inches to Centimeters":
                formulaLabel.setText("1 inch = 2.54 centimeters");
                break;
            case "Feet to Meters":
                formulaLabel.setText("1 foot = 0.3048 meters");
                break;
            case "Gallons to Liters":
                formulaLabel.setText("1 gallon = 4.5461 liters");
                break;
            case "Pounds to Kilograms":
                formulaLabel.setText("1 pound = 0.4536 kilograms");
                break;
            default:
                formulaLabel.setText("Formula will appear here");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MetricConversion();
            }
        });
    }
}

