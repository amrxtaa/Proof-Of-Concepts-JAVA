import java.util.*;
public class StackALL {
    ArrayList l = new ArrayList();

    public void push(Object data) {
        l.add(data);
    }

    public boolean isEmpty() {
        return l.size() == 0;
    }

    public Object pop() {
        if (isEmpty()) {
            return false;
        }
        Object top = l.remove(l.size() - 1);
        return top;
    }

    public Object peek() {
        if (isEmpty())
            return false;
        return l.get(l.size() - 1);
    }

}
class Main
{
    public static void main(String[] args) {
    StackALL s=new StackALL();
    s.push(10);
    s.push(108);
    s.push("amritra");
    //s.push(100);

        System.out.println(s.peek());
        System.out.println(s.pop());


    }
}
