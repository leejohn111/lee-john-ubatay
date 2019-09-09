import java.util.Scanner;



public class JavaApplication1 {

   
    public static void main(String[] args) {
//  excercise 1 
        System.out.println("*********         ***          *         *       ");
        System.out.println("*       *      *       *      ***       * *      ");
        System.out.println("*       *     *         *    *****     *   *     ");
        System.out.println("*       *     *         *      *      *     *    ");
        System.out.println("*       *     *         *      *     *       *   ");
        System.out.println("*       *     *         *      *      *     *    "); 
        System.out.println("*       *     *         *      *       *   *     ");
        System.out.println("*       *       *      *       *        * *      ");
        System.out.println("*********         ***          *         *       ");

//  exercise 2
        Scanner input = new Scanner (System.in);  
        float result, pizza, toppings, result2, result3;
        System.out.println("Enter the number of pizza  ");
        pizza = input.nextFloat();
        System.out.println("Enter the number of toppings  ");
        toppings = input.nextFloat();
        
        result = pizza * 12.00f + toppings * 1.50f ;
        result2 = result*0.05f;
        result3 = result+result2;
        
        System.out.printf("Reciept: Number of pizzas: %.0f",pizza);
        System.out.println("");
        System.out.printf("Number of toppings: %.0f",toppings);
        System.out.println("");
        System.out.println("Cost (including tax):"+result3);
        
        
         
    }
    
}
