import java.util.*;
/**
 * Project 11 Main
 *
 * @author Hunter Crisp
 * @version 15 November 2021
 */
public class Project11
{
    public static void main(String[] args)
    {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new CheckingAccount());
        accounts.get(0).setId(232);
        accounts.get(0).setBalance(588.49);
        System.out.println("Checking Account 1 initialized to: " + accounts.get(0).toString());
        
        accounts.get(0).deposit(238.92);
        System.out.println("Deposit 238.92 into Checking Account 1: " + accounts.get(0).toString());
        
        accounts.get(0).withdraw(400.0);
        System.out.println("Withdraw 400 from Checking Account 1: " + accounts.get(0).toString());
        
        System.out.println();
        
        accounts.add(new CheckingAccount());
        accounts.get(1).setId(921);
        accounts.get(1).setBalance(29.05);
        System.out.println("Checking Account 2 initialized to: " + accounts.get(1).toString());
        
        accounts.get(1).deposit(30.0);
        System.out.println("Deposit 30.00 into Checking Account 2: " + accounts.get(1).toString());
        
        accounts.get(1).withdraw(1000.0);
        System.out.println("Withdraw 1000.00 from Checking Account 2: " + accounts.get(1).toString());
        
        System.out.println();
        
        accounts.add(new SavingsAccount());
        SavingsAccount savings1 = (SavingsAccount)accounts.get(2);
        savings1.setId(7758);
        savings1.setBalance(11599.93);
        savings1.setInterestRate(4.5);
        accounts.add(savings1);
        System.out.println("Savings Account 1 initialized to: " + accounts.get(2).toString());
        
        savings1.deposit(250.00);
        System.out.println("Deposit 250.00 into Savings Account 1: " + accounts.get(2).toString());
        
        savings1.withdraw(5000.00);
        System.out.println("Withdraw 5000.00 from Savings Account 1: " + accounts.get(2).toString());
        
        savings1.addInterest();
        System.out.println("Added interest on Savings Account 1: " + accounts.get(2).toString());
        
        System.out.println();
        
        accounts.add(new SavingsAccount());
        SavingsAccount savings2 = (SavingsAccount)accounts.get(3);
        savings2.setId(60051);
        savings2.setBalance(203.45);
        savings2.setInterestRate(10);
        System.out.println("Savings Account 2 initialized to: " + accounts.get(3).toString());
        
        savings2.deposit(100.00);
        System.out.println("Deposit 100.00 into Savings Account 2: " + accounts.get(3).toString());
        
        savings2.withdraw(20.00);
        System.out.println("Withdraw 20.00 from Savings Accoount 2: " + accounts.get(3).toString());
        
        savings2.addInterest();
        System.out.println("Added interest on Savings Account 2: " + accounts.get(3).toString());
    }
}
