package Composition;

public class Composition {
    public static void main(String[] args) {
        folderDriverProgram();
    }
    public static void folderDriverProgram() {
        Folder php_demo1 = new Folder("php_demo1");

        Folder sourceFiles = php_demo1.addSubFolder(new Folder("Source Files"));
        Folder phalcon = sourceFiles.addSubFolder(new Folder(".phalcon"));
        Folder app = sourceFiles.addSubFolder(new Folder("app"));
        Folder config = app.addSubFolder(new Folder("config"));
        Folder controllers = app.addSubFolder(new Folder("controllers"));
        Folder library = app.addSubFolder(new Folder("library"));
        Folder migrations = app.addSubFolder(new Folder("migrations"));
        Folder models = app.addSubFolder(new Folder("models"));
        Folder views = app.addSubFolder(new Folder("views"));

        Folder cache = sourceFiles.addSubFolder(new Folder("cache"));
        Folder publicFolder = sourceFiles.addSubFolder(new Folder("public"));
        File htaccess = publicFolder.addFile(new File(".htaccess"));
        File htrouter = publicFolder.addFile(new File(".htrouter.php"));
        File indexHtml = publicFolder.addFile(new File("index.html"));

        Folder includePath = php_demo1.addSubFolder(new Folder("Include Path"));
        Folder remoteFiles = php_demo1.addSubFolder(new Folder("Remote Files"));

        php_demo1.printFolderTree();

        sourceFiles.removeSubFolder(app);

        System.out.println();
        php_demo1.printFolderTree();




    }
}
