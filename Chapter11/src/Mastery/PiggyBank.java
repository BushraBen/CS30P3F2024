package Mastery;

public class PiggyBank {

	  // Instance variables to store counts of each coin type
	  private int pennies;
	  private int nickels;
	  private int dimes; 
	  private int quarters;

	  // Constructor to initialize all counts to 0
	  public PiggyBank() {
	    pennies = 0;
	    nickels = 0;
	    dimes = 0;
	    quarters = 0;
	  }

	  // Method to add a penny
	  public void addPenny() {
	    pennies++;
	  }

	  // Method to add a nickel
	  public void addNickel() {  
	    nickels++;
	  }

	  // Method to add a dime
	  public void addDime() {
	    dimes++;
	  }

	  // Method to add a quarter
	  public void addQuarter() {
	    quarters++;
	  }

	  // Method to remove specified coins
	  public void removeCoins(int penniesToRemove, int nickelsToRemove, 
	                          int dimesToRemove, int quartersToRemove) {
	    pennies -= penniesToRemove;
	    nickels -= nickelsToRemove;
	    dimes -= dimesToRemove;
	    quarters -= quartersToRemove;
	  }

	  // Method to calculate total value of all coins
	  public int getTotal() {
	    return pennies + nickels * 5 + dimes * 10 + quarters * 25; 
	  }
	}