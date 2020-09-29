public class EmpWageBuilderArray implements IFComputeEmpWage
{
 	 public static final int PARTTIME=1;
	 public static final int FULLTIME=2;

	 private int numOfCompany=0;
	 private CompanyEmpWage[] companyEmpWageArray;

	 public EmpWageBuilderArray()
	 {
  		companyEmpWageArray=new CompanyEmpWage[5];
	 }

	 private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkDays,int maxHoursMonth)
	 {
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkDays,maxHoursMonth);
		numOfCompany++;
	 }
	 private void computeEmpWage()
	 {
	 	for(int i=0;i<numOfCompany;i++)
		{
		 companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		 System.out.println(companyEmpWageArray[i]);
		}
	 }
	 private int computeEmpWage(CompanyEmpWage companyEmpWage)
	 {
	  //variables
	  int empHours=0;
	  int totalHours=0;
	  int totalWorkingDays=0;
	  while(totalHours<=companyEmpWage.maxHoursMonth && totalWorkingDays<companyEmpWage.numOfWorkDays)
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
	   return totalHours*companyEmpWage.empRatePerHour;
	 }

	public static void main(String args[])
	{
	EmpWageBuilderArray obj=new EmpWageBuilderArray();
	obj.addCompanyEmpWage("Dmart",20,2,10);
	obj.addCompanyEmpWage("Reliance",10,4,20);
	obj.computeEmpWage();
	}
}
