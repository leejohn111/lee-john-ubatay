
import java.util.Random; 
import java.util.Scanner;




public class number2 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        Random random = new Random();
        int Player, Computer;
        System.out.println("Rock: 0 \n Paper: 1 \n Scissors: 2");
        System.out.println("*********************************************** ");
        System.out.println("Enter your play: ");
        Player = z.nextInt();
        Computer = random.nextInt(2);  
        System.out.println("Computer choose: "+ Computer);
     
              
        

        
        if (Computer == 0 && Player == 1)
        {
            System.out.printf("Computer wins"+ Computer);
        }
        else if (Player == 2 && Computer == 1)
        {
            System.out.printf("Player wins"+ Computer);
        }
        else if (Player == 1 && Computer == 2 )
        {
            System.out.printf("Computer wins"+ Computer);
        }
        else if (Player == 0 && Computer == 2)
        {
            System.out.printf("Player wins"+ Computer);
        }
        else if (Computer == 0 && Player == 2)
        {
            System.out.printf("Computer wins"+ Computer);
        }
        else if (Player == 0 && Computer == 0)
        {
             System.out.println("It's a TIE!");
        }
        else if (Player == 1 && Computer == 1)
        {
            System.out.println("It's a TIE!");
        }
        else if (Player == 2 && Computer == 2)
        {
            System.out.println("It's a TIE!");
        }
                
                
        
        
        
        
        
        
        
   
    }   
}
