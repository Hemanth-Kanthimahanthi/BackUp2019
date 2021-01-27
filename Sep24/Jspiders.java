/*
Write a program for a student
Student characterstics are
1.Id 2.Name 3.10th % 4.Inter %
5.Degree% 6.Masters%
create a method to display student details
Note: Some students are Degree holders
      Some students are Master Degree holders
Students are available in J spiders
Create a 1 Degree holder student, 1 Master degree holder student and Display them 
*/


class Student
{
	String I;
	String J;
	double x;
	double y;
	double z;
	double k;
	public Student(String I,String J,double x,double y,double z)
	{
		this.I=I;
		this.J=J;
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public Student(String I,String J,double x,double y,double z,double k)
	{
		this.I=I;
		this.J=J;
		this.x=x;
		this.y=y;
		this.z=z;
		this.k=k;
	}
	public void Details()
	{
		System.out.println("================================================================");
		System.out.println("ID      :"+this.I);
		System.out.println("Name    :"+this.J);
		System.out.println("10th    :"+this.x);
		System.out.println("Inter   :"+this.y);
		System.out.println("Degree  :"+this.z);
		System.out.println("Masters :"+this.k);
		System.out.println("================================================================");
	}
}
class 
Jspiders
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Student S1=new Student("14H71A0261","SuRyA",78,80.1,67.34);
		Student S2=new Student("14H71A0262","VaIsHaLi",97,94.3,85.58,80.23);
		S1.Details();
		S2.Details();
	}
}






/*	

			OUTPUT

Hello World!
================================================================
ID      :14H71A0261
Name    :SuRyA
10th    :78.0
Inter   :80.1
Degree  :67.34
Masters :0.0
================================================================
================================================================
ID      :14H71A0262
Name    :VaIsHaLi
10th    :97.0
Inter   :94.3
Degree  :85.58
Masters :80.23
================================================================

*/
