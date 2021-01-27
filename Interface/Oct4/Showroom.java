
/*

			STANDARDISATION AND SPECIFICATION
*/





interface bike
{
	void start();
	void noise();
}
class Herohonda implements bike
{
	public void start()
	{
		System.out.println("Start Herohonda	through Kickstart");
	}
	public void noise()
	{
		System.out.println("ggggggggggggggggggggggg");
	}
}
class Duke implements bike
{
	public void start()
	{
		System.out.println("Start Duke throgh Selfstart");
	}
	public void noise()
	{
		System.out.println("ghar ghar ghar ghar................");
	}
}
class Royalenfield implements bike
{
	public void start()
	{
		System.out.println("Start Royalenfield through Kickstart or Selfstart as you like");
	}
	public void noise()
	{
		System.out.println("da da da da da da.............");
	}
}
class Showroom
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Herohonda h1=new Herohonda();
		h1.start();
		h1.noise();
		Duke d1=new Duke();
		d1.start();
		d1.noise();
		Royalenfield r1=new Royalenfield();
		r1.start();
		r1.noise();
	}
}
