package com.blz.linecom;
import java.util.Scanner;
public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to line compution program");
        // create a scanner object class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinate for x-axis of first line : ");
        int x1 = sc.nextInt();
        int x2 = sc.nextByte();
        System.out.println("Enter the co-ordinate for y-axis of first line : ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Enter the co-ordinate for x-axis of second line : ");
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        System.out.println("Enter the co-ordinate for y-axis of second line : ");
        int q1 = sc.nextInt();
        int q2 = sc.nextInt();
        // creating object
        LineComparision length = new LineComparision();
        double lengthOfLine1 = length.lengthFind(x1, x2, y1, y2);
        System.out.println("Length of the first line is : " + lengthOfLine1);
        double lengthOfLine2 = length.lengthFind(p1, p2, q1, q2);
        System.out.println("Length of the Second Line  is: " + lengthOfLine2);
        // calling method
        length.checkEquality(lengthOfLine1, lengthOfLine2);
        length.checkCompareTo(lengthOfLine1, lengthOfLine2);
    }
    public double lengthFind(int x1, int x2,int y1, int y2) {
        double lengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return lengthOfLine;
    }
    /* Method use : -
    To check equality of line
     */
     public static void checkEquality(double lengthOfLine1, double lengthOfLine2) {

         if (lengthOfLine1==lengthOfLine2) {
             System.out.println("Both line are equal.");

         }
         else {
             System.out.println("both lines are not equal.");

         }
         /* Methode use : -
         to check compare two line
          */
      public static void checkCompareTo(double lengthOfLine1,double lengthOfLine2) {
          if (lengthOfLine1>lengthOfLine2) {
              System.out.println("Length of line is greater than Length of Line2");

          }
          else if(lengthOfLine1<lengthOfLine2) {
              System.out.println("Length of Line lesser than Length of Line2");


          }
          else {
              System.out.println("Both line are Equal");
          }
         }



         }
}