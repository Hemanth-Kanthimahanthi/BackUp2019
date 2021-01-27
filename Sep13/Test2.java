/* Write a program for the below requirements
a)Non Static variable
b)Non Static method
c)Access Non Static variable inside Non Static method
Create Main method , Create 3 objects and call the method
Draw the diagram to understand point 2
*/




class Test2
{
	String s="Kiraak";
	public void create()
	{
		System.out.println(s);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test2 t1=new Test2();
		Test2 t2=new Test2();
		Test2 t3=new Test2();
		t1.create();
		t2.create();
		t2.create();
	}
}
