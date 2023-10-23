package arrays;
import java.util.*;
public class pascals_Traingle {
    public static void main(String[] args) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> row, prev=null;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(prev.get(j - 1) + prev.get(j));
            }
                    prev = row;
                    res.add(row);

            }

            for (int k = 0; k< res.size(); k++) {
                for (int m= 0; m < res.get(k).size(); m++) {
                    System.out.print(res.get(k).get(m) + " ");
                }
                System.out.println();
            }

        }

    }


