package Composition;
import java.util.ArrayList;

public class Folder {
    private String folder_name;

    private int treeLevelRelativeToParent = 0;

    ArrayList<Folder> subfolders = new ArrayList<>();
    ArrayList<File> files = new ArrayList<>();

    public Folder(String folderName) {
        this.folder_name = folderName;
    }

    public Folder() {
    }

    public ArrayList<Folder> getSubfolders() {
        return subfolders;
    }

    public void setSubfolders(ArrayList<Folder> subfolders) {
        this.subfolders = subfolders;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }

    public String getFolder_name() {
        return folder_name;
    }

    public void setFolder_name(String folder_name) {
        this.folder_name = folder_name;
    }

    public Folder addSubFolder(String subFolderName) {
        Folder newSubFolder = new Folder(subFolderName);
        subfolders.add(newSubFolder);
        return newSubFolder;
    }
    public void removeSubFolder(Folder folder) {
        subfolders.remove(folder);
    }

    public File addFile(String fileName) {
        File newFile = new File(fileName);
        files.add(newFile);
        return newFile;
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public int getTreeLevelRelativeToParent() {
        return treeLevelRelativeToParent;
    }

    public void setTreeLevelRelativeToParent(int treeLevelRelativeToParent) {
        this.treeLevelRelativeToParent = treeLevelRelativeToParent;
    }

    public void printFolderTree() {
        System.out.println(folder_name + "/");
        for(Folder folder : subfolders) {
            System.out.print("---");
            for(int i = 0; i < treeLevelRelativeToParent; i++)
                System.out.print("---");
            folder.setTreeLevelRelativeToParent(treeLevelRelativeToParent + 1);
            folder.printFolderTree();
        }
        for(File file : files) {
            for(int i = 0; i < treeLevelRelativeToParent; i++)
                System.out.print("---");
            System.out.println("---" + file.getName());
        }
    }
}
