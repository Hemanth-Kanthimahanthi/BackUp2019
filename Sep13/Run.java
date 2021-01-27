/*
Copies of Static & Non Static members
*/

class Run
{
	static int z=123;
	int y=456;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(z);
		Run r1=new Run();
		Run r2=new Run();
		Run r3=new Run();
		System.out.println(r1.y);
		System.out.println(r2.y);
		System.out.println(r3.y);
	}
}
