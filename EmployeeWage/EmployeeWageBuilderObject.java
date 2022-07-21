package com.EmployeeWage;

public class EmployeeWageBuilderObject {
    //Constant
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    //
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmployeeWageBuilderObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public static void main(String[] args) {

    EmployeeWageBuilderObject jio = new EmployeeWageBuilderObject("jio", 20, 2, 20);

    int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

            while(totalEmpHrs <=jio.maxHoursPerMonth &&totalWorkingDays< jio.numOfWorkingDays){

        totalWorkingDays++;

        int empCheck = (int) (Math.random() * 100) % 3;

        switch (empCheck) {
            case PART_TIME:
                empHrs = 4;
                break;
            case FULL_TIME:
                empHrs = 8;
            default:
                empHrs = 0;
        }

           totalEmpHrs += empHrs;
           System.out.println("Days : " + totalWorkingDays + "  Emp hrs: " + empHrs);

        }

            int totalEmpWage = totalEmpHrs * jio.empRatePerHour;
            System.out.println("total Emp Wage for Company: " + jio.company+ " is: "+totalEmpWage);

    }

}



