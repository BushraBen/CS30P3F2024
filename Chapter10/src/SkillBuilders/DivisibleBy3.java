package SkillBuilders;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DivisibleBy3 extends JFrame {
   private JTextField numberField;
   private JButton checkButton;
   private JLabel integerLabel;
   private JLabel divisibleLabel;
   public DivisibleBy3() {
       setTitle("Divisible by 3 Checker");
       setSize(300, 200);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new FlowLayout());
       JLabel promptLabel = new JLabel("Enter an integer:");
       numberField = new JTextField(10);
       checkButton = new JButton("Check");
       integerLabel = new JLabel("");
       divisibleLabel = new JLabel("");
       add(promptLabel);
       add(numberField);
       add(checkButton);
       add(integerLabel);
       add(divisibleLabel);
       checkButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               checkDivisibility();
           }
       });
   }
   private void checkDivisibility() {
       String input = numberField.getText().trim();
       try {
           int number = Integer.parseInt(input);
           integerLabel.setText(input + " is an integer.");
           if (number % 3 == 0) {
               divisibleLabel.setText(number + " is divisible by 3.");
           } else {
               divisibleLabel.setText(number + " is not divisible by 3.");
           }
       } catch (NumberFormatException ex) {
           integerLabel.setText(input + " is not an integer.");
           divisibleLabel.setText("");
       }
   }
   public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new DivisibleBy3().setVisible(true);
           }
       });
   }
}
