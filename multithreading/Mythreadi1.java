class MyThread extends Thread
{
public void run()
{
	System.out.println("child thread");
try{
for(int i=0;i<10;i++)
{
System.out.println("let me sleep, pleasee");
Thread.sleep(2000);
}
}
catch(InterruptedException e)
{
	System.out.println("ugghhh..fuck off");
}
}
}
class MyThreadi1
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		t.interrupt();
		System.out.println("tera baap aaya");
	}
}