/*

          Accessing Static and Non Static members in Different classes

*/



class A
{
	static int x=45;
	double y=4.5;
} 
class B
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(A.x);
		A a1=new A();
		System.out.println(a1.y);
	}
}
