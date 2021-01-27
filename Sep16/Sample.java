/*
INSTANCE VARIABLE
*/


class  Sample
{
	double y=2.5;
	public void walk()
	{
		System.out.println(this.y);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Sample S=new Sample();
		Sample T=new Sample();
		S.walk();
		T.walk();
		T.y=5.3;
		S.walk();
		T.walk();
	}
}
