
import java.util.Scanner;

// this program will get input from the user and will do
// some calculations

class Basiccalculator {
    
    
    
    
    public static void main (String args[]){
        
        System.out.println("Enter first number ");
        
        Scanner anything  = new Scanner(System.in);
        
        int firstnumber = anything.nextInt();
        
         System.out.println("Enter second number ");
        
        int secondnumber = anything.nextInt();
         
        
        int subtarction = firstnumber*secondnumber;
        
         
          System.out.println(" subtarction of first and second number is : " + subtarction);
        
    }
    
}
