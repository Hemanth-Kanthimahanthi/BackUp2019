






abstract class shape
{
	abstract public void circle();
	abstract public void rectangle();
	abstract public void triangle();
}
abstract class circle extends shape
{
	int r;
	static double pie=3.14;
	public void area(int r)
	{
		double area=pie*r*r;
		System.out.println("Area of Circle"+area);

	}
}

abstract class rectangle 
{
	int l;
	int w;
	public void area(int l,int w)
	{
		int area=l*w;
		System.out.println("Area of Rectangle"+area);				//Problem will be face  by developer //

	}
}
abstract class triangle
{
	int b;
	int h;
	public void area(int b,int h)
	{
		double area=0.15*b*h;
		System.out.println("Area of Triangle"+area);
	}
}
class Draw
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		circle.area(2);
		rectangle.area(3,4);
		triangle.area();
	}
}
