
/**
 * Savings Account class, a subclass of Account
 *
 * @author Hunter Crisp
 * @version 29 November 2021
 */
public class SavingsAccount extends Account
{
    private double interestRate;
    
    public void setInterestRate(double rate)
    {
        interestRate = rate;
    }
    
    public double getInterestRate()
    {
        return interestRate;
    }
    
    public void withdraw(double amount) throws IllegalAmountException, NoSufficientFundsException
    {
        if(amount > 0)
        {
            if(getBalance() >= 500)
            {
                setBalance(getBalance() - amount);
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
    
    public void addInterest()
    {
        //Round to two digits by multiplying by 100.0 then rounding, then dividing by 100.0
        double newBalance = Math.round((getBalance() * (1 + (interestRate/100.00)))*100.0)/100.0;
        setBalance(newBalance);
    }
    
    @Override
    public String toString()
    {
        return "Savings " + super.toString() + ", IR: " + interestRate;
    }
}
