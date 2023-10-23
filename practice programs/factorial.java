public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
 /*   static int fact(int n)
    {
        if(n==0)
          return 1;
        else
             return n * (fact(n-1));
    }
    */

  static int fact(int n)
  {
      int ans=1;
      for(int i=1;i<=n;i++)
      {
          ans=ans*i;
      }
      return ans;
  }
}
