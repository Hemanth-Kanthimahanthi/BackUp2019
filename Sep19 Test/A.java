
/*
Develop a Non static method to perform addition operation for two numbers and take the inputs  for the developed method as a part of Signature
the Developed method must return sum of 2 numbers whenever it is called
Print the result using concatination.
*/


class A 
{
	int x=8;
	int y=3;
	public void add()
	{
		int sum=x+y;
	}
    public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		A rs1=new A();
		rs1.add();
		System.out.println("Speed 1TB");
	}
}
