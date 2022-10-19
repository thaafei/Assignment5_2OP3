/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a Java program, use 'subroutine' to finds the minimum value of
 * the first N elements of an array of type int.
 * Meanwhile, your code can throw an IllegalException (custom run-time
 * exception, which can be one provided by Java) if N is not in the range
 * of the length of input array.
 *
 * Input: user input array and number N.
 * Output: the minimum value of the first N elements of the array.
 *
 * Note: The array and N are parameters to the subroutine.
 * Users will input an array with no specific length.
 *
 */

import java.sql.Array;
import java.util.Scanner;

public class Q1_FindMinimum {
    public static void minArray(int N,int array[] ){ //subroutine to find minimal value in array
        int smallNum= 2147483647; //initializing the smallest number variable

        try{
            for (int i=0; i<N;i++){ //loops for the lenght of N
                if (array[i]<smallNum){
                    smallNum=array[i];//stores number at array[i] if it is smaller then small Num
                }
            }
            System.out.printf("The min value in your array is %d",smallNum); //prints min value
        }catch(ArrayIndexOutOfBoundsException x){ //if N is out of bounds of array, catches the exception and prints it is out of bounds
            System.out.println("Your number N is out of bounds of the Array");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //initializing scanner
        System.out.print("Enter the length of your array: ");
        int length = sc.nextInt(); // gets input for integer
        int newArray[]=new int[length]; //initializing new array


        for (int i = 0;i<length;i++){ //for the specificed length, stores a number in the array's indices
            System.out.printf("Input value for indice's %d:",i);
            newArray[i]=sc.nextInt();
        }

        System.out.print("Enter the number N: "); //gets user-inputted N
        int N = sc.nextInt();

        minArray(N,newArray); //calls the method

    }
}


