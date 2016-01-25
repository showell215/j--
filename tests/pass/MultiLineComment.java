package pass;

import java.lang.Integer;
import java.lang.System;


public class MultiLineComment {
    public boolean multiLineComment(int x) {
       //store starting value so we can then make sure it was unchanged.
       int startVal = x;
       /*
       Try to change x to 25 inside comment block:
       x = 25
       */
       return (startVal == x);
    }
   
   public static void main(String[] args) {
        MultiLineComment mlc = new MultiLineComment();
        int x = Integer.parseInt(args[0]);
        System.out.println("Starting val(" + x + ") == Ending val?   " +  mlc.multiLineComment(x));
    }

}
