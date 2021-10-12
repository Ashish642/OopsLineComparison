package com.blz.linecom;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to line compution program");
        int x1 = 5;
        int x2 = 8;
        int y1 = 9;
        int y2 = 89;
        int p1 = 14;
        int p2 = 16;
        int q1 = 4;
        int q2 = 85;
        double lengthOfLine1 = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        double lengthOfLine2 = Math.sqrt((p2-p1) * (p2-p1) + (q2-q1) * (q2-q1));
        System.out.println("Length of the First Line : "+lengthOfLine1);
        System.out.println("Length of the Second Line : "+lengthOfLine2);

        if (lengthOfLine1 > lengthOfLine2) {
            System.out.println("Line1 greater than Line2");

        }
        else if(lengthOfLine1 < lengthOfLine2) {
            System.out.println("Line1 is lessar than Line2");
        }
        else {
            System.out.println("Both line are equal");
        }
    }
}
