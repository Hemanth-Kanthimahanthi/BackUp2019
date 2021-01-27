/* Write a program for the below requirements
a)Static variable & Non Static variable
b)Static method & Non Static Method
c)Main method
d)Create Local variable within main method & print it.
Access Static variable within Static method.
Access Non Static variable within Non Static method
Call both the methods from main method
Draw the Execution diagram
*/




class Demo
{
	static double a=5.4;
	boolean b=true;
	public static void ja()
	{
		System.out.println(a);
	}
	public void va()
	{
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int x=145963;
		System.out.println(x);
		ja();
		Demo d=new Demo();
		d.va();
	}
}
