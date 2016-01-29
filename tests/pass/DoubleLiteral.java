package pass;

import java.lang.Double;
import java.lang.System;


public class DoubleLiteral {
    public void doubleLiteral() {
       double a = 0.2534534534;
       double b = .50000001;
       double c = 1.259;
       double e = 2.;
       double f = 2345.2343;
       double g = 1234.;
       double h = 1.000;
       double i = 0.000;
    }
   
   public static void main(String[] args) {
        DoubleLiteral dl = new DoubleLiteral();
        dl.doubleLiteral();
        System.out.println("DOUBLE: successfully declared.");
    }

}
