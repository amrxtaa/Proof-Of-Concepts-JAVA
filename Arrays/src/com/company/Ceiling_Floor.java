package com.company;
import java.util.*;
public class Ceiling_Floor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A[] = new int[10];
        System.out.println("enter the array");
        for (int i = 0; i < 10; i++) {
            A[i] = s.nextInt();
        }
        System.out.println("enter the target");
        int target = s.nextInt();
        System.out.println("the ceiling of the number is"+ceiling(A, target));
        System.out.println("the floor of the number is"+floor(A, target));
    }
        static int ceiling(int A[], int t)
        {
        int s=0;
        int e= A.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(A[mid]==t)
            {return A[mid];}
          if(A[mid]>t)
            {
                e=mid-1;
            }
         else
            {
                s=mid+1;
            }
        }
        return A[s];
    }
    static int floor(int A[], int t)
    {
        int s=0;
        int e= A.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(A[mid]==t)
            {return A[mid];}
            if(A[mid]>t)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return A[e];
    }
}
