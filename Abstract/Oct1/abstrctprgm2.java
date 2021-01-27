






abstract class A
{
	abstract public void talk();
	
	abstract public void give();
}
abstract class B extends A
{
	public void talk()
	{
		System.out.println("talk a sec with next person");
	}
	abstract public void give();
}
class C extends B
{
	public void give()
	{
		System.out.println("Before talking give a speech about your next person");
	}
}
class abstrctprgm2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		C c1=new C();
		c1.talk();
		c1.give();
	}
}
