import java.util.*; // complexity is O(sqrt(n) else O(n)
public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int range = s.nextInt();
        for (int i = 2; i <= range; i++) {
            boolean ans = (isprime(i));
            if (ans)
                System.out.print(i+" ");
        }
    }

    static boolean isprime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
