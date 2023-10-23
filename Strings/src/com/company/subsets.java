package com.company;

public class subsets {
    public static void main(String[] args) {
        String s="FUN";
        int len=s.length();
        int temp=0;
        String[] s1=new String[len*(len+1)/2];
        String s3=" ";
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                s3=s.substring(i,j+1);
                s1[temp]=s3;
                temp++;
            }
        }
        for(int i=0;i<s1.length;i++)
        {
            System.out.println(s1[i]);
        }
    }
}
