class MyThread extends Thread
{
public void run()
{
System.out.println("child thread");
}
}
class MyThread3 
{
	public static void main(String[] args)
	{
 MyThread t=new MyThread();
 Thread t1=new Thread(t);// t is the MyThread object
 t1.start();
 System.out.println("main thread");
 }
}