package com.company;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorialm(5));
    }
    static int factorialm(int n)
    {
        if(n==1) {
            return 1;
        }
        return n * factorialm(n-1);
    }
}
