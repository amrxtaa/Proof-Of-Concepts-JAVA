class MethodLocal3
{
	public static void m1(){
int x=10;
final int y=20;
		class Inner
		{
			public void m2()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}
	Inner i=new Inner();
	i.m2();
}
public static void main(String[] args)
{
	MethodLocal3 l=new MethodLocal3();
	l.m1();
}
}
