/*
Write a program for below requirements
a)write a program for developer &
	Developer charecterstics are 
		(i) ID
		(ii) Name
		(iii) Salary
		(iiii) Language

b)write a program for Test Engineer &
	Test Engineer charecterstics are 
		(i) ID
		(ii) Name
		(iii) Salary
		(iiii) Type of Testing
Create a method to display Developer information
Create a method to display Test Engineer information
Developers & Test Engineers are available in IT company.
Create a Developer & Test Engineer and display their information.
*/


class Emp
{
	int Id;
	String name;
	double sal;
	static String Companyname="CG";
	public Emp(int Id,String name,double sal)
	{
		this.Id=Id;
		this.name=name;
		this.sal=sal;
	}
	public void Empinfo()
	{
		System.out.println("ID  :"+this.Id);
		System.out.println("Name  :"+this.name);
		System.out.println("Salary :"+this.sal);
		System.out.println("Company Name :"+emp.Companyname);
	}
}
class Developer extends Emp
{
	String lang;
	public Developer(int Id,String name,double sal,String lang)
	{
		super(Id,name,sal);
		this.lang=lang;
	}
	public void Devinfo()
	{
		System.out.println("Language  :"+this.lang);
	}
}
class Testengg extends Emp
{
	String TOT;
	public Testengg(int Id,String name,double sal,String TOT)
	{
		super(Id,name,sal);
		this.TOT=TOT;
	}
	public void Testengginfo()
	{
		System.out.println("Type of Testing :"+this.TOT);
	}
}
class Inhprg
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Developer d1=new Developer(10125,"NagaRaju",50000,Java);
		d1.Devinfo();
		Testengg T1=new Testengg(10145,"Sri Charan",85000,Manual);
		T1.Testengginfo();
	}
}
