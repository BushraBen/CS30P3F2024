package MasteryAcctPersonalAcctBusAcct;

public class PersonalAcct extends Account 
{
    private static final double MIN_BALANCE = 100.0;
    private static final double CHARGE = 2.0;

    public PersonalAcct(String accountNumber, double initialBalance) 
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
            System.out.println("Balance below $100. Charging $2 fee.");
            super.withdraw(CHARGE);
        }
    }
}
