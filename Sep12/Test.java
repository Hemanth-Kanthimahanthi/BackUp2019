/*Write a program to create 3 methods
a)Static method
b)Non-Static method
c)Main method
Call both the methods from main method
*/



class Test
{
	public static void climb()
	{
		System.out.println("Climb a Hill to the top.");
	}
	public void see()
	{
		System.out.println('&');
		System.out.println("See the view from the top");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		climb();
		Test t1=new Test();
		t1.see();
	}
}
