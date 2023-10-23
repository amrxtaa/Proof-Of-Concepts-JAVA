package com.company;

import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String s1="Brag";
        String s2="Grab";
        //int a[]=new int{1, 2, 3};
       // int a2[]=new int[]{1, 2, 3};
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length())
            System.out.println("not anagrams");
        else
        {
            char[] sc1=s1.toCharArray();
            char[] sc2=s2.toCharArray();
            Arrays.sort(sc1);
            Arrays.sort(sc2);
            if(Arrays.equals(sc1,sc2)){
            System.out.println("anagrams");
        }
        else
            System.out.println("not anagarms");
        }
    }
}
