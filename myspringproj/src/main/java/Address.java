/**
 * Created by jpi1 on 7/11/2017.
 */
public class Address
{
    private String street;
    private String pin;

    public Address(String street, String pin)
    {
        this.street = street;
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", pin='" + pin + '\'' +
                '}';
    }
}
