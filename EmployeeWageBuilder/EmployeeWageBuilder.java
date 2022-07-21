package EmployeeWageBuilder;

public class EmployeeWageBuilder {
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
//    public static final int EMP_RATE_PER_HOUR = 20;
//    public static final int NUM_OF_WORKING_DAYS = 2;
//    public static final int MAX_HOURS_IN_MONTH = 10;

    public static computeEmpWageForCompany(String company, int empRate, int numOfDays, int maxHrs) {

       int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays){
            totalWorkingDays++;

            int empCheck = (int Math.floor(Math.random()*10)%3;

            switch(empCheck){
                case PART_TIME :
                    empHrs = 4;
                    break;
                case FULL_TIME:
                    empHrs = 8;
                default:
                    empHrs = 0;
                }

                    totalEmpHrs += empHrs;
                    System.out.println("Days : " + totalWorkingDays + "  Emp hrs: " +empHrs);

            }
                int totalEmpWage = totalEmpHrs * empRate;
                    System.out.println("total Emp Wage For Company : "+ company + " is : " +totalEmpWage);
                    return totalEmpWage;
        }
                 public static void main(String[] args) {
                    computeEmpWageForCompany("Dmart", 20, 2, 10);
                    computeEmpWageForCompany("Relience", 10, 4, 20);
    }

}


