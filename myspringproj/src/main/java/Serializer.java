import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by jpi1 on 7/21/2017.
 */
public class Serializer {

    public static void main (String argv[]) throws IOException
    {
        person p = new person(1, "abc");

        FileOutputStream outFile = new FileOutputStream("C:\\o.dat");
        ObjectOutputStream objStream = new ObjectOutputStream(outFile);
        objStream.writeObject(p);

        outFile.close();
        objStream.close();

    }
}
