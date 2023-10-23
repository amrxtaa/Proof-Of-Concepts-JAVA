public class duplicatesLL {

        private Node head;
        private Node tail;
        private int size;
        public duplicatesLL()
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
    {Node n=new Node(val);
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
       public void duplicates()
    {
         Node temp=head;
         while(temp.next!=null)
         {
             if(temp.value==temp.next.value)
             {
                 temp.next=temp.next.next;
                 size--;
             }
             else
             {
                 temp=temp.next;
             }
             tail=temp;

         }
    }
        public static void main(String[] args) {
            duplicatesLL l=new duplicatesLL();
            l.insertl(1);
            l.insertl(1);
            l.insertl(2);
            l.insertl(3);
            l.insertl(3);
            l.display();//1 ->1 ->2 ->3 ->3 ->

            l.duplicates();
            l.display();//1 ->2 ->3 ->
        }
    }


