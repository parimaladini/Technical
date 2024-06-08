 // Calculate the area of the rectangle
//  Given the length and breadth of a rectangle, print area of the rectangle.

//  Input Format
 
//  First and only line of input contains two positive integers L - length of the rectangle and B - breadth of the rectangle.
 
//  Constraints
 
//  1 <= L, B <=109
 
//  Output Format
 
//  Print area of the given rectangle.

 import java.util.Scanner;

 public class QuestionA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long l = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(l*b);

    }
 }

