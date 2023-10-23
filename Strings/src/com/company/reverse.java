package com.company;

public class reverse {
    public static void main(String[] args) {
        String s="amrita";
        String s1=" ";
        for(int i=s.length();i>0;i--)
        {
            System.out.print(s.charAt(i-1));
            String rev="";
            rev+=s.charAt(i-1);
        }
    }
}
