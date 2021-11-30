import java.util.*;
/**
 * Project 6 Methods
 *
 * @author Hunter Crisp
 * @version 4 October 2021
 */
public class HunterCrispProj6
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        char choice = 'y';
        
        while(choice == 'y' || choice == 'Y')
        {
            
            System.out.print("Enter a string: ");
            String inputString = s.nextLine();
            
            System.out.print("Enter a char: ");
            char inputChar = s.next().charAt(0);
            
            System.out.println("The result of calling function int countLetters(String s): " + countLetters(inputString));
            System.out.println("The result of calling function int countLetters(String s, char c): " + countLetters(inputString, inputChar));
            
            System.out.println("Do another test?(y/n): ");
            choice = s.next().charAt(0);
            s.nextLine();
        }
    }
    
    public static int countLetters(String s)
    {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'B' || s.charAt(i) == 'b' || s.charAt(i) == 'C' || s.charAt(i) == 'c' || 
            s.charAt(i) == 'D' || s.charAt(i) == 'd' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'F' || s.charAt(i) == 'f' || 
            s.charAt(i) == 'G' || s.charAt(i) == 'g' || s.charAt(i) == 'H' || s.charAt(i) == 'h' || s.charAt(i) == 'I' || s.charAt(i) == 'i' || 
            s.charAt(i) == 'J' || s.charAt(i) == 'j' || s.charAt(i) == 'K' || s.charAt(i) == 'k' || s.charAt(i) == 'L' || s.charAt(i) == 'l' ||
            s.charAt(i) == 'M' || s.charAt(i) == 'm' || s.charAt(i) == 'N' || s.charAt(i) == 'n' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || 
            s.charAt(i) == 'P' || s.charAt(i) == 'p' || s.charAt(i) == 'Q' || s.charAt(i) == 'q' || s.charAt(i) == 'R' || s.charAt(i) == 'r' || 
            s.charAt(i) == 'S' || s.charAt(i) == 's' || s.charAt(i) == 'T' || s.charAt(i) == 't' || s.charAt(i) == 'U' || s.charAt(i) == 'u' || 
            s.charAt(i) == 'V' || s.charAt(i) == 'v' || s.charAt(i) == 'W' || s.charAt(i) == 'w' || s.charAt(i) == 'X' || s.charAt(i) == 'x' ||
            s.charAt(i) == 'Y' || s.charAt(i) == 'y' || s.charAt(i) == 'Z' || s.charAt(i) == 'z')
            {
                count++;
            }
        }
        
        return count;
    }
    public static int countLetters(String s, char c)
    {
        if(c != 'A' && c != 'a' && c != 'B' && c != 'b' && c != 'C' && c != 'c' && c != 'D' && c != 'd' &&
        c != 'E' && c != 'e' && c != 'F' && c != 'f' && c != 'G' && c != 'g' && c != 'H' && c != 'h' &&
        c != 'I' && c != 'i' && c != 'J' && c != 'j' && c != 'K' && c != 'k' && c != 'L' && c != 'l' &&
        c != 'M' && c != 'm' && c != 'N' && c != 'n' && c != 'O' && c != 'o' && c != 'P' && c != 'p' &&
        c != 'Q' && c != 'q' && c != 'R' && c != 'r' && c != 'S' && c != 's' && c != 'T' && c != 't' &&
        c != 'U' && c != 'u' && c != 'V' && c != 'v' && c != 'W' && c != 'w' && c != 'X' && c != 'x' &&
        c != 'Y' && c != 'y' && c != 'Z' && c != 'z')
        {
            return -1;
        }
        else
        {
            int count = 0;
            for(int i = 0; i < s.length(); i++)
            {
                if(Character.toUpperCase(s.charAt(i)) == c || Character.toLowerCase(s.charAt(i)) == c)
                {
                    count++;
                }
            }
        
            return count;
        }
    }
}
