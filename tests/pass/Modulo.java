package pass;

import java.lang.Integer;
import java.lang.System;


public class Modulo {
    public int modulo(int x, int y) {
        return  x % y;
    }
   
   public static void main(String[] args) {
        Modulo mod = new Modulo();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("MOD(" + a + ", " + b + ") = " + mod.modulo(a, b));
    }

}
