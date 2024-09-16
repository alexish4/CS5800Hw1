package Inheritance;

import Inheritance.Employee.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Inheritance {
    public static void main(String[] args) {
        employeeDriverProgram();
    }

    public static void employeeDriverProgram() {
        SalariedEmployee jj = new SalariedEmployee("Joe", "Jones",
                "111-11-1111", 2500.0);

        HourlyEmployee ss = new HourlyEmployee("Stephanie", "Smith",
                "222-22-2222", 25.0, 32);
        HourlyEmployee mq = new HourlyEmployee();
        mq.setFirst_name("Mary");
        mq.setLast_name("Quinn");
        mq.setSocial_security_number("333-33-3333");
        mq.setWage(25.0);
        mq.setNumbers_of_hours_worked(47);

        CommisionEmployee nd = new CommisionEmployee("Nicole", "Dior",
                "444-44-4444", 15.0, 50000.0);

        SalariedEmployee rc = new SalariedEmployee();
        rc.setFirst_name("Renwa");
        rc.setLast_name("Chanel");
        rc.setSocial_security_number("555-55-5555");
        rc.setWeekly_salary(1700.0);

        BaseEmployee md = new BaseEmployee("Mike", "DavenPort", "666-66-6666", 95000.0);

        CommisionEmployee mv = new CommisionEmployee();
        mv.setFirst_name("Mike");
        mv.setLast_name("Chanel");
        mv.setSocial_security_number("555-55-5555");
        mv.setCommissionRate(22.0);
        mv.setGrossSalary(40000.0);

        System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-10s%-15s%-10s%n",
                "First Name", "Last Name", "Social Sec #", "Weekly-Salary", "Wage", "Hours", "Comm-Rate", "Gross-Salary", "Base-Salary");

        System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-10s%-15s%-10s%n",
                jj.getFirst_name(), jj.getLast_name(), jj.getSocial_security_number(), jj.getWeekly_salary(), "", "", "", "", "");

        System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-10s%-15s%-10s%n",
                ss.getFirst_name(), ss.getLast_name(), ss.getSocial_security_number(), "", ss.getWage(), ss.getNumbers_of_hours_worked(), "", "", "");

        System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-10s%-15s%-10s%n",
                mq.getFirst_name(), mq.getLast_name(), mq.getSocial_security_number(), "", mq.getWage(), mq.getNumbers_of_hours_worked(), "", "", "");

        System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-10s%-15s%-10s%n",
                nd.getFirst_name(), nd.getLast_name(), nd.getSocial_security_number(), "", "", "", nd.getCommission_rate(), nd.getGrossSalary(), "");

        System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-10s%-15s%-10s%n",
                rc.getFirst_name(), rc.getLast_name(), rc.getSocial_security_number(), rc.getWeekly_salary(), "", "", "", "", "");

        System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-10s%-15s%-10s%n",
                md.getFirst_name(), md.getLast_name(), md.getSocial_security_number(), "", "", "", "", "", md.getBase_salary());

        System.out.format("%-15s%-15s%-15s%-15s%-10s%-10s%-10s%-15s%-10s%n",
                mv.getFirst_name(), mv.getLast_name(), mv.getSocial_security_number(), "", "", "", mv.getCommission_rate(), mv.getGrossSalary(), "");

    }
}