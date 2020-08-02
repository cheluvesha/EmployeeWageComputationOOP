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
