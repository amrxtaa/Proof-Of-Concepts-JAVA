package com.company;

public class duplicates {
    public static void main(String[] args) {
        int[] A = new int[]{10, 10, 50, 20, 40, 50};
        int l = A.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (A[i] == A[j])
                    System.out.println(A[i]);
            }
        }
    }
}
