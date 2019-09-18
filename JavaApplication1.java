
import java.util.Scanner;


public class JavaApplication1 {


    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       System.out.println("Answer each of the following questions with a number from 1 to 5 such that 1 means NEVER and 5 means ALWAYS");
       int n1, n2, n3, n4, n5, n6, n7, n8;
       
            System.out.println("1. I am competitive: ");   
            n1=x.nextInt();
            System.out.println("2. I am annoyed by people who are late for appointments: ");
            n2=x.nextInt();
            System.out.println("3. I perform several tasks simultaneously: ");
            n3=x.nextInt();
            System.out.println("4. I am ambitious: ");   
            n4=x.nextInt();
            System.out.println("5. I rush to get tasks completed: ");
            n5=x.nextInt();
            System.out.println("6. I worry about the future: ");
            n6=x.nextInt();
            System.out.println("7. I am in a race with time: ");
            n7=x.nextInt();
            System.out.println("8. I speak very rapidly: ");
            n8=x.nextInt();
            
            int score = n1+n2+n3+n4+n5+n6+n7+n8;
            System.out.println("score" + score);
            
            if (score>=35 || score==40){
            System.out.println("type A");
            }
            else if (score>=21){
                System.out.println("Between A and B, tending towards A ");
            }
            else if (score>=20){
                System.out.println("Between A and B, tending towards B ");
            }
            else if (score>=11){
                System.out.println("Type B");
            
            }
            
            
                      
             
            
               
               
               
               
               
               
    }
    
}
