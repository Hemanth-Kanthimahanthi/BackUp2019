
/*

			first level of coding

*/





class circle
{
	int r=5;
	static double pi=3.14;
	public void findarea()
	{
		double area=pi*this.r*this.r;
		System.out.println("Area of circle="+area);
	}
} 
class rectangle
{
	int l=2;
	int w=3;
	public void getarea()
	{
		int area=this.l*this.w;
		System.out.println("Area of rectangle="+area);
	}
}
class Draw
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		circle c1=new circle();
		c1.findarea();
		rectangle r1=new rectangle();
		r1.getarea();
	}
}
