package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {
    static String filePath= "/Users/amit/IdeaProjects/FileHandlingInJava/data/newFile.properties";

    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream file = new FileInputStream(filePath);
        properties.load(file);
        file.close();

        //Read data
        String name=properties.getProperty("name");
        String age=properties.getProperty("age");
        String email=properties.getProperty("email");
        System.out.println(age+" "+name+" "+email);

        //capture all properties 1
        Set<String> keys= properties.stringPropertyNames();
        System.out.println(keys);

        //capture all properties 2
        Set<Object>  keys2=properties.keySet();
        System.out.println(keys2);

        //capture all the values
        Collection<Object> values=properties.values();
        System.out.println(values);
        values.stream().forEach(s-> System.out.println(s+" "));

        //Read all prop and values
        for(String key:properties.stringPropertyNames()){
            System.out.println(key+" " +properties.getProperty(key));
        }



    }



}
