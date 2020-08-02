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

