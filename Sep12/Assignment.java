/*Write a program for below requirements 
a)Create 3 methods Static, Non-Static & main methods
b)Each method will have local variable 
Print the local variable with in the method
Call both the methods from main method &
Draw the Executin diagram
*/





class Assignment 
{
	public static void Employee()
	{
		String s="Rama Chandra";
		System.out.println(s);
	}
	public void age()
	{
		int k=20;
		System.out.println(k);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Employee();
		Assignment a1=new Assignment();
		a1.age();
	}
}
