package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipulatingFiles {

    public static String filePath= "/Users/amit/IdeaProjects/FileHandlingInJava/MyFile.txt";
    public static String newFilePath= "/Users/amit/IdeaProjects/FileHandlingInJava/MyNewFile.txt";
    //Create a File
    public static void createFile(String filepath) throws IOException {
        File myObj=new File(filepath);
        if(myObj.createNewFile()){
            System.out.println("File created : " +myObj.getName());
        }else{
            System.out.println("File Already Exists");
        }
    }

    //Writing a File
    public static void writeFile(String filepath) throws IOException {
        FileWriter myWriter = new FileWriter(filepath);
        myWriter.write("Welcome to ruby file");
        myWriter.close();
        System.out.println("Successfully Wrote to the File!!");
    }

    //Reading a File
    public static void readingFile(String filepath) throws IOException {
        File myObj = new File(filepath);
        Scanner myReader= new Scanner(myObj);

        while(myReader.hasNextLine())
        {
            String data=myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();

    }

    //Renaming a File
    public static void renamingFile(String oldFilePath,String newFilePath) throws IOException {
        File oldFile = new File(oldFilePath);
        File newFile = new File(newFilePath);
        if(oldFile.renameTo(newFile)){
            System.out.println("File is Renamed");
        }else{
            System.out.println("File cannot be Renamed");
        }
    }

    //Deleting a File
    public static void deletingFile(String newFilePath) throws IOException {
        File myObj = new File(newFilePath);
        if(myObj.delete()){
            System.out.println("File is Deleted : " +myObj.getName());
        }else{
            System.out.println("File cannot be Deleted!!");
        }
    }

    public static void main(String[] args) throws IOException {

        createFile(filePath);
        writeFile(filePath);
        readingFile(filePath);
        renamingFile(filePath,newFilePath);
        deletingFile(newFilePath);


    }
}
