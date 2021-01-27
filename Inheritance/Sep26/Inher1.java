

/*

				INHERITANCE PROGRAM @ 1

*/


class A
{
	int i;
	public A(int i)
	{
		this.i=i;
	}
}
class B extends A
{
	int j;
	public B(int i,int j)
	{
		super(i);
		this.j=j;
	}
}
class Inher1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A a1=new A(5);
		B b1=new B(7,8);
		System.out.println(a1.i);
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
