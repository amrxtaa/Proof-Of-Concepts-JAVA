package com.company;

public class buyandsell {
    public static void main(String[] args) {
        int A[] = {7, 1, 5, 3, 6, 4};
//   int curmax=0;
//   int max=0;
//   int m=0;
//   int n=0;
//   for(int i=0;i<A.length;i++)
//   {
//       for(int j=i;j<A.length;j++)
//       {
//           if(A[i]<A[j])
//           {
//              curmax=A[j]-A[i];
//              if(curmax>max)
//              {
//                  max=curmax;
//                  m=A[i];
//                  n=A[j];
//
//              }
//           }
//
//       }
//   }
//        System.out.println(m+" "+n);
        int min = Integer.MIN_VALUE;
        int max=0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < min)
                min = A[i];
            else if(A[i]-min> max)
                max=A[i]-min;
        }
        System.out.println(max);
    }
}
