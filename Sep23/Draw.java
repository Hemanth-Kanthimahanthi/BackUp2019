
/*

			Third level of coding

*/





class circle
{
	int r;
	static double pi=3.14;
	public circle()
	{
		this.r=7;
	}
	public circle(int r)
	{
		this.r=r;
	}
	public void findarea()

	{
		double area=pi*this.r*this.r;
		System.out.println("Area of circle =" + area);
	}
}
class rect
{
	int l;
	int w;
	public rect()
	{
		this.l=5;
		this.w=8;
	}
	public rect(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	public void getarea()
	{
		int area=this.l*this.w;
		System.out.println("Area of Rectangle ="+ area);
	}
}
class Draw
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		circle c1=new circle();
		circle c2=new circle(2);
		c1.findarea();
		c2.findarea();
		rect r1=new rect();
		rect r2=new rect(8,9);
		r1.getarea();
		r2.getarea();
	}
}
