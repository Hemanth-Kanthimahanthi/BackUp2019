/* Write a program for below requirements
A) Create a Non Static variable
B) Create a Non Static Method
C) Create a Non Static Method
D) Create a Main Method
E) Re initialise Non Static variable inside 2nd Non Static method. Print Non-Static variable inside 1st Non Static method.
Inside Mainmethod follow the steps
i)Create 2 objects
ii)From 1st object Call 2nd Non Static method.
iii)From 1st object Call 1st Non Static method.
iv)From 2nd object Call 1st Non Static method.
Draw Execution Diagram and Note down the OUTPUT
*/


class  Assignment
{
	int x=147852;
	public void take()
	{
		System.out.println(this.x);
	}
	public void care()
	{
		this.x=258741;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Assignment A=new Assignment();
		Assignment B=new Assignment();
		A.care();
		A.take();
		B.take();
	}
}
