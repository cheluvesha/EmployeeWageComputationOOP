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



