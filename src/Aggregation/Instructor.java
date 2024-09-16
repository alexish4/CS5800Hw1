package Aggregation;

public class Instructor {
    private String first_name;
    private String last_name;

    private String office_number; //could have a dash or letter

    public Instructor(String first_name, String last_name, String office_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.office_number = office_number;
    }

    public Instructor() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getOffice_number() {
        return office_number;
    }

    public void setOffice_number(String office_number) {
        this.office_number = office_number;
    }
}
