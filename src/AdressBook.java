import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdressBook {
    List<Contact> adBook=new ArrayList<>();

    public void display(){
        System.out.println(adBook);
    }
     void createContact(AdressBook a1){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstName");;
        String firstname=sc.next();

        System.out.println("Enter the lastName");;
        String lastname=sc.next();

        System.out.println("Enter the city");;
        String city=sc.next();

        System.out.println("Enter the state");;
        String state=sc.next();

        System.out.println("Enter the mail");;
        String email=sc.next();

        System.out.println("Enter the Phone");;
        int phone=sc.nextInt();

        System.out.println("Enter the Zip");;
        int zip=sc.nextInt();
        Contact c1=new Contact(firstname,lastname,city,state,email,phone,zip);
        adBook.add(c1);

    }

}
