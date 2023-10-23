

public class DLL {
    Node head;
   private int size;
   class Node {
        int value;
        Node next;
        Node prev;

        Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
            size++;
        }

        Node(int value) {
            this.value = value;
            size++;
        }
    }
    // finding the node which has this particular value
    public Node find(int val)
    {
        Node temp1=head;
        while(temp1!=null) {
            if (temp1.value == val) {
                return temp1;
            }
            temp1 = temp1.next;
        }
            return null;
        }
        // insertion at the beginning
        public void insertb(int value) {
            Node n = new Node(value);
            n.next = head;
            n.prev = null;
            if (head != null) {
                head.prev = n;
            }
            head = n;
        }
        // printing my list
        public void print() {
            Node temp = head;
            Node last=null;
            while (temp != null) {
                System.out.print(temp.value + " ->");
                last=temp;
                temp = temp.next;
            }
            System.out.println("END");
            while(last !=null)
            {
                System.out.print(last.value+" ->");
                last=last.prev;
            }
            System.out.println("start");
        }
        // insetiong at the last
        public void insertl(int value)
        {
            Node n=new Node(value);
            Node temp;
            temp=head;
            if(head==null)
            {
                n.prev=null;
                head=n;
            }
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n;
            n.prev=temp;
        }
        // inserting at the specified index
        public void insertr(int value, int index)
        {
            Node temp=head;
            if(index==0)
            {
                insertb(value);
                return;
            }
            if(index==size)
            {
                 insertl(value);
                 return;
            }
            for(int i=1;i<index;i++)
            {
                temp=temp.next;
            }
            Node n=new Node(value, temp.next,temp);
            temp.next.prev=n;
            temp.next=n;
            }
    // inserting a node after a node that is given
    public void insertat(int after, int value)
    {
        Node temp=find(after);
        if(temp==null)
        {
            System.out.println("does not exist");
        }
        Node n=new Node(value);
        n.next=temp.next;
        temp.next=n;
        n.prev=temp;
        if(n.next!=null)
        {
            n.next.prev=n;
        }
    }  public int deleteb() {
       Node tail;
        int val= head.value;
        head=head.next;
        head.prev=null;
        if(head==null)
        {
            tail=head;
        }
        size--;
        return val;
    }
   public int deletel()
   {
       int val= head.value;
       Node temp=head;
       Node tail;
       while(temp.next!=null)
       {
           temp=temp.next;
       }
       temp=temp.prev;
       temp.next=null;
       if(head==null)
       {
           tail=head;
       }
       size--;
       return val;
   }
   public Node get(int index)
   {
       Node temp1=head;
       for(int i=1;i<index;i++)
       {
           temp1=temp1.next;
       }
       return temp1;
   }
   public int delete(int index) {
       if (index == 0) {
           return deleteb();
       }
       else if(index==size-1)
       {
           return deletel();
       }
       Node temp=get(index-1);
       int val=temp.next.value;
       temp.next=temp.next.next;
       return val;
   }
    public int getSize()
    {
        return size;
    }

    public static void main(String[] args) {
            DLL l1 = new DLL();
            l1.insertb(10);
            l1.insertb(5);
            l1.insertb(2);
            l1.print();
            l1.insertl(20);
            l1.print();
            l1.insertr(0, 0);
            l1.print();
            l1.insertat(5, 78);
            l1.print();
            l1. deleteb();
            l1.print();
            l1. deletel();
            l1.print();
            l1.delete(0);
            l1.print();
        l1. delete(3);
        l1.print();
        System.out.println("getSize is "+l1.getSize());
        }
    }


