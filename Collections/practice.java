public class practice {
    private Node head;
     private Node tail;
     private Node temp;
     private Node prev;
     private int size;
    practice()
    {
        this.size=0;
    }
    private class Node
    {
        int val;
        Node next;
        Node (int val, Node next)
        {
            this.val=val;
            this.next=next;
            size++;
        }
        Node(int val)
        {
            this.val=val;
            this.next=next;
            size++;
        }
    }
    public void addf(int val)
    {
        Node n=new Node(val);
        n.next=head;
        head=n;
        if(tail==null)
        {
            tail=head;
            return;
        }
    }

    public void addl(int val)// O(n)
    {
        Node n=new Node(val);
        if(head==null)
        {
            addf(val);
            return;
        }
        temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
    }
    public void addl2(int val)
    {
        if(tail==null)
        {
            addf(val);
            return;
        }
        Node n=new Node(val);
        tail.next=n;
        tail=n;
        size++;
    }
    public void print()
    {
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"  ->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addi(int index,int val)
    {
        temp=head;
        if(index==1)
        {
            addf(val);
            return;
        }
        if(index==size)
        {
            addl(val);
            return;
        }
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node n=new Node(val,temp.next);
        temp.next=n;

    }
    public int getsize()
    {
        return size;
    }
public int deletef()
{
    int v=head.val;
    head=head.next;
    if(head==null)
    {
        tail=null;
    }
    size--;
    return v;
}
public int deletel()
{
    temp=head.next;
    prev=head;
    if(head.next==null)
    {
        head=null;
        return head.val;
    }

    while(temp.next!=null) {
        temp = temp.next;
        prev = prev.next;
    }
    int v=temp.val;
    prev.next=null;
    size--;
    return v;
}
public int deletei(int i)
{
    if(i==0)
    {
        deletef();
    }
    if(i==size-1)
    {
        deletel();
    }
    prev=get(i-1);
    int v=prev.next.val;
    prev.next=prev.next.next;
    size--;
    return v;
}
 public Node get(int index)
 {
     temp=head;
     for(int i=0;i<index;i++)
     {
         temp=temp.next;
     }
     return temp;
 }
    public static void main(String[] args) {
        practice p=new practice();
        p.addf(10);
        p.addf(20);
        p.addf(30);
        p.print();
        p.deletef();
        p.print();

        p.addf(100);
        p.addi(2, 0);
        p.print();
        p.addl2(200);
        p.print();
        p.deletel();
        p.deletei(2);
        p.print();
        System.out.println("the size is  "+p.getsize());
    }
}

