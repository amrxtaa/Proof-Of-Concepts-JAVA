package com.company;

public class sum_of_digits {
    public static void main(String[] args) {
        System.out.println(sum(1324));
    }
    static int sum(int n)
    {
        int rem=n%10;
        if(rem==0)
            return 0;
        return rem + sum(n/10);

    }
}
