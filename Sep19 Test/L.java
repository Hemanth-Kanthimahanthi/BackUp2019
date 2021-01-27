/*
Take 3 integer inputs, if sum of the three integers is even number,perform addition operation. if the sum of the 3 integer numbers is odd then perform multiplication operation for the three numbers
Develop a Non static method for the above requirement 
Print the results by using concatination
*/




class L
{
	int i=2;
	int j=3;
	int k=4;
	int sum=i+j+k;
	public void even()
	{
		if(sum % 2==0)
		{
			System.out.println(sum);
		}
		else
		{
			int multiply=i*j*k;
			System.out.println(multiply);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		L l1=new L();
		l1.even();
	}
}
