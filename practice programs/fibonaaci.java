// next number is the sum of previous two numbers
//public class fibonaaci {
//    public static void main(String[] args) {
//  int n=8;
      /* if(n==0)
           System.out.println(0);
       else
       {
           int[] fib=new int[n+1];
           fib[0]=0;
           fib[1]=1;
           for(int i=2;i<=n;i++)
           {
               fib[i]=fib[i-2]+fib[i-1];
           }
           for(int j=0;j<=n;j++)
           {
               System.out.print(fib[j]+" ");
           }

*/


//           int s1=0;
//           int s2=1; int temp;
//           System.out.print(s1+ " "+s2);
//           for(int i=2;i<=n;i++)
//           {
//               temp=s1+s2;
//               s1=s2;
//               s2=temp;
//               System.out.print(" "+temp);
//           }

//Fibonacci Series using Recursion
        class fibonacci
        {
            static int fib(int n)
            {
                if (n <= 1)
                    return n;
                return fib(n-1) + fib(n-2);
            }

            public static void main (String args[])
            {
                int n = 9;
                System.out.println(fib(n));

            }
    }

