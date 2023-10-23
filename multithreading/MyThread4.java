class MyThread extends Thread
{
}
class MyThread4
{
public static void main(String[] args)
{
System.out.println(Thread.currentThread().getName());
MyThread t=new MyThread();
System.out.println(t.getName());
Thread.currentThread().setName("AMRITA");
System.out.println(Thread.currentThread().getName());
}
}
