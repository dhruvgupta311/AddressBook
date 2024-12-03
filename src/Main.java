import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AdressBook a1=new AdressBook();
        LinkedListDemo<BussinessContact> obj = new LinkedListDemo<>();
        Scanner sc=new Scanner(System.in);
        int i=1;
        System.out.println("Welcome");
        do{
            System.out.println("Enter 1 to create contact");
            System.out.println("Enter 2 to display contact");
            System.out.println("Enter 3 to add all adbooklist to linked list ");
            System.out.println("Enter 4 to display Linked List");
            int input=sc.nextInt();
            switch(input){
                case 1-> a1.addContact(createBussinessContact());
                case 2-> a1.display();
                case 3-> obj.migrate(a1);
                case 4-> obj.printMigratedList();
                default -> System.out.println("Wrong");
            }

            System.out.println("Enter 0 to exit");2
            i=sc.nextInt();
        }while(i!=0);
        System.out.println("Thank you");
        sc.close();
    }

    public static Contact createContact(){
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
        return c1;

    }

    public static BussinessContact createBussinessContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Company name ");
        String cname = sc.next();
        System.out.println("Employee Name");
        String ename = sc.next();
        System.out.println("Employee mail");
        String bmail= sc.next();

        BussinessContact b1 = new BussinessContact(cname,ename,bmail);
        return b1;


    }


}