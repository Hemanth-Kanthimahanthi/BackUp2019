

/*

				INHERITANCE PROGRAM @ 4
				
				
				
				HYBRID INHERITANCE

*/


class L
{
	double a;
	public L(double a)
	{
		this.a=a;
	}
}
class M extends L
{
	int b;
	public M(double a,int b)
	{
		super(a);
		this.b=b;
	}
}
class N extends L
{
	boolean c;
	public N(double a,boolean c)
	{
		super(a);
		this.c=c;
	}
}
class O extends N
{
	int d;
	public O(double a,boolean c,int d)
	{
		super(a,c);
		this.d=d;
	}
}
class Inher4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		L l1=new F(5.5);
		M m1=new M(8.8,7);
		N n1=new N(6.6,true);
		O o1=new O(9.9,false,45);
		System.out.println(l1.a);
		System.out.println(m1.a);
		System.out.println(m1.b);
		System.out.println(n1.a);
		System.out.println(n1.c);
		System.out.println(o1.a);
		System.out.println(o1.c);
		System.out.println(o1.d);
	}
}
