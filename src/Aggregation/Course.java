package Aggregation;

public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name) {
        this.name = name;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void printCourseInfo() {
        System.out.println("Name: " + name);
        System.out.println("Instructor: " + instructor.getFirst_name()
                + " " + instructor.getLast_name());
        System.out.println("Textbook: " + textbook);
    }
}
