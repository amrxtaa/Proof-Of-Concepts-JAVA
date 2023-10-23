package com.company;

public class array_sorted_or_not {
    public static void main(String[] args) {
        int arr[]=new int[]{1,4,6,14,24,3};
        System.out.println(sorted(arr));
        System.out.println(sorted1(arr,0));
    }
    //using iteration
    static boolean sorted(int[] arr)
    {
        int i;
        for(i=0;i<=arr.length;i++)
        {
            if(i!=arr.length-1 && arr[i]<arr[i+1])
                continue;
                else
                    break;
        }
        i++;
        if(i==arr.length)
            return true;
        else
            return false;
    }
    //using recursion
static boolean sorted1(int[] arr, int i)
{
    if(i==arr.length)
        return true;
    return arr[i]<arr[i+1] && sorted1(arr, i+1);
}
}
