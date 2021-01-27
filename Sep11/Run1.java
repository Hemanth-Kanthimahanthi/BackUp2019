/*write a program to create  a)static variable & Non static variable b)static method & Non static method c)main method
Acess Static Variable inside Static method
Acess Non Static Variable inside Non Static method
Acess Static Variable & Non Static method in main METHOD
*/






class Run1
{
	static int a=250;
	double b=250.25;
	public static void test()
	{
		System.out.println(a);
	}
	public void java()
	{
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		test();
		Run1 obj=new Run1();
		obj.java();
	}
}

