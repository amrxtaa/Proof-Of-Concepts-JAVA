import java.sql.SQLOutput;
import java.util.*;
import java.util.HashMap;

public class largest_subarray_with_sum_zero {
    public static void main(String[] args) {
        int[] a={9,-3,3,-1,6,-5};
        System.out.println(solve(a));
        System.out.println(maxLen(a));
    }
    static int solve(int[] a)
    {
        int max=0;
        for(int i=0;i<a.length;i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {

                sum += a[j];
                if (sum == 0) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }return max;
        }
        static int maxLen(int[] a)
        {
            HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
            int max=0;
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                sum+=a[i];
                if(sum==0)
                    max=i+1;
                else {
                    if (h.get(sum) != null) {
                        max = Math.max(max, i - h.get(sum));
                    } else {
                        h.put(sum, i);
                    }
                }
            }
            return max;
        }
    }

