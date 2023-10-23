class Cat
{
	int j;
	Cat(int j)// pointing to j
	{
		this.j=j;
	}
}
class Dog implements Cloneable
{
	int i;
	Cat c;
	Dog(Cat c,int i)//pointing to ref. variable c and i
	{
		this.c=c;
		this.i=i;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();//object class clone() called here i.e. Shallowcloning 
	}
}
class ShallowCloning
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
	Cat c=new Cat(20);
	Dog d1=new Dog(c,10);
	System.out.println(d1.i+"----------"+d1.c.j);
	Dog d2=(Dog)d1.clone();
	d2.i=888;
	d2.c.j=999;
	System.out.println(d1.i+"----------"+d2.c.j+ "======"+d1.c.j);
}
}
	
