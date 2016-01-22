package pass;

import java.lang.Integer;
import java.lang.System;


public class Division {
    public int divide(int x, int y) {
        return  x / y;
    }
	
	public static void main(String[] args) {
        Division div = new Division();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("DIV(" + a + ", " + b + ") = " + div.divide(a, b));
    }

}
