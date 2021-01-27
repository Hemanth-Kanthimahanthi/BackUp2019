/* Write a program for below requirements
Requirement @ 1
A) Create 3 Classes
B) 1st Class will have Static and Non Static method
C) 2nd Class will have Static and Non Static variable
D) 3rd Class will have Static variable,Non Static variable,Static and Non Static method
Requirement @ 2
Create another Class for Main method and Access all the three class members
(i) Programming   (ii)Summary    (iii) Diagram
*/



class L
{
	public static void PK()
	{
		System.out.println("Hello World!");
	}
	public void KP()
	{
		System.out.println("Speed 1TB");
	}
}
class M
{
	static int x=27;
	double y=2.7;
}
class N
{
	static String s=("KILO");
	char ch='$';
	public static void HK()
	{
		System.out.println(s);
	}
	public void KH()
	{
		System.out.println(ch);
	}
}
class O
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		L.PK();
		L l1=new L();
		l1.KP();
		System.out.println(M.x);
		M m1=new M();
		System.out.println(m1.y);
		N.HK();
		N n1=new N();
		n1.KH();
	}
}
