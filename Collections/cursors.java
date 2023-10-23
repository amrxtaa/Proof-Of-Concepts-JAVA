import java.util.*;

public class cursors {
    public static void main(String[] args)
    {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            a.add(i);
        }
        System.out.println(a);
        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            Integer I=(Integer)itr.next();
            if(I%2==0)
                System.out.println(I);
        }
    }

}
