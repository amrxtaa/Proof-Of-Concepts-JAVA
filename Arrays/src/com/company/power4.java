package com.company;

public class power4 {
    public static void main(String[] args) {
        int n = 25;
        long m = n * n * n * n;
        int temp = n;
        int c = 0;
        while (temp > 0) {
            c++;
            temp /= 10;
        }
        int i = 0;
        long l = 0;
        while (i >= c) {
            long r = m % 10;
            System.out.println(r);
            l = l * 10 + r;
            System.out.println(l);
            m /= 10;
            i++;
            System.out.println(l);

//        if(l==n)
//            System.out.println("true");
//        else
//            System.out.println("false");
        }
        System.out.println(l);
    }
}
