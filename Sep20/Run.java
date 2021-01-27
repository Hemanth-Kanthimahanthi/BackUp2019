/*

			Second level of coding

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
		circle K=new circle();
		circle L=new circle();
		K.r=2;
		L.r=3;
		K.findarea();
		L.findarea();
		rectangle Q=new rectangle();
		rectangle R=new rectangle();
		Q.l=1;
		Q.w=8;
		R.l=2;
		R.l=6;
		Q.getarea();
		R.getarea();
	}
}
