import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AdressBook a1=new AdressBook();
//        AdressBook<Contact> a1 = new AdressBook<>();
        a1.adBook.add(new Contact("Akshita","Kullarni","Hyd","Telengana","Abc",123,111));
        a1.adBook.add(new Contact("Angira","Tiwari","Mirzapur","UP","Abc",123,111));
        a1.adBook.add(new Contact("Akshaya","Nalam","Guntur","AP","Abc",123,111));
        a1.adBook.add(new Contact("riya","bisht","dehradun","uttrakhand","abc",124,11));
        a1.adBook.add(new Contact("Deepa","Pandey","Haldwani","Uttrakhand","abc",123,111));
        a1.adBook.add(new Contact("Shuchita","Gupta","Guna","MP","a", 345,890));
        a1.adBook.add(new Contact("Dhanalaxmi","Musku","Hyd","Telangana","AC",123,444));
        a1.adBook.add(new Contact("Lakshita","Tak","Jaipur","Rajasthan","abc",133,10));
        a1.adBook.add(new Contact("Priya","Chintagunta","Rajahmundry","AndhraPradesh","xyz",123,111));
        a1.adBook.add(new Contact("Aakriti","Tiwari","Jhansi","Uttar pradesh","abc",145,414));
        a1.adBook.add(new Contact("Dhruv","Gupta","Alwar","Rajasthan","abc",154,424));
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
                case 1 -> a1.addContact(createContact());
                case 2 -> a1.display();
                case 3 -> a1.search();
                case 4 -> obj.printMigratedList();
                default -> System.out.println("Wrong");
            }
            System.out.println("Enter 0 to exit");
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