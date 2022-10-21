/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
 *
 * Write a java program to convert Roman numbers to integer.
 * Roman numerals are represented by seven different symbols:
 * I, V, X, L, C, D and M
 *
 * Symbol   Value
 *   I        1
 *   V        5
 *   X        10
 *   L        50
 *   C        100
 *   D        500
 *   M        1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written
 * as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Input: Roman number (user input, string type)
 * Output: print out corresponding integer
 *
 * Example: if the user enters 'LVIII', the program should output 'LVIII -> 58'
 *
 */

import java.util.Scanner;
public class Q5_Roman2Integer {
    /* place your subroutine code here */

    public static void romanNum(String x){
        char[] rNum = x.toCharArray();
        int convertedNum = 0;

        for (int i = 0; i < rNum.length; i++){
            int nextArr = 0;

            if (i != (rNum.length-1)){
                nextArr = i+1;
            }else{ nextArr = i;}


            if (rNum[i] == 'I' && rNum[nextArr] == 'V' ){
                convertedNum += 4;
                i++;
            }
            else if (rNum[i] == 'I' && rNum[nextArr] == 'X'){
                convertedNum += 9;
                i++;
            }
            else if (rNum[i] == 'X' && rNum[nextArr] == 'L'){
                convertedNum += 40;
                i++;
            }
            else if (rNum[i] == 'X' && rNum[nextArr] == 'C'){
                convertedNum += 90;
                i++;
            }
            else if (rNum[i] == 'C' && rNum[nextArr] == 'D'){
                convertedNum += 400;
                i++;
            }
            else if (rNum[i] == 'C' && rNum[nextArr] == 'M') {
                convertedNum += 900;
                i++;
            }
            else{
                if (rNum[i] == 'I'){
                    convertedNum += 1;
                }
                if (rNum[i] == 'V'){
                    convertedNum += 5;
                }
                if (rNum[i] == 'X'){
                    convertedNum += 10;
                }
                if (rNum[i] == 'L'){
                    convertedNum += 50;
                }
                if (rNum[i] == 'C'){
                    convertedNum += 100;
                }
                if (rNum[i] == 'D'){
                    convertedNum += 500;
                }
                if (rNum[i] == 'M'){
                    convertedNum += 1000;
                }
            }

        }
        System.out.println(x+" -> "+convertedNum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //initializing scanner
        System.out.print("Enter the roman numeral: ");
        String x = sc.nextLine(); // gets input for roman numeral
        romanNum(x); //calls method roman numeral
    }
}
