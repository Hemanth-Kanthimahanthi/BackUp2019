







class box
{
	int l;
	int w;
	int h;
	public box(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	public box(int l,int w,int h)
	{
		this.l=l;
		this.w=w;
		this.h=h;
	}
	public void dimensions()
	{
		System.out.println("*************************************");
		System.out.println("Length =" +this.l);
		System.out.println("Width  ="  +this.w);
		System.out.println("Height =" +this.h);
		System.out.println("*************************************");

	}
}
class Furnitureshop 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		box b1=new box(1,2);
		box b2=new box(7,8,9);
		b1.dimensions();
		b2.dimensions();
		
	}
}
