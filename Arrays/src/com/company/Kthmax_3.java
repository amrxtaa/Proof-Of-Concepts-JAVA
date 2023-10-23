package com.company;
import java.util.*;
public class Kthmax_3 {
    public static void main(String[] args) {
        int a[]=new int[]{7 ,10, 4 ,3 ,20, 15};
        Arrays.sort(a); // 3 4 7 10 15 20
        int n=3;
 System.out.println(a[a.length-n]); // for kth max element
        //for kth smallest element
        if(n!=0)
        System.out.println(a[n-1]);
    }
}
