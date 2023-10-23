package com.company;
import java.util.*;
import java.util.Collections;

public class merge_sorted {
    public static void main(String[] args) {
        int A1[] ={ 1,4, 7, 8,10};
        int A2[]={2, 3, 9};
        //method 1
        int m=A1.length+A2.length;
        int k=0;
        int A3[] =new int[m];
        StringBuffer sb=new StringBuffer("Amrita");
//        sb="Amrita";
        ArrayList a=new ArrayList<>();
        a.add(10);
        for(int i=0;i<A1.length;i++)
        {
            A3[k++]=A1[i];
        }
           for(int j=0;j<A2.length;j++)
           {
               A3[k++]=A2[j];
           }
           Arrays.sort(A3);
            k=0;
        for(int i=0;i<A2.length;i++)
        {
            A1[i]=A3[k++];
        }
        for(int j=0;j<A1.length;j++)
        {
            A2[j]=A3[k++];
        }
        for(int i=0;i<A1.length;i++)
        {
            System.out.println(A1[i]);
        }
        for(int j=0;j<A2.length;j++)
        {
            System.out.println(A2[j]);
        }
    }
}
