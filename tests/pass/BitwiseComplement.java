package pass;

import java.lang.Integer;
import java.lang.System;


public class BitwiseComplement {
    public int bitwiseComplement(int x) {
        return  ~x;
    }
    
    public static void main(String[] args) {
        BitwiseComplement bc = new  BitwiseComplement();
        int a = Integer.parseInt(args[0]);
        System.out.println("BC(" + a + ") = " + bc.bitwiseComplement(a));
    }

}
