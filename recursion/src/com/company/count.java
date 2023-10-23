package com.company;

public class count {
    public static void main(String[] args) {
        System.out.println(helper(30204));
        System.out.println(count1(30204,0));
    }
  static int helper(int n)
  {
      return count(n,0);
  }
    static int count(int n, int c) {
        if (n == 0)
            return c;
        int rem = n % 10;
        if (rem == 0)
            return count(n / 10, c + 1);
        else
            return count(n / 10, c);
    }
    static int count1(int n,int c)
    {
        if(n==0)
            return c;
        int rem = n % 10;
        if (rem == 0)
            return count(n / 10, c + 1);
        else
            return count(n / 10, c);
    }
    }

