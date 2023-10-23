package com.company;

public class frequency {
    public static void main(String[] args) {

        int a[] = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int f[] = new int[a.length];
        int visited = -1;
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;

                }
            }
            if (f[i] != visited)
                f[i] = count;
        }
        for (int i = 0; i < f.length; i++) {
            if(f[i]!=visited)
            System.out.println(a[i] + "   " + f[i]);
        }
    }
}




























