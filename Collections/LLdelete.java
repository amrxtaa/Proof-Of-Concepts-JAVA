// deletion operation in a linked list
public class LLdelete {
    Node head;
    Node tail;
    Node temp;
    private int size;

    LLdelete() {
        this.size = 0;
    }

    //structure of node should be like this
    class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
            size++;
        }

        Node(int value) {
            this.value = value;
            size++;
        }
    }
    public Node get(int index)
    {
        Node temp1=head;
        for(int i=0;i<index;i++)
        {
            temp1=temp1.next;
        }
        return temp1;
    }
    //adding the elements in the first position
    public void addf(int data) {
        Node nnode = new Node(data);
        if (head == null) {
            head = nnode;
            return;
        }
        nnode.next = head;
        head = nnode;
    }

    //adding the elements at the last of the list
    public void addl(int value) {
        Node nnode = new Node(value);
        if (head == null) {
            head = nnode;
            return;
        }
        temp = head;
        while (temp.next != null) // here the complexity is O(n) i can optimize this to O(1) if i declare another variable tail in the list which points to the last node of the list.
        {
            temp = temp.next;
        }
        temp.next = nnode;

    }

    //adding the elements at a particular position
    public void addr(int value, int i)
    {
        if(i==0) {
            addf(value);
            return;
        }
        if(i==size)
        {
            addl(value);
            return;
        }
        else
            temp=head;
        for(int j=1;j<i;j++)
        {
            temp=temp.next;
        }
        Node node=new Node(value, temp.next);
        temp.next=node;
    }

    //printing the value of the nmodes
    public void print() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.value+ " -->");
            temp = temp.next;


        }
        System.out.println("NULL");
    }
    //deleting the element at thefirst position of the linked list and then returning it
    public int delf() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int dell() {
        if (head == null) {
            System.out.println("the list is empty");
            return -1;
        }
        size--;
        if (head.next == null) {
            head = null;
            return head.value;
        }
        Node prev = head;
        Node temp = head.next;
        while (temp.next != null) {
            temp = temp.next;
            prev = prev.next;
        }
        int value = temp.value;
        prev.next = null;
        return value;
    }
    public int delr(int index)
    {
        if(index==0)
        {
            return delf();
        }
        if(index==size-1)
        {
            return dell();
        }
        Node prev=get(index-1);
        int value=prev.next.value;
        prev.next=prev.next.next;
        return value;
    }
    public int getSize()
    {
        return size;
    }

    public static void main(String[] args) {
        LLdelete list = new LLdelete();
        list.addf(10);
        list.addf(5);
        list.addf(4);
        list.addf(1);
        list.print();
        list.delf();
        list.print();
        list.addl(20);
        list.addr(0, 0);
        list.print();
        list.dell();
        list.print();
        list.delr(3);
        list.print();
        System.out.println("the size is  "+list.getSize());
        System.out.println();
    }
}

