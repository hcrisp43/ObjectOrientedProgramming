import java.util.*;
import java.lang.Math;
/**
 * Project 5 Loops
 *
 * @author Hunter Crisp
 * @version 25 September 2021
 */
public class Hunter_Crisp_Project5
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        
        int choice = 1;
        
        /*for(int i = 1; i <= n; i++)
        {
            balance = (Math.pow(1 + r, i) * p) - (((Math.pow(1 + r, i) - 1) * c) / r);
            totalInterest = (c * i) - (p - balance);
            System.out.print(i + "\t $");
            System.out.printf("%.2f", c);
            System.out.print("\t $");
            System.out.printf("%.2f", totalInterest);
            System.out.print("\t $");
            System.out.printf("%.2f", balance);
            System.out.println();
        }*/
        
        
        do {
            int t = 0;
            double p = 0.0;
            double r = 0.0;
            System.out.print("Enter the principle to borrow: $");
            p = s.nextDouble();
            
            System.out.print("Enter the Interest Rate in decimal: ");
            r = s.nextDouble() / 12.0;
            
            System.out.print("Enter the term (in years): ");
            t = s.nextInt();
            
            System.out.println("Month" + "\t" + " Payment" + "\t" + "Total Interest" + "\t" + " Balance");
            
            int n = t * 12;
            double c = (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
            double totalInterest = 0.0;
            double balance = 0.0;
            int i = 1;
            while(i <= n)
            {
                balance = (Math.pow(1 + r, i) * p) - (((Math.pow(1 + r, i) - 1) * c) / r);
                totalInterest = (c * i) - (p - balance);
                System.out.print(i + "\t $");
                System.out.printf("%.2f", c);
                System.out.print("\t $");
                System.out.printf("%.2f", totalInterest);
                System.out.print("\t $");
                System.out.printf("%.2f", balance);
                System.out.println();
                i++;
            }

            System.out.print("Do you want to enter a new mortgage?(1 for yes, 2 for no) ");
            choice = s.nextInt();
        }
        while(choice == 1);
    }
}
