package Composition;

public class Composition {
    public static void main(String[] args) {
        folderDriverProgram();
    }
    public static void folderDriverProgram() {
        Folder php_demo1 = new Folder("php_demo1");
        Folder sourceFiles = php_demo1.addSubFolder("Source Files");
        Folder phalcon = sourceFiles.addSubFolder(".phalcon");
        Folder app = sourceFiles.addSubFolder("app");
        Folder config = app.addSubFolder("config");
        Folder controllers = app.addSubFolder("controllers");
        Folder library = app.addSubFolder("library");
        Folder migrations = app.addSubFolder("migrations");
        Folder models = app.addSubFolder("models");
        Folder views = app.addSubFolder("views");
        Folder cache = sourceFiles.addSubFolder("cache");
        Folder publicFolder = sourceFiles.addSubFolder("public");
        File htaccess = publicFolder.addFile(".htaccess");
        File htrouter = publicFolder.addFile(".htrouter.php");
        File indexHtml = publicFolder.addFile("index.html");
        Folder includePath = php_demo1.addSubFolder("Include Path");
        Folder remoteFiles = php_demo1.addSubFolder("Remote Files");

        php_demo1.printFolderTree();

        sourceFiles.removeSubFolder(app);

        System.out.println();
        php_demo1.printFolderTree();

        sourceFiles.removeSubFolder(publicFolder);

        System.out.println();
        php_demo1.printFolderTree();
    }
}
