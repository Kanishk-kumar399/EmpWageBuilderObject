public class EmpWageBuilderObject
{
 	 static final int PARTTIME=1;
	 static final int FULLTIME=2;
       	 public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkDays,int maxHoursMonth)
	 {
	  //variables
	  int empHours=0;
	  int totalHours=0;
	  int totalWorkingDays=0;
	  while(totalHours<=maxHoursMonth && totalWorkingDays<numOfWorkDays)
	   {
	    totalWorkingDays++;
 	    int empCheck=(int)Math.floor(Math.random()*10)%3;
	    switch(empCheck)
	      {
		case FULLTIME:
	       	     empHours=8;
		     break;
	  	case PARTTIME:
	             empHours=4;
		     break;
		default:
	 	     empHours=0;
	      }
	    totalHours+=empHours;
	    System.out.println("Days :"+totalWorkingDays+" Hours :"+empHours);
	   }
	   int totalWage=totalHours*empRatePerHour;
	   System.out.println("Total Employee Wage for Company :"+company+" is :"+totalWage);
	   return totalWage;
         }
	public static void main(String args[])
	{
	computeEmpWage("Dmart",20,2,10);
	computeEmpWage("RelianceJio",10,4,22);
	}
}
