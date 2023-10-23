package recurrsion;

public class binary_search {
    public static void main(String[] args) {
        int [] A={ 1, 2, 3, 4, 66, 78};
        int t=66;
        System.out.println(search(A, t, 0, A.length-1));
    }
    static int search(int[] A, int target, int s, int e)
    {
        if(s>e)
            return -1;
        int m=s+(e-s)/2;
        if(target==A[m])
            return m+1;
        if(target<A[m])  {
            return search(A, target, s, m-1);
        }
        return search(A, target, m+1, e);
    }
}
