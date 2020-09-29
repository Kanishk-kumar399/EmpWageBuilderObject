public class EmpWageBuilderObject
{
	public static void main(String args[])
	{
	 //constants
	 int FULLTIME=1;
 	 int empCheck=(int)(Math.random()*10)%2;
	 if(empCheck==FULLTIME)
		System.out.println("Employee is Present");
	 else
		System.out.println("Employee is Absent");
	}
}
