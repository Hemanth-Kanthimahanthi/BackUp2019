
/*


Create an Interface ,Create a complete class and create another class which can implement as well as extend			

*/


interface L
{
	void download();
}
class M 
{
	public void music()
	{
		System.out.println("Download Music file using Internet");
	}
}
class N extends M implements L
{
	public void download()
	{
		System.out.println("Download Hallticket from University website");
	}
} 
class Intrfceasgnmnt2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		N n1=new N();		
		n1.music();
		n1.download();
	}
}

/*

		"A class can extends as well as implements"				

*/