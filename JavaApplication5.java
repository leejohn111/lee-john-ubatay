

import java.util.Random;
import java.util.Scanner;


public class JavaApplication5 {

    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
      int num1 = x.nextInt();
      int num2 = x.nextInt();
      
    
      
      if (num1>num2)
      {
          System.out.println("The 1st number is less than the 2nd number, please multiply");
                   System.out.println("The Product is " + num1*num2);
      } 
        else if (num1>num2)
               {
                System.out.println("The 1st number is greater than the 2nd number, please divide");
                System.out.println("The qoutient is " + num1/num2 );
                System.out.println("the qoutient is " + num1%num2 );
                
               } else 
                System.out.println("The two numbers are equal, please add");
                   System.out.println("The sum is " + (num1+num2));
                
                }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                                                      



//        int num = x.nextInt();
//        if(num%5 == 0)System.out.println("Hifive");
//        if(num%2 == 0)System.out.println("HiEven");
//        
//        else
//            System.out.println("you are wrong!!!");
        
        
        
        
        
        
        
        
        
        
        
//        Random random = new Random();
//        int number1 = random.nextInt(10);
//        int number2 = random.nextInt(10);
//        
//        
//        int num1 = (int)Math.random()*10;
//        int num2 = (int)Math.random()*10;
//        
//
//           System.out.println("Wat is the sum of" + number1 +" + " + number2 +" ? ");
//           int studentanswer = x.nextInt();
//           int sum = number1 + number2;
//           System.out.println(studentanswer == sum);
//           
//           if(studentanswer == sum);
//            System.out.println("correct");
           
           
           
        
        
        
//       Scanner XX = new Scanner(System.in);
//       int time_second,seconds,minutes,hours,time;
//      
//       System.out.println("enter time in seconds: ");
//       time_second = XX.nextInt();
//      
//       seconds = time_second %60;
//       minutes = (time_second % 3600)/60;
//       hours = time_second / 3600;
//       
//       System.out.println("time is" + " "+hours +"hour/s"+" "+minutes+" "
//        +"minutes/s"+" "+seconds +" "+ "seconds");
    }
    
}
