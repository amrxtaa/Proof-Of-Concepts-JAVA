package com.company;

public class divide {
    public static void main(String[] args) {
String s="aaaabbbbccccdddd";
int l=s.length();
int n=4;
int cha=l/n; int temp=0;
String s2=" ";
String[] s1=new String[n];
for(int i=0;i<l;i=i+cha)
        {
            s2=s.substring(i, i+cha);
            s1[temp]=s2;
            temp++;
        }
for(int i=0;i<s1.length;i++)
{
    System.out.println(s1[i]);
}
    }
}
