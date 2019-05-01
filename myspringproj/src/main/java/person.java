/**
 * Created by jpi1 on 6/27/2017.
 */
import java.io.Serializable;

public class person implements Serializable
{
    private int id;
    private String name;
    private int taxId;

    public person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void speak()
    {
        System.out.println("Person speaking");
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", taxId=" + taxId +
                '}';
    }
}
