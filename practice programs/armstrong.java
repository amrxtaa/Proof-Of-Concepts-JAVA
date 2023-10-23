public class armstrong {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int count=0;
        double rev=0;
        int t=n;
        while(temp!=0)
        {
            count++;
            temp/=10;
        }
        while(n!=0)
        {
            int d=n%10;
            rev=rev+Math.pow(d, count);
            n/=10;
        }
        if(rev==t)
            System.out.println("yess");
        else
            System.out.println("mo");
    }
}
