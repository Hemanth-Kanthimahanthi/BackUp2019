/* Write a program for below requirements
A) Create a Static variable
B) Create a Static Method
C) Create a Non Static Method
D) Create a Main Method
E) Re initialise Static variable inside Static method. Print Static variable inside Non Static method.
F) Call Static and Non Static method from main method
*/





class Play
{
	static int x=489;
	public static void move()
	{
		x=789;
	}
	public void simple()
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(x);
		move();
		System.out.println(x);
		Play p1=new Play();
		p1.simple();
	}
}
