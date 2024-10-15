package MasteryAcctPersonalAcctBusAcct;

public class Account 
{
    private double balance;
    private String accountNumber;

    public Account(String accountNumber, double initialBalance) 
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }

    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
        } else 
        {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() 
    {
        return balance;
    }

    public String getAccountNumber() 
    {
        return accountNumber;
    }
}

