package com.company;
import java.util.Arrays;
public class max_min_2 {
    public static void main(String[] args) {
        int arr[]=new int[]{ 23,8,0,67,78};
        // approach 1
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int min=arr[0];
        int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int arr1[]=new int[]{ 23,8,0,67,78,100,-1};
        System.out.println(max+"  " +min);
        // approach 2
        for(int i=0;i<arr1.length;i++) {
            if (arr1[i] > max1) {
                max1 = arr1[i];
            }
            if(arr1[i]<min1)
                min1=arr1[i];
        }
                System.out.println("max"+ max1 );
                System.out.println("min"+ min1 );
        }
    }

