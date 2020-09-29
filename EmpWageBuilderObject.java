public class EmpWageBuilderObject
{
	public static void main(String args[])
	{
	 //constants
	 int FULLTIME=1;
	 int EMP_RATE_PER_HOUR=20;
	 //variables
	 int empHours=0;
	 int empWage=0;
 	 int empCheck=(int)(Math.random()*10)%2;
	 if(empCheck==FULLTIME)
		empHours=8;
	 else
	        empHours=0;
	 empWage=empHours*EMP_RATE_PER_HOUR;
	 System.out.println("Employee Wage :"+empWage);
	}
}
