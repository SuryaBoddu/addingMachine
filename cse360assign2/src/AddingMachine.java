
/*
 *  Name: Surya Boddu
 *  ASU email: smboddu@asu.edu
 *  Course: CSE 360 
 *  Assignment#2
 *  Assignment Description: This assignment helps us get familiar with git hub
 *                         repository. This program does numeric operations and returns string.       
 * */

/**
 * This is class AddingMachine The methods in this class do Mathematic
 * operations like add, subtract and print out the string in a step by step
 * process.
 * <p>
 * 
 * @param nil
 */
public class AddingMachine {
	private int total;
	private String transactionHistory;

	public AddingMachine() // a constructor AddingMachine
	{
		total = 0;
		transactionHistory = "0";
	}

	public int getTotal() // getTotal method returns the current value
	{
		return total;
	}

	public void add(int value) // add method which adds value to the total
	{
		total += value;
		transactionHistory = transactionHistory + " + " + value;
	}

	public void subtract(int value) // subtract method which subtract value from the total
	{
		total -= value;
		transactionHistory = transactionHistory + " - " + value;
	}

	public String toString() // toString method return string transactionHistory
	{
		return transactionHistory;
	}

	public void clear() // clear method to reset data
	{
		transactionHistory = "0";
		total = 0;
	}

}
