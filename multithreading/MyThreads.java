class MyThreads
{
public static void main(String[] args) throws InterruptedException
{
	for(int i=0;i<10;i++)
	{
System.out.println("SLIDE "+i);
Thread.currentThread().sleep(2000);
}
}
}