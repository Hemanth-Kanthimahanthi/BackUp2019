

/*

			METHOD OVERRIDING

*/


class Test
{
	public void create()
	{
		System.out.println("Create a file in java folder and save it as Hemanth.java");
	}
}
class Develop extends Test
{
	
}
class Demo1 extends Develop
{
	public void create()
	{
		System.out.println("Create a another file in java folder and save it as Hemanth.java");
	}
}
class Inhprg2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		 Test t1=new Test();
		 t1.create();
		 Develop D=new Develop();
		 D.create();
         Demo1 d1=new Demo1();
		 d1.create();

	}
}
