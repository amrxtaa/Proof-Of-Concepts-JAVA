package recurrsion;

public class ntoone {
    public static void main(String[] args) {
        int n = 6;
        num(n);
        numrev(n);
    }

    static void num(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        num(n - 1);
    }

    static void numrev(int n) {
        if (n == 0)
            return;
        numrev(n-1);
        System.out.println(n);
    }
}
