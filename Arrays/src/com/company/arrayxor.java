package com.company;

public class arrayxor {
    public static void main(String[] args) {
        int arr[]={ 4, 2,2,1,1 ,6,4};
        int xor=0;
        int ans=0;
        int n=6;
        for(int i=0;i<arr.length;i++)
        {
             xor=0;
            for(int j=i;j<arr.length;j++)
            {
                xor^=arr[j];
                if(xor==n)
                    ans++;
            }
        }
        System.out.println(ans);
    }

}
