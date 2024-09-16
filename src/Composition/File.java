package Composition;

public class File {
    private String name;

    public File(String fileName) {
        this.name = fileName;
    }

    public File() {
    }

    public String getName() {
        return name;
    }

    public void setName(String fileName) {
        this.name = fileName;
    }
}
