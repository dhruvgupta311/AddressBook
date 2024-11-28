import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AdressBook a1=new AdressBook();
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("Welcome");
        do{
            System.out.println("Enter 1 to create contact");
            int input=sc.nextInt();
            switch(input){
                case 1-> createContact(a1);
                default -> System.out.println("Wrong");
            }
            System.out.println("Enter 0 to exit");
            i=sc.nextInt();
        }while(i==0);
        System.out.println("Thank you");
    }
    static void createContact(AdressBook a1){
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
        a1.addContact(c1);

    }

}