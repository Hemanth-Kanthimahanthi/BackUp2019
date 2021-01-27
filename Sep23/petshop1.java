
/*

Constructor: It is one type of method which can executed whenever Object is created.Constructor name must be similar to class name.

CONSTRUCTOR OVERLOADING:
						Multiple Constructors developed inside the same class is called Constructor overloading.
*/




class Dog1
{
	String name;
	public Dog1()
	{
		this.name="SRAVANI";
	}
	public Dog1(String name)
	{
		this.name=name;
	}
}
class petshop1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Dog1 d1=new Dog1();
		Dog1 d2=new Dog1();
		Dog1 d3=new Dog1("PREETHI");
		Dog1 d4=new Dog1();
		Dog1 d5=new Dog1("BUDDY");
		System.out.println(d1.name);
		System.out.println(d2.name);
		System.out.println(d3.name);
		System.out.println(d4.name);
		System.out.println(d5.name);
	}
}

