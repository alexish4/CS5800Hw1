package Aggregation;
import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private ArrayList<Textbook> textbooks = new ArrayList<>();

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

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void setTextbooks(ArrayList<Textbook> textbooks) {
        this.textbooks = textbooks;
    }

    public Instructor addInstructor(Instructor instructor) {
        this.instructors.add(instructor);
        return instructor;
    }
    public Textbook addTextbook(Textbook textbook) {
        this.textbooks.add(textbook);
        return textbook;
    }
    public void removeInstructor(Instructor instructor) {
        this.instructors.remove(instructor);
    }
    public void removeTextbook(Textbook textbook) {
        this.textbooks.remove(textbook);
    }

    public void printCourseInfo() {
        System.out.println("Name: " + name);
        for (Instructor instructor : instructors) {
            System.out.println("Instructor: " + instructor.getFirst_name()
                    + " " + instructor.getLast_name());
        }
        for (Textbook textbook : textbooks) {
            System.out.println("Textbook: " + textbook);
        }
    }
}
