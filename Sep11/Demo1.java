/*write a program to create  a)Global variable(non-static) b)main method
Acess Global Variable inside main method for printing*/






class Demo1
{
		double k=2.8;
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo1 obj=new Demo1();
		System.out.println(obj.k);
	}
}

