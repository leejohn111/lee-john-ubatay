
package javaapplication1;
import java.util.Scanner;


public class JavaApplication1 {

  
    public static void main(String[] args) {
       Scanner x = new Scanner(System.in);
       System.out.print("Enter a toll number: ");
       long phoneNo = x.nextLong();
        String no = Long.toString(phoneNo);
       
       if (no.startsWith("800") || no.startsWith("866") || no.startsWith("877") || no.startsWith("888")){
       if(no.length() == 10){
            String result = no.substring(0,3);
            result = result + "-";
            result = result + no.substring(3,6);
            result = result + "-";
            result = result + no.substring(6);
            System.out.println(result+" is a toll-free number.");
        }else
           {
            System.out.println("Not a valid phone number.");
           }
              }else
           {
           System.out.println("Not a toll-free number");

           }
               
    }
    
}
