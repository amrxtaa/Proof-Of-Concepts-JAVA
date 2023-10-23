class Methodlocal
{
	public void m1()
	{
		class Inner
		{
			public void m2()
			{
				System.out.pritnln("inner class m2()");
			}
		}
	}
	Inner i=new Inner();
	i.m2();
public static void main(String[] args)
{
	Methodlocal l=new methodlocal();
	l.m1();
}
}
