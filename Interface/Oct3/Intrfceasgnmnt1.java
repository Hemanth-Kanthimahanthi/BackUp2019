
/*


Write a program to create 2 interfaces & 1 implementation classes			

			

*/


interface I
{
	void create();
}
interface J
{
	void save();
}
class K implements I,J
{
	public void create()
	{
		System.out.println("Create a New File inside Workspace Folder ");
	}
	public void save()
	{
		System.out.println("Save the File and name the file as Raja");
	}
} 
class Intrfceasgnmnt1 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		K k1=new K();
		k1.create();
		k1.save();
	}
}


/*

																					"An class can implement multiple Interfaces"

*/