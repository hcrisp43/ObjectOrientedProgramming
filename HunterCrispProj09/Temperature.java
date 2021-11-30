import java.util.*;
/**
 * Project 9
 *
 * @author Hunter Crisp
 * @version 25 October 2021
 */
public class Temperature {
    private double degree;
    private char scale;
    
    Temperature(){
        degree = 0.0;
        scale = 'C';
    }
    
    Temperature(double d){
        degree = d;
        scale = 'C';
    }
    
    Temperature(char c){
        scale = c;
        degree = 0.0;
    }
    
    Temperature(double d, char c){
        degree = d;
        scale = c;
    }
    
    public double getDegreeInCelsius(){
        if(scale == 'C')
        {
            return degree;
        }
        else
        {
            return ((degree - 32)*5/9);
        }
    }
    
    public double getDegreeInFahrenheit(){
        if(scale == 'F')
        {
            return degree;
        }
        else
        {
            return (1.8 * degree)+32;
        }
    }
    
    public void setDegree(double d){
        degree = d;
    }
    
    public void setDegree(char c){
        scale = c;
    }
    
    public void setDegree(double d, char c){
        degree = d;
        scale = c;
    }
    
    public boolean equals(Temperature t){
        if(getDegreeInCelsius() == t.getDegreeInCelsius() &&
        getDegreeInFahrenheit() == t.getDegreeInFahrenheit())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isLessThan(Temperature t){
        if(getDegreeInCelsius() < t.getDegreeInCelsius() &&
        getDegreeInFahrenheit() < t.getDegreeInFahrenheit())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isGreaterThan(Temperature t){
        if(getDegreeInCelsius() > t.getDegreeInCelsius() &&
        getDegreeInFahrenheit() > t.getDegreeInFahrenheit())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        Temperature t1 = new Temperature();
        System.out.println("First Temperature degrees in C: " + t1.getDegreeInCelsius());
        System.out.println("First Temperature degrees in F: " + t1.getDegreeInFahrenheit());
        
        System.out.println("Set the degrees of First Temperature: ");
        double userDegree = s.nextDouble();
        t1.setDegree(userDegree);
        
        System.out.println("Set the scale of First Temperature: ");
        char userScale = s.next().charAt(0);
        t1.setDegree(userScale);
        
        System.out.printf("First Temperature degrees in C: %.2f", t1.getDegreeInCelsius());
        System.out.printf("%nFirst Temperature degrees in F: %.2f%n", t1.getDegreeInFahrenheit());
        System.out.println();
        
        Temperature t2 = new Temperature(25, 'C');
        System.out.printf("Second Temperature degrees in C: %.2f", t2.getDegreeInCelsius());
        System.out.printf("%nSecond Temperature degrees in F: %.2f%n", t2.getDegreeInFahrenheit());
        System.out.println();
        
        System.out.println("Set the degrees of Second Temperature: ");
        userDegree = s.nextDouble();
        t2.setDegree(userDegree);
        
        System.out.println("Set the scale of Second Temperature: ");
        userScale = s.next().charAt(0);
        t2.setDegree(userScale);
        
        System.out.printf("Second Temperature degrees in C: %.2f", t2.getDegreeInCelsius());
        System.out.printf("%nSecond Temperature degrees in F: %.2f%n", t2.getDegreeInFahrenheit());
        System.out.println();
        
        Temperature t3 = new Temperature('F'); 
        System.out.printf("Third Temperature degrees in C: %.2f",t3.getDegreeInCelsius()); 
        System.out.printf("%nThird Temperature degrees in F: %.2f%n", t3.getDegreeInFahrenheit());
        System.out.println();
        
        System.out.println("Set the degrees of Third Temperature: ");
        userDegree = s.nextDouble(); t3.setDegree(userDegree);
        
        System.out.println("Set the scale of Third Temperature: "); 
        userScale = s.next().charAt(0); t3.setDegree(userScale);
        
        System.out.printf("Third Temperature degrees in C: %.2f",t3.getDegreeInCelsius()); 
        System.out.printf("%nThird Temperature degrees in F: %.2f%n", t3.getDegreeInFahrenheit());
        System.out.println();
        
        Temperature t4 = new Temperature(68);
        System.out.printf("Fourth Temperature degrees in C: %.2f", t4.getDegreeInCelsius());
        System.out.printf("%nFourth Temperature degrees in F: %.2f", t4.getDegreeInFahrenheit());
        System.out.println();
        
        System.out.println("Set the degrees of Fourth Temperature: ");
        userDegree = s.nextDouble();
        t4.setDegree(userDegree);
        
        System.out.println("Set the scale of Fourth Temperature: ");
        userScale = s.next().charAt(0);
        t4.setDegree(userScale);
        
        System.out.printf("Fourth Temperature degrees in C: %.2f", t4.getDegreeInCelsius());
        System.out.printf("%nFourth Temperature degrees in F: %.2f", t4.getDegreeInFahrenheit());
        System.out.println();
        
        System.out.printf("%nIn order of creation the Temperatures in Celsius are: %.2f, %.2f, %.2f, %.2f", t1.getDegreeInCelsius(),
        t2.getDegreeInCelsius(), t3.getDegreeInCelsius(), t4.getDegreeInCelsius());
        
        System.out.printf("%nIn order of creation the Temperatures in Fahrenheit are: %.2f, %.2f, %.2f, %.2f", t1.getDegreeInFahrenheit(),
        t2.getDegreeInFahrenheit(), t3.getDegreeInFahrenheit(), t4.getDegreeInFahrenheit());
        System.out.println();
        
        if(t1.equals(t2))
        {
            System.out.println("The first temperature is equal to the second temperature");
        }
        else
        {
            System.out.println("The first temperature is not equal to the second temperature");
        }
        
        if(t1.isLessThan(t2))
        {
            System.out.println("The first temperature is less than the second temperature");
        }
        else
        {
            System.out.println("The first temperature is not less than the second temperature");
        }
        
        if(t1.isGreaterThan(t2))
        {
            System.out.println("The first temperature is greater than the second temperature");
        }
        else
        {
            System.out.println("The first temperature is not greater than the second temperature");
        }
        
        System.out.println();
        
        if(t1.equals(t3))
        {
            System.out.println("The first temperature is equal to the third temperature");
        }
        else
        {
            System.out.println("The first temperature is not equal to the third temperature");
        }
        
        if(t1.isLessThan(t3))
        {
            System.out.println("The first temperature is less than the third temperature");
        }
        else
        {
            System.out.println("The first temperature is not less than the third temperature");
        }
        
        if(t1.isGreaterThan(t3))
        {
            System.out.println("The first temperature is greater than the third temperature");
        }
        else
        {
            System.out.println("The first temperature is not greater than the third temperature");
        }
        
        System.out.println();
        
        if(t1.equals(t4))
        {
            System.out.println("The first temperature is equal to the fourth temperature");
        }
        else
        {
            System.out.println("The first temperature is not equal to the fourth temperature");
        }
        
        if(t1.isLessThan(t4))
        {
            System.out.println("The first temperature is less than the fourth temperature");
        }
        else
        {
            System.out.println("The first temperature is not less than the fourth temperature");
        }
        
        if(t1.isGreaterThan(t4))
        {
            System.out.println("The first temperature is greater than the fourth temperature");
        }
        else
        {
            System.out.println("The first temperature is not greater than the fourth temperature");
        }
        
        System.out.println();
        
        if(t2.equals(t3))
        {
            System.out.println("The second temperature is equal to the third temperature");
        }
        else
        {
            System.out.println("The second temperature is not equal to the third temperature");
        }
        
        if(t2.isLessThan(t3))
        {
            System.out.println("The second temperature is less than the third temperature");
        }
        else
        {
            System.out.println("The second temperature is not less than the third temperature");
        }
        
        if(t2.isGreaterThan(t3))
        {
            System.out.println("The second temperature is greater than the third temperature");
        }
        else
        {
            System.out.println("The second temperature is not greater than the third temperature");
        }
        
        System.out.println();
        
        if(t2.equals(t4))
        {
            System.out.println("The second temperature is equal to the fourth temperature");
        }
        else
        {
            System.out.println("The second temperature is not equal to the fourth temperature");
        }
        
        if(t2.isLessThan(t4))
        {
            System.out.println("The second temperature is less than the fourth temperature");
        }
        else
        {
            System.out.println("The second temperature is not less than the fourth temperature");
        }
        
        if(t2.isGreaterThan(t4))
        {
            System.out.println("The second temperature is greater than the fourth temperature");
        }
        else
        {
            System.out.println("The second temperature is not greater than the fourth temperature");
        }
        
        System.out.println();
        
        if(t3.equals(t4))
        {
            System.out.println("The third temperature is equal to the fourth temperature");
        }
        else
        {
            System.out.println("The third temperature is not equal to the fourth temperature");
        }
        
        if(t3.isLessThan(t4))
        {
            System.out.println("The third temperature is less than the fourth temperature");
        }
        else
        {
            System.out.println("The third temperature is not less than the fourth temperature");
        }
        
        if(t3.isGreaterThan(t4))
        {
            System.out.println("The third temperature is greater than the fourth temperature");
        }
        else
        {
            System.out.println("The third temperature is not greater than the fourth temperature");
        }
    }
}