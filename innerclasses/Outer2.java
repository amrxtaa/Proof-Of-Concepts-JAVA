class Outer2
{
class Inner
{
 public void m1()
 {
 System.out.println("inner class method");
 }
}
public void m2()
{
	Inner i=new Inner();
	i.m1();
}
public static void main(String[] args)
{
	Outer2 o=new Outer2();
	o.m2();
}
}