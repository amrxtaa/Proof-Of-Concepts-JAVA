package com.company;
import java.util.*;

public class sortcolors {
    public static void main(String[] args) {
        int a[] = new int[]{0, 2, 1, 2, 0};
       /* Arrays.sort(a);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]); // O(nlogn)
        */
        int low = 0;
        int mid = a[0];
        int temp;
        int high = a.length - 1;
        while (mid <= high) {
            switch (a[mid]) {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = a[high];
                    a[high] = a[mid];
                    a[mid] = temp;
                    mid++;
                    high--;
                    break;
                }

            }
        }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]);
    }
}
