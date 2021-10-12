package com.blz.linecom;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to line compution program");
        int x1 = 5;
        int x2 = 8;
        int y1 = 9;
        int y2 = 9;
        double lengthOfLine1 = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        System.out.println("Length of the Line : "+lengthOfLine1);
    }
}
