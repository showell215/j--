package pass;

import java.lang.Double;
import java.lang.System;


public class DoubleLiteral {
    public double addDoubles(double x, double y) {
        return  x + y;
    }
   
   public static void main(String[] args) {
        DoubleLiteral dl = new DoubleLiteral();
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        System.out.println("DOUBLE(" + x + " + " + y + ") = " + dl.addDoubles(x, y));
    }

}
