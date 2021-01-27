class rect
{
	int l;
	int w;
	public rect(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	public void findarea()
	{
		int area=l*w;
		System.out.println("Area of Rectangle is"+ area);
	}
}