
/**
 * class NoSufficientFundsException 
 *
 * @author Hunter Crisp
 * @version 29 November 2021
 */
public class NoSufficientFundsException extends Exception
{
    private double withdrawAmount;

    /**
     * Constructor for objects of class NoSufficientFundsException
     */
    public NoSufficientFundsException(double amount)
    {
        super("No sufficient funds available for withdraw amount: "+ amount);
        this.withdrawAmount = amount;
    }
}
