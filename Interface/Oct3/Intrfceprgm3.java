
/*


		An Interface can extends another interface
			
			

*/


interface A
{
	void run1();
}
interface B extends A
{
	void run2();
}
class C implements B
{
	public void run1()
	{
		System.out.println("Run 3 miles a day in the early Morning");
	}
	public void run2()
	{
		System.out.println("Run Marathon");
	}
} 
class Intrfceprgm3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		C c1=new C();
		c1.run1();
		c1.run2();
	}
}
