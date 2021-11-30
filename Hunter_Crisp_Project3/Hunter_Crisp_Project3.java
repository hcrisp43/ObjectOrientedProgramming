
/**
 * Project 3
 *
 * @author Hunter Crisp
 * @version 6 September 2021
 */
import java.util.Scanner;
public class Hunter_Crisp_Project3
{
    public static void main(String args[])
    {
        //Initialize scanner
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your score (0-100): ");
        int t = s.nextInt();
        
        /*if(t >= 90 && t <= 100)
        {
            System.out.println("Your grade is: A");
        }
        else if(t >=80 && t <= 89)
        {
            System.out.println("Your grade is: B");
        }
        else if(t >= 70 && t <= 79)
        {
            System.out.println("Your grade is: C");
        }
        else if(t >= 60 && t <=69)
        {
            System.out.println("Your grade is: D");
        }
        else if(t < 60 && t >= 0)
        {
            System.out.println("Your grade is: F");
        }
        else
        {
            System.out.println("Error: enter a number 0-100");
        }*/
        
        switch(t)
        {
            case 100: case 99: case 98: case 97: case 96:
            case 95: case 94: case 93: case 92: case 91:
            case 90:
            {
                System.out.println("Your grade is: A");
                break;
            }
            
            case 89: case 88: case 87: case 86: case 85:
            case 84: case 83: case 82: case 81: case 80:
            {
                System.out.println("Your grade is: B");
                break;
            }
            
            case 79: case 78: case 77: case 76: case 75:
            case 74: case 73: case 72: case 71: case 70:
            {
                System.out.println("Your grade is: C");
                break;
            }
            
            case 69: case 68: case 67: case 66: case 65:
            case 64: case 63: case 62: case 61: case 60:
            {
                System.out.println("Your grade is: D");
                break;
            }
            
            default:
            {
                System.out.println("Your grade is: F");
                break;
            }
        }
    }
}
