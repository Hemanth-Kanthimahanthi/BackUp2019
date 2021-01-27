/*Write a program for below requirements
a)Two Static variables
b)Two Non-Static variables
c)Main method
Access all the 4 variables from main method
*/


class Demo
{
	static int x=25;
	static double y=25.25;
	char ch='H';
	String a="Hemanth";
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(x);
		System.out.println(y);
		Demo d1=new Demo();
		System.out.println(d1.ch);
		System.out.println(d1.a);
	}
}
