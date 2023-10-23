package com.company;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        // brut for approah
        String s = "TUF is great for interview preparation";
        System.out.println("After reversing words: ");
        System.out.println(s);
        s=s+" ";
        String s2=" ";
        Stack<String> s1=new Stack<String>();
        StringTokenizer st=new StringTokenizer(s, " ");
        if(st.hasMoreTokens())
        {
            s1.push(st.nextToken());
            s1.push(" ");
        }
        while (!s1.isEmpty())
        {s2+=s1.peek()+ " ";
        s1.pop();
        }
        System.out.println(s2);

    }
}
