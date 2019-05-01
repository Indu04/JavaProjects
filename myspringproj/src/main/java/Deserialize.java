import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by jpi1 on 7/21/2017.
 */
public class Deserialize {

    public static  void main(String argv[]) throws IOException, ClassNotFoundException
    {
        person p;

        FileInputStream fin = new FileInputStream("C:\\o.dat");
        ObjectInputStream oin = new ObjectInputStream(fin);

        p = (person)oin.readObject();
        oin.close();
        fin.close();

        System.out.println(p.toString());

    }

}
