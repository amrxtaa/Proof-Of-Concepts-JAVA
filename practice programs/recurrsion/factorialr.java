package recurrsion;

public class factorialr {
    public static void main(String[] args) {
        int n=7;
        System.out.println(fact(n));
    }
    static int fact(int n)
    {
        if(n==1)
            return 1;
        return n*fact(n-1);
    }
}
