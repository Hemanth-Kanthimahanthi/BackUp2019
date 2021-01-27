

/*

			METHOD OVERRIDING

*/

                                                    
class Test1
{
	public void go()
	{
		System.out.println("GO GOA ");
	}
}
class Develop1 extends Test1
{
	public void go()
	{
		System.out.println("GO WENT GONE");
	}
}
class Run extends Develop1                                         
{

}
class Inhprg3
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		 Test1 t1=new Test1();
		 t1.go();
		 Develop1 D4=new Develop1();
		 D4.go();

	}
}
