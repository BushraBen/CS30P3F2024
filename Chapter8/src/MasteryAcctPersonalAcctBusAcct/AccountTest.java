package MasteryAcctPersonalAcctBusAcct;

public class AccountTest 
{
    public static void main(String[] args) 
    {
// Test PersonalAcct
        PersonalAcct personalAccount = new PersonalAcct("PersonalAcct", 200.0);
        System.out.println("Personal Account Initial Balance is : $" + personalAccount.getBalance());
        
        personalAccount.withdraw(50.0);
        System.out.println("After withdrawing $50: $" + personalAccount.getBalance());
        
        personalAccount.withdraw(60.0);
        System.out.println("After withdrawing $60: $" + personalAccount.getBalance());

// Test BusinessAcct
        BusinessAcct businessAccount = new BusinessAcct("BusinessAcct", 1000.0);
        System.out.println("Business Account Initial Balance: $" + businessAccount.getBalance());
        
        businessAccount.withdraw(400.0);
        System.out.println("After withdrawing $400: $" + businessAccount.getBalance());
        
        businessAccount.withdraw(150.0);
        System.out.println("After withdrawing $150: $" + businessAccount.getBalance());
    }
}
