package com.company;

public class reverse_1 {
    public static void main(String[] args) {
        int a[]=new int[]{ 1, 5, 7, 8, 9};
        int s=0;
//        int e=a.length-1;
//        while(s<e)
//        {
//            int temp;
//            temp=a[s];
//            a[s]=a[e];
//            a[e]=temp;
//            s++;
//            e--;
//        }
        for(int i=0;i<a.length/2;i++)
        {
            s=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=s;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}
