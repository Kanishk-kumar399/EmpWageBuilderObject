public class EmpWageBuilderObject
{
	public static void main(String args[])
	{
	 //constants
	 int PARTTIME=1;
	 int FULLTIME=2;
	 int EMP_RATE_PER_HOUR=20;
	 //variables
	 int empHours=0;
	 int empWage=0;
 	 int empCheck=(int)(Math.random()*10)%3;
	 if(empCheck==FULLTIME)
		empHours=8;
	 else if(empCheck==PARTTIME)
	        empHours=4;
	 else
	 	empHours=0;
	 empWage=empHours*EMP_RATE_PER_HOUR;
	 System.out.println("Employee Wage :"+empWage);
	}
}
