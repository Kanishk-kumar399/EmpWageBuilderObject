public class EmpWageBuilderObject
{
 	 static final int PARTTIME=1;
	 static final int FULLTIME=2;
         static final int EMP_RATE_PER_HOUR=20;
	 static final int NUMBER_OF_WORKDAYS=20;
	 static final int MAXIMUM_WORKING_HOURS=100;
       	 public static void main(String args[])
	 {
	  //variables
	  int empHours=0;
	  int totalHours=0;
	  int totalWorkingDays=0;
	  while(totalHours<=MAXIMUM_WORKING_HOURS && totalWorkingDays<NUMBER_OF_WORKDAYS)
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
	    int totalWage=totalHours*EMP_RATE_PER_HOUR;
	   System.out.println("Total Employee Wage :"+totalWage);
         }
}
