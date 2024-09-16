package Inheritance.Employee;

public class Employee {
    protected String first_name, last_name;
    protected String social_security_number;

    public Employee(String first_name, String last_name, String social_security_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.social_security_number = social_security_number;
    }

    public Employee() {

    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setSocial_security_number(String social_security_number) {
        this.social_security_number = social_security_number;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getSocial_security_number() {
        return social_security_number;
    }
}
