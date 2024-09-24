package Mastery;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LocalBankGUI extends JFrame {
    private Bank bank;
    private JTextField accountIdField, amountField, firstNameField, lastNameField;
    private JTextArea outputArea;

    public LocalBankGUI() {
        bank = new Bank();
        setTitle("LocalBank GUI");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createComponents();
        
        setVisible(true);
    }

    private void createComponents() {
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputPanel.add(new JLabel("Account ID:"));
        accountIdField = new JTextField(10);
        inputPanel.add(accountIdField);

        inputPanel.add(new JLabel("Amount:"));
        amountField = new JTextField(10);
        inputPanel.add(amountField);

        inputPanel.add(new JLabel("First Name:"));
        firstNameField = new JTextField(10);
        inputPanel.add(firstNameField);

        inputPanel.add(new JLabel("Last Name:"));
        lastNameField = new JTextField(10);
        inputPanel.add(lastNameField);

        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton checkBalanceButton = new JButton("Check Balance");
        JButton addAccountButton = new JButton("Add Account");
        JButton removeAccountButton = new JButton("Remove Account");

        depositButton.addActionListener(e -> performTransaction("deposit"));
        withdrawButton.addActionListener(e -> performTransaction("withdraw"));
        checkBalanceButton.addActionListener(e -> checkBalance());
        addAccountButton.addActionListener(e -> addAccount());
        removeAccountButton.addActionListener(e -> removeAccount());

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(depositButton);
        buttonPanel.add(withdrawButton);
        buttonPanel.add(checkBalanceButton);
        buttonPanel.add(addAccountButton);
        buttonPanel.add(removeAccountButton);

        inputPanel.add(buttonPanel);

        add(inputPanel, BorderLayout.NORTH);

        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void performTransaction(String type) {
        String accountId = accountIdField.getText();
        String amountStr = amountField.getText();

        if (accountId.isEmpty() || amountStr.isEmpty()) {
            outputArea.setText("Please enter both Account ID and Amount.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);
            String result = bank.performTransaction(type, accountId, amount);
            outputArea.setText(result);
        } catch (NumberFormatException e) {
            outputArea.setText("Invalid amount. Please enter a valid number.");
        }
    }

    private void checkBalance() {
        String accountId = accountIdField.getText();
        if (accountId.isEmpty()) {
            outputArea.setText("Please enter an Account ID.");
            return;
        }

        String result = bank.checkBalance(accountId);
        outputArea.setText(result);
    }

    private void addAccount() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String amountStr = amountField.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || amountStr.isEmpty()) {
            outputArea.setText("Please enter First Name, Last Name, and Beginning Balance.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);
            String result = bank.addAccount(firstName, lastName, amount);
            outputArea.setText(result);
        } catch (NumberFormatException e) {
            outputArea.setText("Invalid amount. Please enter a valid number for the beginning balance.");
        }
    }

    private void removeAccount() {
        String accountId = accountIdField.getText();
        if (accountId.isEmpty()) {
            outputArea.setText("Please enter an Account ID to remove.");
            return;
        }

        String result = bank.deleteAccount(accountId);
        outputArea.setText(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LocalBankGUI());
    }
} 