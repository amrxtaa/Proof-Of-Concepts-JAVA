package com.company;

public class linear_search_arrays {
    public static void main(String[] args) {
        int[] arr=new int[]{ 1,7,6,8,5,8};
        System.out.println(linear(arr,0,15));
    }
    static boolean linear(int[] arr, int i,int t)
    {
        if(i==arr.length)  return false;
        return arr[i]==t || linear(arr, i+1,t);
    }
}
