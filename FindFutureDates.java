import java.util.Scanner;

public class FindFutureDates {
    public static void main(String[] args){
        Scanner q = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int day = q.nextInt();
        System.out.println("Enter the number o1f days elapsed since today: ");
        int elapsed = q.nextInt();
        
        String today ="";
        String future ="";
        
      switch(day%7){
          case 0:
              today = ("Sunday");
              break;
          case 1:
               today=("Monday");
              break;
           case  2:
               today=("Tuesday");
              break;
           case 3:
               today=("Wednesday");
               break;
           case 4:
               today=("Thursday");
           case 5:
               today=("Friday");
                 break;
           case 6:
               today=("Saturday");
               break;
      }
          switch(elapsed%7){
              case 0:
                  future= ("Sunday");
                  break;
              case 1:
                  future=("Monday");
              case 2:
                  future=("Tuesday");
              case 3:
                  future=("Wednesday");
                  break;
              case 4:
                  future=("Thursday");
                  break;
              case 5:
                  future=("Friday");
              case 6:
                  future=("Saturday");
          }
          System.out.println("today is "+today+" and the future day is "+future);
                  
                  
                      
      }
            
       
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
