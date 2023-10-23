package com.company;

public class product_of_digits {
    public static void main(String[] args) {
        System.out.println(product(1324));
    }
    static int product(int n)
    {
        int rem=n%10;
        if(rem==0)
            return 1;
        return rem * product(n/10);
    }
}
