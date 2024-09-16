package Inheritance.Employee;

public class SalariedEmployee extends Employee {
    private double weekly_salary;

    public SalariedEmployee(String first_name, String last_name, String social_security_number, double weekly_salary) {
        super(first_name, last_name, social_security_number);
        this.weekly_salary = weekly_salary;
    }
    public SalariedEmployee() {
        super();
    }

    public double getWeekly_salary() {
        return weekly_salary;
    }
    public void setWeekly_salary(double weekly_salary) {
        this.weekly_salary = weekly_salary;
    }
}
