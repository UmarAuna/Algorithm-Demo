package com.algorithm.interview1;

import com.algorithm.Print;

public class Interview2 {
    public static void main(String[]args){
        String a = "abc";
        String b = "abc";
        String c = new String("abc");

        new Print().show(a == b);
        new Print().show(b == c);
        new Print().show(a.equals(b));
        new Print().show(c.equals(b));
    }

}
