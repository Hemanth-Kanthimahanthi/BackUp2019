class tri
{
	int b;
	int h;
	public tri(int b,int h)
	{
		this.b=b;
		this.h=h;
	}
	public void findarea()
	{
		double area=0.15*b*h;
		System.out.println("Area of Triangle is"+ area);
	}
}