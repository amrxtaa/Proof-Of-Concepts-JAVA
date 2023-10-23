package com.company;

import java.util.HashMap;

public class largest_suarray0 {
    public static void main(String[] args) {
        int[] arr={ 1, -1, 3, 2, -2, -3};
        //O(n2)
//        int m=0;
//        int sum=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            sum=0;
//            for(int j=i;j<arr.length;i++)
//            {
//                sum+=arr[j];
//                if(sum==0)
//                    m=Math.max(m, j-i+1);
//            }
//        }
//        System.out.println(m);
        // usinh hashing(nlogn)
        int sum=0;
        int max=0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==0)
                max=i+1;
            else
            {
                if(hm.get(sum)!=null)
                {
                    max=Math.max(max, i-hm.get(sum));
                }
                else
                    hm.put(sum,i);
            }
        }
        System.out.println(max);
    }
}
