
/**
 * class IllegalAmountException
 *
 * @author Hunter Crisp
 * @version 29 November 2021
 */
public class IllegalAmountException extends Exception
{
    private double depositAmount;

    /**
     * Constructor for objects of class IllegalAmountException
     */
    public IllegalAmountException(double amount)
    {
        super("Invalid deposit amount: " + amount);
        this.depositAmount = amount;
    }
}
