package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFiles {

    public static String filePath="/Users/amit/IdeaProjects/FileHandlingInJava/data/newFile.properties";

    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.setProperty("name","Amit");
        properties.setProperty("email","abc@email.com");
        properties.setProperty("age","35");
        FileOutputStream file = new FileOutputStream(filePath);
        properties.store(file,"Sample data in properties file");
        file.close();
        System.out.println("Properties have been written into  "+filePath);


    }
}
