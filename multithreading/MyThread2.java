class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
{
System.out.println("child thread");
}
}
}
class MyThread2 N
{
	public static void main(String[] args)
	{
		MyRunnable r=new MyRunnable();// creating myrunnable object
		Thread t=new Thread(r); // r is target runnable
		t.start();
		for(int i=0;i<10;i++)
{
System.out.println("main thread");
}
	}
}