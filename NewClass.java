
import java.util.Random;
import java.util.Scanner;


public class NewClass {

    public static void main(String[] args) {
        Scanner et = new Scanner(System.in);
        Random rand = new Random();

        String word = et.next();
        
        
            int first = 0,last=word.length()-1, length = word.length();
            boolean isPalindrome = true;
             while(length != 0){
            if(word.charAt(first) == word.charAt(last)){
            isPalindrome = true;
        }
            else{
                isPalindrome = false;
            break;
            
             }
            first++;
            last--;
            length /=2;
        }
        System.out.println(isPalindrome);

//        int sum = 0, num;
//        do{
//            num=et.nextInt();
//            if(num==10)continue;
//            else sum +=num;
//        }while(num!=0);
//        
//        System.out.println(sum);
        
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                  System.out.print(j * i + "\t");
//            }
//            System.out.println("");
//        }

        
//         int sum = 0,num;
//                 do{
//              num = et.nextInt();
//             sum +=num;
//              while(num!=0);
//              
//                     System.out.println(sum);
//                     
//         
         
//         while(num == 0){
//             sum += num;
//             num = et.nextInt();
//         }
//         System.out.println(sum);
         
         
         
         
//         int numberOfQuestion=0,score=0;
//         
//         while(numberOfQuestion < 5){
//         int num1 = rand.nextInt(10);
//         int num2 = rand.nextInt(10);
//             System.out.println(num1 + " - " + num2 + " = ");
//             int answer = et.nextInt();
//             numberOfQuestion++;
//             if(answer == num1-num2)score++;
//         }           
//         System.out.println("Score is " + score);

              
     }
    
}