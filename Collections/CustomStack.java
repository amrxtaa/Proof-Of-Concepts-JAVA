public class CustomStack {
    int[] data;
    static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size)
    {
        this.data=new int[size];
    }
    public boolean push(int item) throws StackException
    {
        if(isFull())
        {
            throw new StackException("stack is full");
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("stack is empty");

        }
        int r=data[ptr];
        ptr--;
                return r;
    }
    public boolean isFull()
    {
        return ptr==data.length-1;
    }
    public boolean isEmpty()
    {
        return ptr==-1;
    }
    public int peek() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("cannot peek");
        }
        return data[ptr];
    }
}
class DynamicStack extends CustomStack
{
    public DynamicStack()
    {
        super();
    }
    public DynamicStack(int size)
    {
        super(size);
    }


    public boolean push(int item) throws StackException
    {
        if(this.isFull())
        {
            int[] temp=new int[data.length*2];
            for(int i=0;i<10;i++)
            {
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
class StackException extends Exception
{
    StackException(String m)
    {
        super(m);
    }
}
class StackMain
{
    public static void main(String[] args) throws StackException {
        //CustomStack c=new CustomStack();
        DynamicStack c=new DynamicStack();
        c.push(10);
        c.push(20);
        c.push(30);
        c.push(50);
        c.push(60);
        c.push(150);
        c.push(990);
        System.out.println(c.peek());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());

    }
}
/* 990
990
150
60
50
30
20
10
Exception in thread "main" StackException: stack is empty.

 */