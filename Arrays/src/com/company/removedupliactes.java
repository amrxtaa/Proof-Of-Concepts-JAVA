package com.company;

public class removedupliactes {
    public static void main(String[] args) {
        int A[]=new int[]{ 10, 10, 20, 30};
        int l=A.length; int k=0;
        int temp[]=new int[l];
        for(int i=0;i<l-1;i++) {
            for (int j = i + 1; j < l-1; j++) {
                if (A[i]!=A[j])
                    temp[k++] = A[i];
            }
        }
            for(int i=0;i<l;i++)
            {
                A[i]=temp[i];
            System.out.println(A[i]);
        }
    }
}
