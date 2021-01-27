
/*


							"An Interface can inherit Multiple Inheritance"
			

*/


interface D
{
	void run1();
}
interface E extends D
{
	void run2();
}
interface F extends D,E
{
	void run3();
}
class G implements F
{
	public void run1()
	{
		System.out.println("Run 1.............");
	}
	public void run2()
	{
		System.out.println("Run 2............");
	}
	public void run3()
	{
		System.out.println("Run 3............");
	}
} 
class Intrfceprgm4 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		G g1=new G();
		g1.run1();
		g1.run2();
		g1.run3();
	}
}
