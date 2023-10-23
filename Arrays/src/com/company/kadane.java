package com.company;

import java.util.ArrayList;

public class kadane {
    public static void main(String[] args) {
        int[] A={-2, 1, -3, 4, -1, 2, 1 , -5, 4};
        int sum=0;
        int max=0;
       ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=i;j<A.length-1;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    sum+= A[k];
                    if(sum> max)
                    {
                        max=sum;
                        ar.add(i);
                        ar.add(j);
                    }
                }
            }
        }
        System.out.print(ar);
    }
}
