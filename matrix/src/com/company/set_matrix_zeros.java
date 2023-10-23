package com.company;
import java.util.*;
public class set_matrix_zeros {
    public static void main(String[] args) {
        int a[][] = {{1, 0, 1}, {1, 0, 1}, {2, 7, 2}};
        int r = a.length;
        int c = a[0].length;
        int ind = 0;
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                if (a[i][j] == 0) {
//                    ind = i - 1;
//                    while (ind >= 0) {
//                        if (a[ind][j] != 0)
//                            a[ind][j] = -1;
//                        ind--;
//                    }
//                    ind = i + 1;
//                    while (ind < r) {
//                        if (a[ind][j] != 0)
//                            a[ind][j] = -1;
//                        ind++;
//                    }
//                    ind = j - 1;
//                    while (ind >= 0) {
//                        if (a[i][ind] != 0)
//                            a[i][ind] = -1;
//                        ind--;
//                    }
//                    ind = j + 1;
//                    while (ind < c) {
//                        if (a[i][ind] != 0)
//                            a[i][ind] = -1;
//                        ind++;
//                    }
//                }
//            }
//        }
//                for (int m = 0; m < r; m++) {
//                    for (int n = 0; n < c; n++) {
//                        if (a[m][n] == -1)
//                            a[m][n] = 0;
//                    }
//                }
        int[] d1=new int[r];
        int d2[]=new int[c];
        Arrays.fill(d1,-1);
        Arrays.fill(d2,-1);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]==0)
                {
                    d1[i]=0;
                    d2[j]=0;
                }
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(d1[i]==0|| d2[j]==0)
                    a[i][j]=0;
            }
        }
                for (int m = 0; m < r; m++) {
                    for (int n = 0; n < c; n++) {
                        System.out.print(" " +a[m][n]);
                    }
                    System.out.println(" ");
                }
            }
        }
