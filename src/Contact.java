import java.util.Scanner;

public class Contact implements Dummy1{
    String firstName;
    String lastName;
    String city;
    String state;
    String mail;
    int phone;
    int zip;

    public Contact(String firstName, String lastName, String city, String state, String mail, int phone, int zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.mail = mail;
        this.phone = phone;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", mail='" + mail + '\'' +
                ", phone=" + phone +
                ", zip=" + zip +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }
}
