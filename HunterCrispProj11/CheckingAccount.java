
/**
 * Checking Account class, a subclass of Account
 *
 * @author Hunter Crisp
 * @version 15 November 2021
 */
public class CheckingAccount extends Account
{
    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= getBalance())
        {
            //Round to two digits to avoid floating point errors
            double newBalance = Math.round((getBalance() - amount) * 100.0) / 100.0;
            setBalance(newBalance);
        }
    }
    
    @Override
    public String toString()
    {
        return "Checking " + super.toString();
    }
}
