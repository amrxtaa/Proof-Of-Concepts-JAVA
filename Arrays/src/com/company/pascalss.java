package com.company;
import java.util.*;

public class pascalss {
    public static void main(String[] args) {
//        List<List<Integer>> res=new ArrayList<List<Integer>>();
//        List<Integer> row, pre=null;
//        int n=5,i, j;
//        for(i=0;i<n;++i)
//        {
//            row=new ArrayList<Integer>();
//            for(j=0;j<=i;++j) {
//                if (j == 0 || j == i)
//                    row.add(1);
//                else
//                    row.add(pre.get(j - 1) + pre.get(j));
//            }
//                pre=row;
//                res.add(row);
//            }
//
//        for (int k = 0; k< res.size(); k++) {
//            for (int m= 0; m < res.get(k).size(); m++) {
//                System.out.print(res.get(k).get(m) + " ");
//            }
//            System.out.println();
//        }
//    }
        int n = 5;
        int dp[][] = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" "+dp[i][j]);
            }
            System.out.println(" ");
        }
    }
}

