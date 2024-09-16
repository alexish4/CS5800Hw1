package Inheritance.Employee;

public class CommisionEmployee extends Employee {
    private double commission_rate;
    private double gross_salary;

    public CommisionEmployee(String first_name, String last_name, String social_security_number, double commission_rate, double gross_salary) {
        super(first_name, last_name, social_security_number);
        this.commission_rate = commission_rate;
        this.gross_salary = gross_salary;
    }

    public CommisionEmployee() {
        super();
    }

    public void setCommissionRate(double commission_rate) {
        this.commission_rate = commission_rate;
    }
    public double getCommission_rate() {
        return commission_rate;
    }
    public void setGrossSalary(double gross_salary) {
        this.gross_salary = gross_salary;
    }
    public double getGrossSalary() {
        return  gross_salary;
    }
}
