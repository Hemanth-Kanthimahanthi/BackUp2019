/* Write a program for the below requirements
a)Static variable
b)Static method
c)Non Static Method
d)Main method
Access Static variable from Static method as well as Non Static method
Call both the methods from main method
Draw the diagram to understand point 1 and point 4
*/




class Test
{
	static char ch='S';
	public static void pool()
	{
		System.out.println(ch);
	}
	public void swim()
	{
		System.out.println(ch);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		pool();
		Test a1=new Test();
		a1.swim();
	}
}
