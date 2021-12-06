
/**
 * Account class for Project 12
 *
 * @author Hunter Crisp
 * @version 29 November 2021
*/
public class Account
{
    // instance variables - replace the example below with your own
    private int id;
    private double balance;

    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        // initialise instance variables
        id = 0;
        balance = 0.0;
    }
    
    public Account(int i, double b)
    {
        id = i;
        balance = b;
    }

    public void setBalance(double bal)
    {
        balance = bal;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void setId(int i)
    {
        id = i;
    }
    
    public void deposit(double amount) throws IllegalAmountException
    {
        if(balance > 0)
        {
            balance += amount;
            //Fix any floating point errors
            balance = Math.round(balance*100.0) / 100.0;
        }
        else
            throw new IllegalAmountException(amount);
    }
    
    public void withdraw(double amount) throws IllegalAmountException, NoSufficientFundsException
    {
        balance -= amount;
        //Fix any floating point errors
        balance = Math.round(balance*100.0) / 100.0;
    }
    
    public String toString()
    {
        return "Account " + id + ", $" + balance;
    }
}
