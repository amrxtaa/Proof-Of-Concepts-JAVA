import java.util.Scanner;

public class twosum {
        public int[] twoSum(int[] nums, int target) {
            int i,j;
            for(i=0;i<nums.length;i++)
            {
                for (j=i+1;j<nums.length; j++)
                {
                    if (nums[i]+nums[j]==target)
                        return new int[]{i,j};
                }
            }
            return new int[2];
        }
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("enter the length of the array");
            int n=s.nextInt();
            System.out.println("Enter the array");
            int[] nums=new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.print(s.nextInt());
            }
            System.out.println("enter the target element");
            int target=s.nextInt();
            twosum t=new twosum();
            System.out.print(t.twoSum(nums, target));
    }
}
