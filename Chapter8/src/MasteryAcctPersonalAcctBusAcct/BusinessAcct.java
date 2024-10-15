package MasteryAcctPersonalAcctBusAcct;

public class BusinessAcct 
 	extends Account 
{
    private static final double MIN_BALANCE = 500.0;
    
    private static final double CHARGE = 10.0;

    public BusinessAcct(String accountNumber, double initialBalance) 
    {
        super(accountNumber, initialBalance);
    }

    
    public void withdraw(double amount) 
    {
        super.withdraw(amount);
        checkMinimumBalance();
    }

    private void checkMinimumBalance() 
    {
        if (getBalance() < MIN_BALANCE) 
        {
            System.out.println("Balance below $500. Charging $10 fee.");
            super.withdraw(CHARGE);
        }
    }
}

