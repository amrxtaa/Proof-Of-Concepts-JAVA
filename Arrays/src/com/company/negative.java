package com.company;
import java.util.*;
//merging all the negative numbers to one side of the array
public class negative {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, -4, -5, 2, -7, 3,
                2, -6, -8, -9, 3, 2, 1};
       /*Arrays.sort(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" "); //O(nlogn)
            */
        //O(n) by using two pointer approach
        move(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    static void swap(int[] a, int l, int h)
    {
        int t;
        t=a[l];
        a[l]=a[h];
        a[h]=t;
    }
    static void move(int[] a)
    {
        int low = 0;
        int high = a.length - 1;
        int t;
        while (low <= high) {
            if (a[low] <= 0)
                low++;
            else
                swap(a, low, high--);
        }
    }
}
