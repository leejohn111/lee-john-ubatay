
import java.util.Scanner;


public class PalindromeNumber {

 
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int num = z.nextInt();
        
        int num1 = (num / 100);
        int num2 = (num % 10);
        
        if (num1 == num2){
            System.out.println(num + " is a palindrome");
        }
        else{
           System.out.println(num +" is not a palindrome");
        }
                
                
                
                
                
                
                
   
    }
    
}
