class MyThread extends Thread
{
	static Thread mt;
public void run()
{
	try
	{
	mt.join();
	}
	catch(InterruptedException e)
	{
	}
    for(int i=0;i<10;i++)
	{
	System.out.println("SEETHA THREAD");
	
	}
}
}
class MyThreadj2
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread.mt=Thread.currentThread();
		MyThread t=new MyThread();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("RAMA THREAD");
			Thread.sleep(2000);
		}
	}
}