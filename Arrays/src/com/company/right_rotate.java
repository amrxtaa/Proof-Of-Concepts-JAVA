package com.company;
import java.util.*;
public class right_rotate {
    public static void main(String[] args) {
        //O(n) and (1)
//            int A[] = new int[]{1, 2, 3, 4, 5,8,9,0};
//            int x = A[A.length - 1],i;
//            int y=A[0];
//            for (i = A.length-1; i > 0; i--) {
//                A[i] = A[i -1];
//
//            }
//            A[0] = x;
//            A[1]=y;
//
//            for (int j=0;j<A.length;j++) {
//               // Arrays.toString(A);
//                System.out.print(" " +A[j]);
//            }
        //O(n) using two pointers
        int A[] = new int[]{1, 2, 3, 4, 5};
        int i = 0;
        int j = A.length - 1;
        int temp;
        while (i != j) {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
        }

        for (int k = 0; k < A.length; k++) {
            System.out.println(A[k]);
        }

    }
}

