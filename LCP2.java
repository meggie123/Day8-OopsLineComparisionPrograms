package com.bridgelabz.Day8LineComparision;

public class LCP2 {
    public static void main(String [] args) {

        double  x1 = 8, y1 = 19;
        double  x2 = 15, y2 = 25;

        double value = ((Math.sqrt (x2 - x1) * (x2 -x1)) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of line is :" +value);

    }
}
