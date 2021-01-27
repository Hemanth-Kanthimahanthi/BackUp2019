/*
		DRAWING APPLICATIONS

*/



class circle
{
	int r=5;
	static double pi=3.14;
	public void Carea()
	{
		double Area1=pi*r*r;
		System.out.println(Area1);
	}
}
class rectangle
{
	int l=5;
	int w=6;
	public void Rarea()
	{
		int Area2=l*w;
		System.out.println(Area2);
	}
}
class Total
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		circle A1=new circle();
		A1.Carea();
		rectangle R1=new rectangle();
		R1.Rarea();
	}
}
