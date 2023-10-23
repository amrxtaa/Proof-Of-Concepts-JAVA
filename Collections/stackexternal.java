import java.util.*;
public class stackexternal
{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(80);
        System.out.println(s);
        System.out.println(s.search(10));
        System.out.println(s.search(80));
        System.out.println(s.search(800));
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        //s.pop();
        //s.peek();
    }
}
