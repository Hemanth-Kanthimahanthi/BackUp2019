


/*

			CONSTRUCTOR CHAINING
					&
			CONSTRUCTOR NAVIGATOR
				EXAMPLE PROGRAM

*/





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
		this(l,w);
		this.h=h;
	}
	public void dimensions()
	{
		System.out.println("Length :"+this.l);
		System.out.println("Width  :"+this.w);
		System.out.println("Height :"+this.h);
	}
}

class furnitureshop
{
	public static void main(String[] args) 
	{
		System.out.println("Main Starts.........................");
		box b1=new box(7,8);
		box b2=new box(7,8,6);
		b1.dimensions();
		b2.dimensions();
		System.out.println("Main Ends...........................");
	}
}
