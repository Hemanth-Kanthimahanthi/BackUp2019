
/*

	An Interface can implement two implementation classes


*/

interface Demo2
{
	void test2();
}
class Sample2 implements Demo2
{
	public void test2()
	{
		System.out.println("Test a Chemistry experiment...............");
	}
}
class Sample3 implements Demo2
{
	public void test2()
	{
		System.out.println("Test a Physics experiment...............");
	}
}
class Intrfceprgm2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Sample2 rs1=new Sample2();
		rs1.test2();
		Sample3 rs2=new Sample3();
		rs2.test2();
	}
}
