package com.algorithm.interview1;

import com.algorithm.Print;

public class Interview3 {
    public static void main(String[]args){
        Int a = new Int(1000);
        Int b = new Int(1000);

        new Print().show(a == b);
        new Print().show(a.equals(b));
    }
}


class Int{
    public int val;
    public Int(int val){
        this.val = val;
    }

    public boolean equals(Int b){
        return this.val == b.val;
    }
}
