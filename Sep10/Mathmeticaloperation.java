/*write a program to create 4 methods a)Static method  with 2 integer arguements,b)Non static method with Double and integer arguements c)Static method with 2 double arguements d) main method
First method will perform multiplication operation, store the result in local variable and return the value
Second method will perform addition operation, store the result in local variable and return the value
Third method will perform Subtraction operation, store the result in local variable and return the value
call all the methods from main method and receive the result in local variables of main method and perform Addition by using all the results and print final result
*/






class Mathmeticaloperation
{
	public static int multiply(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public double add(double d,int e)
	{
		double f=d+e;
		return f;
	}
	public static double sub(double x,double y)
	{
		double z=x-y;
		return z;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int res1=multiply(7,8);
		Mathmeticaloperation O1=new Mathmeticaloperation();
		double res2=O1.add (5.5,6);
		double res3=sub(9.8,7.8);
		double finalresult=res1+res2+res3;
		System.out.println(finalresult);
	}
}
