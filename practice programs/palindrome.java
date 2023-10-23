public class palindrome {
    public static void main(String[] args) {
        String n="151";
        /*int original=n;
        int rev, sum=0;
        while(n>0)
        {
             rev= n%10;
            sum=(sum*10)+rev;
            n=n/10;
        }
        if(original==sum)
            System.out.println("yess");
        else
            System.out.println("noo");
*/

        String rev="";
        int len=n.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+n.charAt(i);
        }
        if(rev.equals(n))
            System.out.println("uyess");
        else
            System.out.println("noo");
            }
}
