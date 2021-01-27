/* Write a program to create Non Static variable & Static method
1)Create 3 objects inside the Static method & access Non Static variable
2)Create a Main method and call the static method
Draw the diagram to understand point 1 and point 4
*/




class Test3
{
	 int x=14710260;
	public static void three()
	{
		Test3 rs1=new Test3();
		Test3 rs2=new Test3();
		Test3 rs3=new Test3();
		System.out.println(rs1.x);
		System.out.println(rs2.x);
		System.out.println(rs3.x);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		three();
	}
}
