

/*

				INHERITANCE PROGRAM @ 2

*/


class C
{
	int x;
	public C(int x)
	{
		this.x=x;
	}
}
class D extends C
{
	double y;
	public D(int x,double y)
	{
		super(x);
		this.y=y;
	}
}
class E extends D
{
	int z;
	public E(int x,double y,int z)
	{
		super(x,y);
		this.z=z;
	}
}
class Inher2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		C a1=new C(5);
		D b1=new D(7,8.8);
		E c1=new E(4,5.5,6);
		System.out.println(a1.x);
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
	}
}
