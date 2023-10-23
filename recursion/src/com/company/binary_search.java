package com.company;
import java.util.*;
public class binary_search {
    public static void main(String[] args) {
        int A[]=new int[]{ 10,34,89,45,23};
        Arrays.sort(A);
        System.out.println(A);
        int t=89;
        System.out.println(bsort(A, 0, A.length-1, t));
    }
    static int bsort(int[] arr, int s, int e, int t)
    {
        int m=s+(e-s)/2;
        if(arr[m]==t)
        {    return m;  }
        if(t>arr[m])
        return bsort(arr, m+1, e, t);
        else
            return bsort(arr, s, m-1,t );

    }
}
