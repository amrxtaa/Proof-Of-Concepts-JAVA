package com.company;
import java.util.*;
public class missingno {
    public static void main(String[] args) {
        int ar[] = {3, 0, 1};
        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != i)
                System.out.println(i);
        }
    }
}
