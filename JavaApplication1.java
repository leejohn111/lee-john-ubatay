
import java.util.Scanner;


public class JavaApplication1 {

    
    public static void main(String[] args) {
//        exercise 1 :)
       Scanner x = new Scanner (System.in);
         final float netpay, gross, FederalTax=0.15f, StateTax=0.035f,
         SecurityTax=0.0575f, Medicare=0.0275f, Pension=0.05f, HealthInsurance=75f;
         float pay1, pay2, pay3, pay4 , pay5, pay6;
         System.out.println("Name Of Employee: ");
         String employee = x.nextLine();
         System.out.println("Groos Amount");
         gross = x.nextFloat();
         
         pay1 = gross * FederalTax;
         pay2 = gross * StateTax;
         pay3 = gross * SecurityTax;
         pay4 = gross * Medicare;
         pay5 = gross * Pension;
         netpay = gross - pay1 - pay2 - pay3 - pay4 - pay5 - HealthInsurance;
         
         System.out.println("Name " + employee);
         System.out.printf("\nGross Ammount %.2f", gross);
         System.out.printf("\nStateTax %.2f", pay1);
         System.out.printf("\nStateTax %.2f", pay2);
         System.out.printf("\nSecurityTax %.2f", pay3);
         System.out.printf("\nMedicare %.2f", pay4);
         System.out.printf("\nPension %.2f", pay5);
         System.out.printf("\nnetpay %.2f",netpay );
         
         
         
//         exercise 2 :)


           

         
         
         
         
         
           
       
               
       
       
       
       
    }
    
}
