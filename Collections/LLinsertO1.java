public class LLinsertO1 {

   private Node head;
    private Node tail;

    private int size;
    public LLinsertO1()
    {
        this.size=0;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" ->");
            temp=temp.next;
        }
        System.out.println("end");
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
    public void insertl(int val)// O(1)
    {
        if(tail==null)
        {
            insertf(val);
            return;
        }
        Node n=new Node(val);
        tail.next=n;
        tail=n;
        size+=1;
    }
    public static void main(String[] args) {
        LLinsertO1 l=new LLinsertO1();
        l.insertf(23);
        l.insertf(67);
        l.display();
        l.insertl(90);
        l.display();
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



}
