package LocalBank;

import java.util.ArrayList;

public class Bank 
{
	private ArrayList accounts;
		
	
	
	public Bank() 
	{
		accounts = new ArrayList();
	}
	

	
	public String addAccount(String firstName, String lastName, double balance) 
	{
		
		Account newAcct = new Account(balance, firstName, lastName);	
		accounts.add(newAcct);								
		
		return(newAcct.getID());
	}

	
	
	public String deleteAccount(String acctID) {
		int acctIndex;
		Account acctToMatch;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		
	 	if (acctIndex > -1) {
	 		accounts.remove(acctIndex);					
	 		return("Account removed.");
	 	} else {
	 		return("Account does not exist.");
	 	}
	}
	
	
	
	public String transaction(int transCode, String acctID, double amt) {
		int acctIndex;
		Account acctToMatch, acct;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		
	 	if (acctIndex > -1) {
	 		acct = (Account)accounts.get(acctIndex);	
	 		if (transCode == 1) {
	 			acct.deposit(amt);
	 			accounts.set(acctIndex, acct);			
	 			return(acct.toString());
	 		} else if (transCode == 2) {
	 			acct.withdrawal(amt);
	 			accounts.set(acctIndex, acct);			
	 			return(acct.toString());
	 		}
	 	}
	 	return("Account does not exist.");
	}


	public String checkBalance(String acctID) {
		int acctIndex;
		Account acctToMatch, acct;
		
	 	acctToMatch = new Account(acctID);
	 	acctIndex = accounts.indexOf(acctToMatch);		
	 	if (acctIndex > -1) {
	 		acct = (Account)accounts.get(acctIndex);	
	 		return(acct.toString());
	 	} else {
	 		return("Account does not exist.");
	 	}
	}
}