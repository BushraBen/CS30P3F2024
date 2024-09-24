package Mastery;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public String addAccount(String firstName, String lastName, double initialBalance) {
        Customer customer = new Customer(firstName, lastName);
        String accountId = generateAccountId(firstName, lastName);
        Account account = new Account(accountId, customer, initialBalance);
        accounts.put(accountId, account);
        return "Account created. Account ID is: " + accountId;
    }

    public String deleteAccount(String accountId) {
        if (accounts.containsKey(accountId)) {
            accounts.remove(accountId);
            return "Account " + accountId + " has been removed.";
        } else {
            return "Account " + accountId + " not found.";
        }
    }

    public String performTransaction(String type, String accountId, double amount) {
        if (!accounts.containsKey(accountId)) {
            return "Account " + accountId + " not found.";
        }

        Account account = accounts.get(accountId);
        if (type.equals("deposit")) {
            account.deposit(amount);
            return "Deposit successful. " + account.toString();
        } else if (type.equals("withdraw")) {
            if (account.withdraw(amount)) {
                return "Withdrawal successful. " + account.toString();
            } else {
                return "Insufficient funds. " + account.toString();
            }
        } else {
            return "Invalid transaction type.";
        }
    }

    public String checkBalance(String accountId) {
        if (accounts.containsKey(accountId)) {
            return accounts.get(accountId).toString();
        } else {
            return "Account " + accountId + " not found.";
        }
    }

    private String generateAccountId(String firstName, String lastName) {
        return (firstName.charAt(0) + lastName).toLowerCase();
    }
}


