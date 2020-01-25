package com.algorithm.interview1;

import com.algorithm.Print;

public class Interview1 {
    public static void  main(String[]args){
        int a = 1000;
        Integer b = 1000;
        Integer c = new Integer(1000);

        new Print().show(a == b);
        new Print().show(b == c);
        new Print().show(b.equals(a));
        new Print().show(c.equals(b));
    }

}
