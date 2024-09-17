package Aggregation;

public class Aggregation {
    public static void main(String[] args) {
        aggregationDriverProgram();
    }

    public static void aggregationDriverProgram() {
        Course ase = new Course("Advanced Software Engineering");
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook clean_code = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
        ase.addInstructor(nima);
        ase.addTextbook(clean_code);

        ase.printCourseInfo();

        Instructor sean = new Instructor("Sean", "Archer", "3-2699");
        Textbook design_patterns = new Textbook("Design Patterns", "Erich Gamma", "Pearson");

        ase.addInstructor(sean);
        ase.addTextbook(design_patterns);

        System.out.println();
        ase.printCourseInfo();


    }
}
