package Composition;

public class File {
    private String name;

    public File(String file_name) {
        this.name = file_name;
    }

    public File() {
    }

    public String getName() {
        return name;
    }

    public void setName(String file_name) {
        this.name = file_name;
    }
}
