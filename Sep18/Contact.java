/*
	CLASS 
			&
				OBJECT
*/




class Add
{
	String name="Sri Charan";
	public void contact()
	{
		System.out.println(name);
		System.out.println("Mno:8142182424");
	}
}
class Save
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Add C=new Add();
		C.contact();
	}
}
