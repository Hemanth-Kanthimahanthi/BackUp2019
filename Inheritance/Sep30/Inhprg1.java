
/*

			METHOD OVERRIDING

*/



class Sample
{
	public void fly()
	{
		System.out.println("Fly in Aeroplane");
	}
}
class Demo extends Sample
{
	public void fly()
	{
		System.out.println("Fly in Private jet");
	}
}
class Inhprg1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Demo d1=new Demo();
		d1.fly();
	}
}
