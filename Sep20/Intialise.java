/*

			Third level of coding

*/





class circle
{
	int r;
	static double pi=3.14;
	public void findarea()
	{
		double area=pi*this.r*this.r;
		System.out.println("Area of circle="+area);
	}
} 
class rectangle
{
	int l;
	int w;
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
		circle C=new circle();
		circle D=new circle();
		C.findarea();
		D.findarea();
		rectangle A=new rectangle();
		rectangle B=new rectangle();
		A.getarea();
		B.getarea();
	}
}
