import java.util.*;
/**
 * Project 7
 *
 * @author Hunter Crisp
 * @version 12 October 2021
 */
public class HunterCrispProj07
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        initializeArray(arr);
        printArray(arr);
        System.out.println();
        System.out.println("Largest: " + largest(arr));
        System.out.println("Smallest: " + smallest(arr));
        System.out.println("Range: " + range(arr));
        System.out.println("Average: " + average(arr));
        
        System.out.println("Enter a search key: ");
        int key = s.nextInt();
        
        int index = linearSearch(arr, key);
        if(index == -1)
        {
            System.out.println(key + " is not in the array.");
        }
        else
        {
            System.out.println(key + " is at index " + index);
        }
        System.out.println();
        System.out.println("Sorted array: ");
        selectSort(arr);
        printArray(arr);
    }
    
    public static void initializeArray(int[] a)
    {
        Random r = new Random();
        for(int i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt(101) + 1;
        }
    }
    
    public static void printArray(int[] a)
    {
        System.out.println();
        for(int i = 0; i < a.length/2; i++)
        {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        
        for(int i = a.length/2; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    
    public static int largest(int[] a)
    {
        int t = a[0];
        for(int i = 1; i < a.length; i++)
        {
            if(a[i] > t)
            {
                t = a[i];
            }
        }
        
        return t;
    }
    
    public static int smallest(int[] a)
    {
        int t = a[0];
        for(int i = 1; i < a.length; i++)
        {
            if(a[i] < t)
            {
                t = a[i];
            }
        }
        
        return t;
    }
    
    public static int range(int[] a)
    {
        return largest(a) - smallest(a);
    }
    
    public static double average(int[] a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        
        return sum / a.length;
    }
    
    public static int linearSearch(int[] a, int k)
    {
        //Search for key in array and return index, otherwise return -1
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == k)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public static void selectSort(int[] a)
    {
        //Sort array from smallest to largest
        for(int i = 0; i < a.length - 1; i++)
        {
            //Current value
            int temp = a[i];
            int index = i;
            
            //Find next smallest number
            for(int j = i; j < a.length; j++)
            {
                if(temp > a[j])
                {
                    temp = a[j];
                    index = j;
                }
            }
            
            //Swap smaller value with current value
            if(index != i)
            {
                a[index] = a[i];
                a[i] = temp;
            }
        }
    }
}
