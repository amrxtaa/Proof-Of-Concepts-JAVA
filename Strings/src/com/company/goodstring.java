package com.company;

import java.util.HashMap;

public class goodstring {
    public static void main(String[] args) {
        String str = "aaabbbcc";
        HashMap<Character, Integer> m = new HashMap<>();
        char s1[] =str.toCharArray();
        int f[]= new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(m.containsKey(s1[i]))
            m.put(s1[i],m.get(s1[i])+1);
                else
                    m.put(s1[i],1);
        }
        System.out.println(m);
        
    }
}

