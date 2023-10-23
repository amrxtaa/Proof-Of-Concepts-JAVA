public class mergetwosortedll {
    private Node head;
    private Node tail;
    private int size;
    public mergetwosortedll()
    {
        this.size=0;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" ->");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insertf(int val)
    {
       Node n=new Node(val);
        n.next=head;
        head=n;
        if(tail==null)
        {
            tail=head;
        }
        size+=1;
    }
    public void insertl(int value)// O(1)
    {
        if(tail==null)
        {
            insertf(value);
            return;
        }
        Node n=new Node(value);
        tail.next=n;
        tail=n;
        size+=1;
    }
    public static mergetwosortedll  merge(mergetwosortedll first, mergetwosortedll second)
    {
        mergetwosortedll ans=new mergetwosortedll();
        Node f=first.head;
        Node s=second.head;
        while(f!=null && s!=null) {
            if (f.value == s.value) {
                ans.insertl(f.value); // or s.value
            }
            if (f.value < s.value) {
                ans.insertl(f.value);
                f = f.next;
            } else {
                ans.insertl(s.value);
                s = s.next;
            }
        }
        while(f!=null)
        {
            ans.insertl(f.value);
            f=f.next;
        }
        while(s!=null)
        {
            ans.insertl(s.value);
            s=s.next;
        }
     return ans;
    }

    public static void main(String[] args) {
        mergetwosortedll l1=new mergetwosortedll();
        mergetwosortedll l2=new mergetwosortedll();
        l1.insertl(1);
        l1.insertl(3);
        l1.insertl(5);
        l2.insertl(1);
        l2.insertl(2);
        l2.insertl(9);
        l2.insertl(14);
        mergetwosortedll ans=mergetwosortedll.merge(l1, l2);
        ans.display(); // 1 ->1 ->1 ->2 ->3 ->5 ->9 ->14 ->
    }
}
