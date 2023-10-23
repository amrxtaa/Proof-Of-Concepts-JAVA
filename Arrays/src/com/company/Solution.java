//
//package com.company;
//import java.util.*;
//
//public class Solution {
//     public static int  find(Vegetables arr[],int r )
//     {
//         int n=arr.length;
//         int s=0;
//         int p=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++)
//         {
//             if ((arr[i].getRate() > r)
//
//            p=arr[i].getPrice();
//             }
//         return tmp;
//         }
//    public static void main(String[] args)
//    {
//        Scanner s=new Scanner(System.in);
//        Vegetables arr[];
//        arr=new Vegetables[2];
//        for(int i=0;i<2;i++)
//        {
//            int id=s.nextInt();
//            int price=s.nextInt();
//            String name=s.nextLine();
//            int rating=s.nextInt();
//            arr[i]=new Vegetables(id, price, name, rating);
//        }
//        int r=s.nextInt();
//        Vegetables tmp=find(arr, r);
//        if(tmp==null)
//            System.out.println("p");
//        else
//            System.out.println(tmp.getId());
//    }
//
//}
//class Vegetables
//{
//    int id;
//    int price;
//    String name;
//    int rating;
//    Vegetables(int i, int p, String n,int r )
//    {
//        id=i;
//        price=p;
//        name=n;
//        rating=r;
//    }
//    public int getRate()
//    {
//        return rating;
//    }
//    public int getPrice()
//    {
//        return price;
//    }
//    public int getId()
//    {
//        return id;
//    }
//}
