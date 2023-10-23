
import java.util.ArrayList;

public class commbetweenclasses {
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        m1(al);
        System.out.println(al);
        al.add("shh");// compile time error
    }
    public static void m1(ArrayList al)
    {
        al.add("amrita");
    }
}
