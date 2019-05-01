import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by jpi1 on 6/27/2017.
 */
public class App {
    public static void main(String[] args) throws IOException, IndexOutOfBoundsException
    {
//        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml" );
////        person p = new person("test","test");
////        p.speak();
//        person p = (person)context.getBean("p");
//        p.speak();
//        System.out.println(p.toString());
//
        FileWriter w = null;
        BufferedReader r = null;
        try
        {
            w = new FileWriter("C:\\out.txt");
            w.write("test");
        }
        catch(IOException e)
        {
            System.out.println("Exception occur");

        }
        finally
        {
            w.close();
        }

        r = new BufferedReader(new FileReader("C:\\out.txt"));
        System.out.println((char)r.read());
        System.out.println(r.readLine());


    }
}
