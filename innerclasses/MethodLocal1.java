class MethodLocal1
{
	public void m1()
	{
		class Inner
		{
			public void m2()
			{
				System.out.println("inner class m2()");
			}
		}
	Inner i=new Inner();
	i.m2();
}
public static void main(String[] args)
{
	MethodLocal1 l=new MethodLocal1();
	l.m1();
}
}
