

/*

			INTERVIEW PROCESS PROGRAM

*/



class Interview
{
	String name;
	String emailId;
	String batchcode;
	String company1;
	String company2;
	String company3;
	public Interview(String name,String emailId,String batchcode,String company1)
	{
		this.name=name;
		this.emailId=emailId;
		this.batchcode=batchcode;
		this.company1=company1;
	}
	public Interview(String name,String emailId,String batchcode,String company1,String company2)
	{
		this(name,emailId,batchcode,company1);
		this.company2=company2;
	}
	public Interview(String name,String emailId,String batchcode,String company1,String company2,String company3)
	{
		this(name,emailId,batchcode,company1,company2);
		this.company3=company3;
	}
	public void Interviewinfo()
	{
		System.out.println("===================================================================================");
		System.out.println("Name       :" +this.name);
		System.out.println("Email ID   :" +this.emailId);
		System.out.println("Batch Code :" +this.batchcode);
		if (company1 !=null)
		{
			System.out.println("Company 1  :" +this.company1);
		}
		if (company2 !=null)
		{
			System.out.println("Company 2  :" +this.company2);
		}
		if (company3 !=null)
		{
			System.out.println("Company 3  :" +this.company3);
		}
		System.out.println("===================================================================================");

	}
}
class Interviewprocess
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Interview I1=new Interview("Varun","var24@gmail.com","BB3","CAPGEMINI");
		Interview I2=new Interview("Ravi","ravi12@gmail.com","BB3","CAPGEMINI","VALUE MOMENTUM");
		Interview I3=new Interview("Rahul","rahu89@gmail.com","BB3","CAPGEMINI","VALUE MOMENTUM","TCS");
		I1.Interviewinfo();
		I2.Interviewinfo();
		I3.Interviewinfo();
	}
}
