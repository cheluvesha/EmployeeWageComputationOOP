"Welcome to Employee wage computation using OOPs concepts"
//UC-1

import java.lang.*;
class EmployeeAttendance{
        final static int present=1;
public void checkAttendance(){
        int check=(int)(Math.floor(Math.random()*10)%2);
        if(present==check)
        System.out.println("Present");
        else
        System.out.println("Not Present");
}
}

public class Attendance{
public static void main(String args[]){
        EmployeeAttendance attendance=new EmployeeAttendance();
        attendance.checkAttendance();
}
}

//UC-2

class DailyWage{
        final int present=1;
        int salary=0;
        final int empRatePerHour=20;
        final int empHours=8;
public void employeeWage(){
        int check=(int)(Math.floor(Math.random()*10)%2);
        if(present==check){
                salary=empRatePerHour*empHours;
                System.out.println(salary);
            }
        else{
                System.out.println(salary);
                }
}
}

public class DailyEmpWage{
public static void main(String args[]){
        DailyWage dailywage=new DailyWage();
        dailywage.employeeWage();
}
}

//UC-3

class Wage{
        final int partTime=0;
        int salary=0;
        final int empRatePerHour=20;
        int empHours;
public void calculateWage(){
        int check=(int)(Math.floor(Math.random()*10)%2);
        if(partTime==check){
             empHours=4;
         }
         else{
             empHours=8;
         }
         salary=empRatePerHour*empHours;
         System.out.println(salary);
}
}

public class PartAndFullTimeWage{
public static void main(String args[]){
        Wage wage=new Wage();
        wage.calculateWage();
}
}

//UC-4

class SwitchCaseWage{
        final static int isPartTime=0;
        final static int isFullTime=1;
        int salary=0;
        int empRatePerHour=20;
        int empHours;
public void calculate(){
        int check=(int)(Math.floor(Math.random()*10)%2);
        switch(check){
                case isPartTime :
                        empHours=4;
                        break;
                case isFullTime :
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
       salary=empRatePerHour*empHours;
       System.out.println(salary);
}
}

public class WageUsingSwitch{
public static void main(String aargs[]){
        SwitchCaseWage wage=new SwitchCaseWage();
        wage.calculate();
}
}

//UC-5

class Wage{
        final static int isPartTime=0;
        final static int isFullTime=1;
        int salary=0;
        final int empRatePerHour=20;
        int empHours;
        final int numberOfWorkingDays=20;
        int totalSalary=0;
public void calculate(){
                for(int day=1;day<=numberOfWorkingDays;day++){
                int check=(int)(Math.floor(Math.random()*10)%2);
                switch(check){
                case isPartTime:
                        empHours=4;
                        break;
                case isFullTime :
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
                salary=empRatePerHour*empHours;
                totalSalary+=salary;
                 }
                System.out.println("Total wage for 20 days: "+totalSalary);
}
}

public class WagesForMonth{
public static void main(String args[]){
        Wage wage=new Wage();
        wage.calculate();
}
}

//UC-6

class Wage{
        final int isPartTime=0;
        final int isFullTime=1;
        final int empRatePerHour=20;
        final int totalDays=20;
        final int totalHours=100;
public void calculate(){
        int hours=0;
        int days=0;
        int salary=0;
        int empHours;
        int totalSalary=0;
        while(hours<=totalHours && days<totalDays){
              int check=(int)(Math.floor(Math.random()*10)%2);
                switch(check){
                case isPartTime:
                        empHours=4;
                        break;
                case isFullTime:
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
                hours+=empHours;
                days+=1;
                salary=empRatePerHour*empHours;
                totalSalary=totalSalary+salary;
  }
                System.out.println(totalSalary);
}
}
public class WagesTillCondition{
public static void main(String args[]){
        Wage wage=new Wage();
        wage.calculate();
}
}

//UC-7

class WagesTillConditionRefactor{
        final static int isPartTime=0;
        final static int isFullTime=1;
        final static int empRatePerHour=20;
        final static int totalDays=20;
        final static int totalHours=100;
public static void calculate(){
        int hours=0;
        int days=0;
        int salary=0;
        int empHours;
        int totalSalary=0;
        while(hours<=totalHours && days<totalDays){
              int check=(int)(Math.floor(Math.random()*10)%2);
                switch(check){
                case isPartTime:
                        empHours=4;
                        break;
                case isFullTime:
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
                hours+=empHours;
                days+=1;
                salary=empRatePerHour*empHours;
                totalSalary=totalSalary+salary;
  }
                System.out.println(totalSalary);
}
public static void main(String args[]){
calculate();
}
}


//UC-8

class WagesTillConditionPM{
        final static int isPartTime=0;
        final static int isFullTime=1;
public static void calculate(String company,int empRatePerHour,int totalDays,int totalHours){
        int hours=0;
        int days=0;
        int empHours;
        while(hours<=totalHours && days<totalDays){
              int check=(int)(Math.floor(Math.random()*10)%2);
                switch(check){
                case isPartTime:
                        empHours=4;
                        break;
                case isFullTime:
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
                hours+=empHours;
                days+=1;
  }
        int totalEmpWage=hours*empRatePerHour;
                System.out.println("Total Salary for the "+company+" is: "+totalEmpWage);
}
public static void main(String args[]){
calculate("Dmart",15,21,80);
calculate("reliance",20,22,100);
}
}



//UC-9

class Wage{
        final int isPartTime=0;
        final int isFullTime=1;
        private int empRatePerHour;
        private int totalDays;
        private int totalHours;
        private String company;
        private int totalSalary;
        Wage(String company,int empRatePerHour,int totalDays,int totalHours){
        this.company=company;
        this.empRatePerHour=empRatePerHour;
        this.totalDays=totalDays;
        this.totalHours=totalHours;
        }
public void calculate(){
        int hours=0;
        int days=0;
        int salary=0;
        int empHours;
        while(hours<=totalHours && days<totalDays){
              int check=(int)(Math.floor(Math.random()*10)%2);
                switch(check){
                case isPartTime:
                        empHours=4;
                        break;
                case isFullTime:
                        empHours=8;
                        break;
                default :
                        empHours=0;
                }
                hours+=empHours;
                days+=1;
                salary=empRatePerHour*empHours;
                totalSalary=totalSalary+salary;
  }
}
public String toString(){
        return "Total Employee wage for " + company +" is " +totalSalary;
}
}
public class WagesForCompanies{
public static void main(String args[]){
        Wage dmart=new Wage("Dmart",20,21,80);
        Wage reliance=new Wage("Reliance",10,21,100);
        dmart.calculate();
	reliance.calculate();
        System.out.println(dmart);
        System.out.println(reliance);
}
}


//UC-10

public class CompanyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maximumHoursPerMonth;
	public int totalWage;
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maximumHoursPerMonth = maximumHoursPerMonth;
	}
	public void setTotalEmpWage(int totalWage){
		this.totalWage=totalWage;
	}
	public String toString() {
		return "Total Employee Wage for "+company+" is "+totalWage;
	}
}

public class EmployeeWageBuilder {
	public static final int isPartTime=0;
	public static final int isFullTime=1;
	private int numOfCompany;
	private CompanyEmpWage empWageArray[];
	public EmployeeWageBuilder() {
		empWageArray=new CompanyEmpWage[5];
	}
	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maximumHoursPerMonth) {
		empWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maximumHoursPerMonth);
		numOfCompany++;
	}
	private void computeEmpWage() {
		for(int i=0;i<numOfCompany;i++) {
			empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
			System.out.println(empWageArray[i]);
		}
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHours=0, totalEmpHours=0, totalWorkingDays=0;
		 while(totalEmpHours<=companyEmpWage.maximumHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays){
             int check=(int)(Math.floor(Math.random()*10)%2);
               switch(check){
               case isPartTime:
                       empHours=4;
                       break;
               case isFullTime:
                       empHours=8;
                       break;
               default :
                       empHours=0;
               }
               totalEmpHours+=empHours;
               totalWorkingDays+=1;
 }
		 return totalEmpHours * companyEmpWage.empRatePerHour;

	}
	public static void main(String args[]) {
		EmployeeWageBuilder employeeWageBuilder=new EmployeeWageBuilder();
		employeeWageBuilder.addCompanyEmpWage("Dmart", 15, 21, 80);
		employeeWageBuilder.addCompanyEmpWage("Reliance", 15, 22, 100);
		employeeWageBuilder.computeEmpWage();
		
	}
}

//UC-11

public interface IComputeWage {
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maximumHoursPerMonth);
	public void computeEmpWage();
}

public class CompanyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maximumHoursPerMonth;
	public int totalWage;
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maximumHoursPerMonth = maximumHoursPerMonth;
	}
	public void setTotalEmpWage(int totalWage){
		this.totalWage=totalWage;
	}
	public String toString() {
		return "Total Employee Wage for "+company+" is "+totalWage;
	}
}

public class EmployeeWageBuilder implements IComputeWage{
	public static final int isPartTime=0;
	public static final int isFullTime=1;
	private int numOfCompany;
	private CompanyEmpWage empWageArray[];
	public EmployeeWageBuilder() {
		empWageArray=new CompanyEmpWage[5];
	}
	@Override
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
		empWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maximumHoursPerMonth);
		numOfCompany++;
	}

	@Override
	public void computeEmpWage() {
		for(int i=0;i<numOfCompany;i++) {
			empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
			System.out.println(empWageArray[i]);
		}	
		
	}
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHours=0, totalEmpHours=0, totalWorkingDays=0;
		 while(totalEmpHours<=companyEmpWage.maximumHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays){
             int check=(int)(Math.floor(Math.random()*10)%2);
               switch(check){
               case isPartTime:
                       empHours=4;
                       break;
               case isFullTime:
                       empHours=8;
                       break;
               default :
                       empHours=0;
               }
               totalEmpHours+=empHours;
               totalWorkingDays+=1;
 }
		 return totalEmpHours * companyEmpWage.empRatePerHour;

	}
	public static void main(String args[]) {
		EmployeeWageBuilder employeeWageBuilder=new EmployeeWageBuilder();
		employeeWageBuilder.addCompanyEmpWage("Dmart", 15, 21, 80);
		employeeWageBuilder.addCompanyEmpWage("Reliance", 15, 22, 100);
		employeeWageBuilder.computeEmpWage();
		
	}

	
}
