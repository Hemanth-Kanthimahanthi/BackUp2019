

/*

				INHERITANCE PROGRAM @ 3
				
				
				
				HIERARICAL INHERITANCE

*/


class F
{
	int x;
	public F(int x)
	{
		this.x=x;
	}
}
class G extends F
{
	double y;
	public G(int x,double y)
	{
		super(x);
		this.y=y;
	}
}
class H extends F
{
	double z;
	public H(int x,double z)
	{
		super(x);
		this.z=z;
	}
}
class Inher3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		F a1=new F(5);
		G b1=new G(7,8.8);
		H c1=new H(4,6.6);
		System.out.println(a1.x);
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(c1.x);
		System.out.println(c1.z);
	}
}
