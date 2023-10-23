class LLinsert {// my two variables or pointers should be of Node type only
    private Node head;
    private Node tail;// to point to the last element in the list
    private Node temp;
private int size;

public LLinsert()
{

    this.size=0;
}
    // the structure of my Node object should be like this
    private class Node {
        private String data;
        private Node next;
        Node(String data, Node next) {
            this.data = data;
            this.next = next;
            size++;// every new node's next value will be null by default, and witj the type opf value passed.
        }

        Node(String data) {
            this.data = data;
            this.next = next;
            size++;
        }
    }

//adding the elements in the first position
    public void addf(String data) {
        Node nnode = new Node(data);
        if (head == null) {
            head = nnode;
            return;
        }
        nnode.next = head;
        head = nnode;
    }
    //adding the elements at the last of the list
    public void addl(String data) {
        Node nnode = new Node(data);
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
        // the function to add the last element with complexity O(1)
    // not correct answer
        public void insertl(String data)// O(1)
        {
            if(tail==null)
            {
                addf(data);
                return;
            }
            Node n=new Node(data);
            tail.next=n;
            tail=n;
            size+=1;
        }
    // to get the node at a specific index
    public void addl2(String data)
    {
         if(tail==null)
         {
             addf(data);
             return;
         }
         Node node=new Node(data);
         tail.next=node;
         tail=node;
    }

//printing the value of the nmodes
    public void print() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;


        }
        System.out.println("NULL");
    }

//adding the elements at a particular position
    public void addr(String data, int i)
    {
        if(i==0) {
            addf(data);
            return;
        }
             if(i==size)
         {
             addl(data);
             return;
         }
             else
                 temp=head;
             for(int j=1;j<i;j++)
             {
                 temp=temp.next;
    }
             Node node=new Node(data, temp.next);
             temp.next=node;
    }
    public int getSize()
    {
        return size;
    }

    public static void main(String[] args) {
        LLinsert list = new LLinsert();
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to enter which must be a String");
        String n = sc.nextLine();
        list.addf(n);
        System.out.println("choice factor");
        System.out.println("do you want to insert more elements in the list if yes:y else: n");
        char c = sc.next().charAt(0);
        if (c == 'y') {
            System.out.println("creating another node for the list");
            System.out.println("enter the value");
            String n1 = sc.nextLine();
            list.addf(n1);
        }
            System.out.println("the list is");
            list.print();
            System.out.println("inserting the element at the last");
            list.addl("Ajita");
        */
    list.addf("and ");
    list.addf("amrita");
    list.print();

    list.addl("Ajita");
    list.addr("hii", 0);
    list.print();
        list.addl2("Anurag");// not correct answer
        list.print();
    System.out.println("the size is  "+list.getSize());
    }
    }
