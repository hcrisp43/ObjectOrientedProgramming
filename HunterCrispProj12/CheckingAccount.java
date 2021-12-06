
/**
 * Checking Account class, a subclass of Account
 *
 * @author Hunter Crisp
 * @version 29 November 2021
 */
public class CheckingAccount extends Account
{
    public void withdraw(double amount) throws NoSufficientFundsException, IllegalAmountException
    {
        if(amount > 0)
        {
            if(amount <= getBalance())
            {
                //Round to two digits to avoid floating point errors
                double newBalance = Math.round((getBalance() - amount) * 100.0) / 100.0;
                setBalance(newBalance);
            }
            else
            {
                throw new NoSufficientFundsException(amount);
            }
        }
        else
        {
            throw new IllegalAmountException(amount);
        }
    }
    
    @Override
    public String toString()
    {
        return "Checking " + super.toString();
    }
}
