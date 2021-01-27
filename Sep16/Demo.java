/* Write a program for below requirements
A) Create a Static variable
B) Create a Static Method
C) Create a Non Static Method
D) Create a Main Method
E) Re initialise Static variable inside Static method. Re initialise Non-Static variable with in Static method.
Inside Mainmethod follow the steps
a)Print Static variable
b)Call Non Static Method
c)Call Static Method
d)Call Non Static Method
e)Print Static variable
Draw Execution Diagram
*/


class Demo
{
	static String S="HEMANTH";
	public static void test()
	{
		S="SREEKAR";
	}
	public void develop()
	{
		S="RAMA CHANDRA KASHYAP";
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(S);
		Demo D1=new Demo();
		D1.develop();
		test();
		Demo D2=new Demo();
		D2.develop();
		System.out.println(S);
	}
}
