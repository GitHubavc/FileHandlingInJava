package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CsvFiles {
    public static void main(String[] args) throws IOException {
        String csvFileName="/Users/amit/IdeaProjects/FileHandlingInJava/data/MyCsv1.csv";
        FileWriter writer= new FileWriter(csvFileName);
        writer.append("Name,Age,Email\n");//header
        writer.append("Tom,14,tom@email.com\n");
        writer.append("Smith,30,smith@email.com\n");
        writer.append("Ted,24,ted@email.com\n");
        writer.close();
        System.out.println("CSV created at: "+csvFileName);
    }
}
