package ass2_e1;

import java.util.Random;
import java.util.Scanner;

public class Ass2_e1 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int randomNumber = 0;
        int guess = 1;

        while (guess != randomNumber) {
            randomNumber = rand.nextInt();
            guess = rand.nextInt();
            if (guess > randomNumber) {
                System.out.println("too high");
            } else if (guess < randomNumber) {
                System.out.println("too low");
            } else {
                System.out.println("correct");
            }
        }

//        int num1 = rand.nextInt(10);
//        int num2 = rand.nextInt(10);
//        
//        System.out.println(num1 + " + " + num2 + " = ");
//        int answer = in.nextInt();
//        int correctAnswer = num1 + num2;
//        
//        
//       while (answer!=correctAnswer){
//           System.out.println("wrong try again.");
//           System.out.println(num1 + " + " + num2 + " = ");
//           answer = in.nextInt();
//       }        
//        System.out.println("you are correct!");
//        int count = 0;
//        while (count<100)
//        
//        System.out.println("IDIOT");
//        count++;
    }

}
