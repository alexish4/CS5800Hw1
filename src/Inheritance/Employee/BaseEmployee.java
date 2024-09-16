package Inheritance.Employee;

public class BaseEmployee extends Employee {
    private double base_salary;

    public BaseEmployee(String first_name, String last_name, String social_security_number, double base_salary) {
        super(first_name, last_name, social_security_number);
        this.base_salary = base_salary;
    }

    public BaseEmployee() {
        super();
    }

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }
}
