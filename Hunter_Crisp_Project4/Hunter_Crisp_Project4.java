import java.util.Scanner;
/**
 * Project 4 Binary Conversion
 *
 * @author Hunter Crisp
 * @version 13 September 2021
 */
public class Hunter_Crisp_Project4
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a binary number: ");
        String binary = s.nextLine();
        
        //Java built in method
        System.out.println("Parse int: " + Integer.parseInt(binary, 2));
        
        //Convert to int
        int b = Integer.parseInt(binary);
        int d = 0;        
        int i = 0;
        int t = 0;
        //While greater than 0
        while(b > 0)
        {
            //Determine if 0 or 1
            t = b % 10;
            
            //Multiply remainder times 2^i and add to sum
            d += t * Math.pow(2, i);
            
            //divide b by 10
            b /= 10;
            
            //increase exponent of 2^i
            i++;
        }
        
        System.out.println("Binary Conversion: "+ d);
    }
}
