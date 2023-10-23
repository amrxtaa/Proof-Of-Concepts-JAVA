package com.company;

public class fibonacci {
    public static void main(String[] args)
    {
        int a=fib(6);
        System.out.println(a);
    }
    static int fib(int n)
    {
        if(n<2)
        {    return n;   }
        return fib(n-2) + fib(n-1);
    }
}
