package com.company;

import java.util.*;

public class longest_seq {
    public static void main(String[] args) {
        int arr[]={ 101, 2, 1, 5, 102,3, 4, 100, 6 };
        Arrays.sort(arr);
        int n=arr.length;
        int nums=arr[0];
        int ans=0;
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(n==0)
                System.out.println("0");
            if(arr[i]==nums+1)
            {
                c++;
                nums++;
            }
//            else
//                if(arr[i]!=nums)
//                    c=1;
            arr[i]=nums;
            ans=Math.max(ans,c);
        }
        System.out.println(ans);
    }
}
