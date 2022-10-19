/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
 *
 * Use a "subroutine" and a lambda expression to implement function
 * f(x,y) = sqrt(x*x-y*y), both x and y are real numbers.
 * Meanwhile, your code can throw an IllegalException (custom run-time exception,
 * which can be one provided by Java) if the value of (x*x-y*y) is negative.
 *
 * INPUT: the value of x and y (user input)
 * OUTPUT: the value of sqrt(x*x-y*y)
 *
 * Note: output must be displayed using four significant digits after decimal point.
 *
 */

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Q2_LambdaExpression {

    interface lambda { //setting up interface to run lambda expression
        double exp(double x,double y);
    }

    static lambda sqrtf = (x, y)->{return sqrt(x*x-y*y);}; //creates lambda expression for finding the sqrt(x^2-y^2)
    static lambda f = (x,y)->{return x*x-y*y;}; //object in class lambda that finds x^2-y^2
    public static void lambdaFunc(double x, double y){ //method that calls the lambda object and outputs the value
        try{
            if (f.exp(x,y)<0){ //if lambda expression "f" returns a negative number
                throw new IllegalArgumentException(); //throws an illegal exception
            }else{ //prints the output of class lambda object sqrtf, formatted to 4 decimal points
                System.out.printf("%.4f", sqrtf.exp(x,y));
            }
        }catch(IllegalArgumentException negative){ //catches the custom arithmetic exception
            System.out.println("(x*x-y*y) is negative"); //outputs that the value of (x*x-y*y) is negative
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //initializing scanner
        System.out.print("Enter the value of x: ");
        double x = sc.nextInt(); // gets input for double x
        System.out.print("Enter the value of y: ");
        double y = sc.nextInt(); // gets input for double y

        lambdaFunc(x,y); //calls method lambdaFunc
    }

}
