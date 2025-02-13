package FileHandling;

import java.io.File;

public class TextFiles {

    //For Creating Folder
    public static void createFolder(String folderPath){
        File folder = new File(folderPath);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder Created: "+folderPath);
        }
    }

    //For Check if  Folder Exists
    public static boolean folderExists(String folderPath){
        File folder = new File(folderPath);
        return folder.exists();
    }

    //For Renaming Folder
    public static void renameFolder(String oldPath,String newPath){
        File oldFolder = new File(oldPath);
        File newFolder = new File(newPath);
       if(oldFolder.exists()){
           oldFolder.renameTo(newFolder);
           System.out.println("Folder Renamed to : " +newPath);
       }
    }
    //For Deleting the folder
    public static void deleteFolder(String folderPath){
        File folder = new File(folderPath);
        if(folder.exists())
        {
            for(File file:folder.listFiles()){
                file.delete();
            }
            folder.delete();
            System.out.println("Folder Deleted : " +folderPath);
        }
    }

    public static void main(String[] args) {

        String folderPath= "/Users/amit/IdeaProjects/FileHandlingInJava/myFiles";
        createFolder(folderPath);

        boolean folExists=folderExists(folderPath);
        System.out.println("Folder Exists: "+folExists);

        String newFolderPath="/Users/amit/IdeaProjects/FileHandlingInJava/myNewFiles";
        renameFolder(folderPath,newFolderPath);

        deleteFolder(newFolderPath);

    }
}
