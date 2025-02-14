package FileHandling;

import java.io.*;
import java.util.Scanner;

public class CsvFileReader {
    static String csvLocation="/Users/amit/IdeaProjects/FileHandlingInJava/data/MyCsv1.csv";
    public static void main(String[] args) throws IOException {
        //using scanner

        File file = new File(csvLocation);
        Scanner sc= new Scanner(file);
        sc.useDelimiter(",");
        while(sc.hasNext()){
            System.out.print(sc.next()+"\t");
        }
        sc.close();

        //using java split
        FileReader reader= new FileReader(csvLocation);
        BufferedReader bfr=new BufferedReader(reader);
        String line;
        while((line=bfr.readLine())!=null){
            String[] data=line.split(",");
            for(String value:data){
                System.out.println(value+ "\t");
            }
            System.out.println();


        }

    }

}
