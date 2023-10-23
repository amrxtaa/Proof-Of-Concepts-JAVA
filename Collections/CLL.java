public class CLL {
    private Node head;
    private Node tail;
    public CLL()
    {
        this.head=null;
        this.tail=null;
    }
    public void insert(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display()
    {
        Node temp=head;
        if(head!=null) {
            do {
                    System.out.print(temp.val + " ->");
                    temp = temp.next;
                } while(temp != head);
            }
        System.out.println("head");

    }
    public void delete(int val) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        if (temp.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        // 1st approach
         /*do {
            Node temp1 = temp.next;
            if (temp1.val == val) {
                temp.next = temp1.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
    */
        do {
            //Node temp1 = temp.next;
            if (temp.next.val == val) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }
    class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
    }

    public static void main(String[] args) {
        CLL l=new CLL();
        l.insert(4);
        l.insert(23);
        l.insert(7);
        l.insert(90);
        l.display();
        l.delete(23);
        l.display();
    }
}
