

import java.util.Scanner;


public class JavaApplication2 {

  
    public static void main(String[] args) {
      
         Scanner z = new Scanner(System.in);
         int num1, num2, num3;
         System.out.println("Enter three numbers : 3 1 2");
         num1 = z.nextInt();
         num2 = z.nextInt();
         num3 = z.nextInt();
        
         if (num1 > num2 || num1 > num3){ 
         System.out.printf("The largest is " + num1);
    }
         else if (num2>num1 || num2>num3){
         System.out.println("The largest is" + num2);
         }
         else if (num3>num1 || num3>num2){
         System.out.println("The largest is " + num3);
         }
         
        
        
    }
    
}
