package com.company;

public class count {
    public static void main(String[] args) {
        String s="Amrita"; int count=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
