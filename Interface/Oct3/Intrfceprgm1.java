
/*

	Basic Interface program

*/

interface Demo1
{
	void test1();
}
class Sample1 implements Demo1
{
	public void test1()
	{
		System.out.println("In Test1...............");
	}
}
class Intrfceprgm1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Sample1 rs1=new Sample1();
		rs1.test1();
	}
}
