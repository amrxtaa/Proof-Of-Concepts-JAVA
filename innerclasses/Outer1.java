class Outer1
{
class Inner
{
 public void m1()
 {
 System.out.println("inner class method");
 }
}
public static void main(String[] args)

{
	new Outer1().new Inner().m1();
}
}