
/*
Write a program which has complete & incomplete method
*/





abstract class Demo
{
	abstract public void take();

}
abstract class Run extends Demo
{
	
}
class Test extends Run
{
	public void walk()
	{
		System.out.println("Walk along a track in KBN park");	
	}
}
class abstrctprgm1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test t1=new Test();
		t1.walk();
	}
}
