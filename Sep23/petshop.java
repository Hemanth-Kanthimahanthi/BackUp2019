
/*

Constructor: It is one type of method which can executed whenever Object is created.Constructor name must be similar to class name.


*/




class Dog
{
	String name;
	public Dog()
	{
		this.name="SRAVANI";
	}
}
class petshop
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Dog d1=new Dog();
		Dog d2=new Dog();
		System.out.println(d1.name);
		System.out.println(d2.name);
	}
}

