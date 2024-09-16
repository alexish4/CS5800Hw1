package Inheritance.Employee;

public class HourlyEmployee extends Employee {
    private double wage;
    private int numbers_of_hours_worked;

    public HourlyEmployee(String first_name, String last_name, String social_security_number, double wage, int numbers_of_hours_worked) {
        super(first_name, last_name, social_security_number);
        this.wage = wage;
        this.numbers_of_hours_worked = numbers_of_hours_worked;
    }

    public HourlyEmployee() {
        super();
    }

    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public int getNumbers_of_hours_worked() {
        return numbers_of_hours_worked;
    }
    public void setNumbers_of_hours_worked(int numbers_of_hours_worked) {
        this.numbers_of_hours_worked = numbers_of_hours_worked;
    }
}
